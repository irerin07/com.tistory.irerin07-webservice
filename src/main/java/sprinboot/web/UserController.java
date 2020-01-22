package sprinboot.web;

import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import sprinboot.domain.user.User;
import sprinboot.service.users.UserService;
import sprinboot.web.dto.PostsSaveRequestDto;
import sprinboot.web.dto.UserJoinFormDto;
import sprinboot.web.dto.UserSaveRequestDto;

import javax.validation.Valid;
import java.util.Optional;

@RequestMapping("/users")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public Long join(@RequestBody UserSaveRequestDto userSaveRequestDto) {
        long id = userService.save(userSaveRequestDto);
        return id;
    }

}
