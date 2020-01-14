package sprinboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

//    @PostMapping("/join")
//    public String join(@Valid UserJoinForm userJoinForm, BindingResult bindingResult, HttpSession session) {
//
//        if (bindingResult.hasErrors()) {
//            return "users/joinform";
//        }
//
//        if (!userJoinForm.getPasswd().equals(userJoinForm.getPasswd2())) {
//            FieldError error = new FieldError("userJoinForm", "passwd2",
//                    "비밀번호가 일치하지 않습니다.");
//            bindingResult.addError(error);
//            return "users/joinform";
//        }
//
//        User userByEmail = userService.getUserByEmail(userJoinForm.getEmail());
//        if (userByEmail != null) {
//            FieldError error = new FieldError("userJoinForm", "email", "중복된 이메일이 있습니다");
//            bindingResult.addError(error);
//            return "users/joinform";
//        }
//
//        User user = new User();
//        BeanUtils.copyProperties(userJoinForm, user);
//
//
//        // 비밀번호 암호화
//        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//        user.setPasswd(passwordEncoder.encode(user.getPasswd()));
//
//        // 권한 부여
//        Role userRole = userService.getUserRole("USER");
//        user.addUserRole(userRole);
//
//        // insert
//        userService.addUser(user);
//
//
//        return "users/login";
//    }
}
