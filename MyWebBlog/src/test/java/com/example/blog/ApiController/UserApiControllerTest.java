package com.example.blog.ApiController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.blog.Model.user;
import com.example.blog.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserApiController.class)
public class UserApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void testJoinProcApi() throws Exception {
    	// Mock 객체 생성(허수아비 객체)
        com.example.blog.Model.user user = new com.example.blog.Model.user();
        user.setUsername("bbc");
        user.setPassword("1234");
        user.setEmail("bbc@naver.com");
        user.setRoletype(null);
        
        /*
          ajax -> "/api/user/joinProc"로 넘기는 상황설정.
          
          1. ajax로 넘길 당시, user의 상태
          data:JSON.stringify(data)// JSON으로 직렬화.
          contentType:"application/json; charset=utf-8"// application/json으로 설정.
          
          2.
          
         */
        mockMvc.perform(post("/api/user/joinProc")
                .contentType("application/json")
                .content(asJsonString(user))) // user 객체 -> json String
                .andExpect(status().isOk()); // 수행 성공 -> OK!
    }

    //convert an object to JSON string (you can use libraries like Jackson)
    private static String asJsonString(user obj) {
        // JAVA Object -> JSON string
    	ObjectMapper mapper = new ObjectMapper();
    	try {
			String jsonInString = mapper.writeValueAsString(obj);
			return "jsonInString";
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
}