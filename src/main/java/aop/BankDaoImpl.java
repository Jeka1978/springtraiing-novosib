package aop;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class BankDaoImpl implements BankDao {
    @Override
    public void transfer() {
        System.out.println("transfering...");
        throw new DbException("fire all DBA!!!");
    }
}
