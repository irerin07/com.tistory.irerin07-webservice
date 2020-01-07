package sprinboot.service.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sprinboot.domain.user.UserRepository;
import sprinboot.web.dto.PostsSaveRequestDto;
import sprinboot.web.dto.UserSaveRequestDto;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long save(UserSaveRequestDto requestDto){

        return userRepository.save(requestDto.toEntity()).getId();
    }

}
