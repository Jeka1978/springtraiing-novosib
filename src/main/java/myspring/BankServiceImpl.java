package myspring;

/**
 * @author Evgeny Borisov
 */
public class BankServiceImpl implements BankService {
    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("Zolotaya Corona the best");
    }
}
