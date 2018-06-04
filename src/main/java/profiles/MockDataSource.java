package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile("DEV")
public class MockDataSource implements DataSource {
    @Override
    public void doX() {
        System.out.println("dev X");
    }
}
