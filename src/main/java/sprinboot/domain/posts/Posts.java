package sprinboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor// 기본 생성자 자동 추가
@Entity //테이블와 링크될 클래스임을 명시한다. 언더스코어 네이밍으로 테이블 이름을 매칭
public class Posts {

    @Id //해당 테이블의 PK 필드를 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙을 명시. 스프링 부트 2.0부터는 GenerationType을 Identity로 해줘야 한다.
    private Long id;

    @Column(length = 500, nullable = false) //테이블의 칼럼을 나타낸다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder//해당 클래스의 빌더 패턴 클래스를 생성. 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함된다.
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
