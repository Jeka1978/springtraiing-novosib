package quolifiers;

import lombok.SneakyThrows;

import static quolifiers.DbType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@GoldenCowRepo(ORACLE)
public class BackupDao implements Dao {
    @Override
    @SneakyThrows
    public void crud() {
        Thread.sleep(50);
        System.out.println("saving to Oracle");
    }
}
