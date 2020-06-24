package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {

  @Test
  public void testHomePage() throws Exception {
    HomeController controller = new HomeController();
    // 创建MockMvc实例
    MockMvc mockMvc = standaloneSetup(controller).build();
    // 执行get请求并设置期望得到的视图名称
    mockMvc.perform(get("/"))
           .andExpect(view().name("home"));
  }

}
