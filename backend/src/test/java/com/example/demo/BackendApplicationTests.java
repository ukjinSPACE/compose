package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

/**
 * 빌드시 단위 테스트가 진행됨
 * db 연동 테스트가 진행, 만약 도커쪽 디비와 연동이 
 * 타이밍적으로 싱크가 않맞으면 오류 발생할수 있음
 * -> 편의상 테스트 어노테이션 변경 WebMvcTest
 */
@WebMvcTest(HomeController.class) // 테스트 대상을 한정
// @SpringBootTest
class BackendApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserService userService;
	
	@Test
	void contextLoads() {
		// 여기서 단위 테스트 진행하면 된다
	}	

}
