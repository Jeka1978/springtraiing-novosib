package aop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {
    private final BankDao bankDao;
    @Override
    public void work() {
        System.out.println("working...");
        bankDao.transfer();
    }
}
