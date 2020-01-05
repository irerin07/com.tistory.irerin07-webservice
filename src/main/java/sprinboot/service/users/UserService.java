package sprinboot.service.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sprinboot.domain.user.UserRepository;
import sprinboot.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

}
