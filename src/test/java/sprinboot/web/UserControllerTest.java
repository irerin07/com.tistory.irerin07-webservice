//package sprinboot.web;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import sprinboot.domain.posts.Posts;
//import sprinboot.domain.posts.PostsRepository;
//import sprinboot.domain.user.User;
//import sprinboot.domain.user.UserRepository;
//import sprinboot.web.dto.UserSaveRequestDto;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class UserControllerTest {
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private WebApplicationContext context;
//
//    private MockMvc mvc;
//
//    @Before
//    public void setup() {
//        mvc = MockMvcBuilders
//                .webAppContextSetup(context)
//                .apply(springSecurity())
//                .build();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        userRepository.deleteAll();
//    }
//
//    @Test
//    public void USER_등록() throws Exception {
//        //given
//        String email = "test@gmail.com";
//        String passwd = "123456";
//        String name = "test";
//        String picture = "none";
//
//        UserSaveRequestDto requestDto = UserSaveRequestDto.builder()
//                .email(email)
//                .name(name)
//                .picture(picture)
//                .passwd(passwd)
//                .build();
//
//        String url = "http://localhost:" + port + "/users/join";
//
//        //when
//        mvc.perform(post(url)
//                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                .content(new ObjectMapper().writeValueAsString(requestDto)))
//                .andExpect(status().isOk());
//
//        //then
//        Optional<User> user = userRepository.findByEmail(email);
//        assertThat(user.get().getEmail()).isEqualTo(email);
////        assertThat(all.get(0).getContent()).isEqualTo(content);
//
//    }
//}
