package profiles;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MainService {
    private final DataSource dataSource;

//    @Scheduled(fixedDelay = 500)
    public void work(){
        dataSource.doX();
    }
}
