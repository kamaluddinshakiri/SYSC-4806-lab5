package webAPP;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class TestingWebApplicationTest {

    @Autowired
    private MockMvc mock;
    @Autowired

    @Test
    public void nameTest() throws Exception {
        this.mock.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Kamal")));
    }
    @Test
    public void addressTest() throws Exception {
        this.mock.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Kamal house")));
    }
    @Test
    public void nameTest2() throws Exception {
        this.mock.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Ahmed")));
    }
    @Test
    public void addressTest2() throws Exception {
        this.mock.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Ahmed house")));
    }
}