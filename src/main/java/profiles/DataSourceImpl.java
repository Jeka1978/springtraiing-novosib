package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile("PROD")
public class DataSourceImpl implements DataSource {
    @Override
    public void doX() {
        System.out.println("prod X");
    }
}
