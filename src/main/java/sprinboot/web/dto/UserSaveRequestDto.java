package sprinboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import sprinboot.domain.posts.Posts;
import sprinboot.domain.user.User;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    private String email;
    private String passwd;
    private String name;
    private String picture;

    @Builder
    public UserSaveRequestDto(String email, String passwd, String name, String picture){
        this.email = email;
        this.passwd = passwd;
        this.name = name;
        this.picture = picture;
    }

    public User toEntity() {
        return User.builder()
                .email(email)
                .passwd(passwd)
                .name(name)
                .build();
    }
}
