package sprinboot.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sprinboot.domain.posts.PostsRepository;
import sprinboot.web.dto.PostsSaveRequestDto;

import javax.persistence.PostRemove;
import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
