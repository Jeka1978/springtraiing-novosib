package quolifiers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static quolifiers.DbType.MONGO;
import static quolifiers.DbType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@Service

public class MyServiceImpl implements MyService {
    private final Dao backupDao;
    private final Dao mainDao;

    public MyServiceImpl(@GoldenCowRepo(MONGO) Dao mainDao,
                         @GoldenCowRepo(ORACLE) Dao backupDao) {
        this.mainDao = mainDao;
        this.backupDao = backupDao;
    }


    @Override
    @Scheduled(fixedDelay = 1000)
    public void doWork() {
        System.out.println("working...");
        mainDao.crud();
    }

    @Override
    @Scheduled(fixedDelay = 3000)
    public void backup() {
        System.out.println("backuping...");
        backupDao.crud();
    }
}





