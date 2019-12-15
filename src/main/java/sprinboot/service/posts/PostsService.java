package sprinboot.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sprinboot.domain.posts.Posts;
import sprinboot.domain.posts.PostsRepository;
import sprinboot.web.dto.PostsResponseDto;
import sprinboot.web.dto.PostsSaveRequestDto;
import sprinboot.web.dto.PostsUpdateRequestDto;

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

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById (Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("no such use id = " + id));
        return new PostsResponseDto(entity);
    }
}
