package quest_13_design_pattern_singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.openAccount(9001);

        Transactions.transactions();

        Transactions.balance();
    }
}