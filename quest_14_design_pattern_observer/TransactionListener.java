package quest_14_design_pattern_observer;

public interface TransactionListener {

    void onComplete(Bank account);
}
