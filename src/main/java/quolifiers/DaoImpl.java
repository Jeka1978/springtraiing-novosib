package quolifiers;

import static quolifiers.DbType.MONGO;

/**
 * @author Evgeny Borisov
 */

@GoldenCowRepo(MONGO)
public class DaoImpl implements Dao {
    @Override
    public void crud() {
        System.out.println("Saving to Mongo");
    }
}
