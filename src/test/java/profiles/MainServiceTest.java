package profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Config.class)
@ActiveProfiles("DEV")
public class MainServiceTest {
    @Autowired
    MainService mainService;

    @Test
    public void work() throws Exception {
        mainService.work();
    }

}