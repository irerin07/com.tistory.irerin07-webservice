package sprinboot.web;

import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sprinboot.domain.user.User;
import sprinboot.service.users.UserService;
import sprinboot.web.dto.PostsSaveRequestDto;
import sprinboot.web.dto.UserJoinFormDto;
import sprinboot.web.dto.UserSaveRequestDto;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public String join(@RequestBody UserSaveRequestDto userSaveRequestDto) {
        userService.save(userSaveRequestDto);

        return "/signin";
    }
}
