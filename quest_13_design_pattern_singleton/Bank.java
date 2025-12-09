package quest_13_design_pattern_singleton;

public class Bank {

    private int total;

    public Bank(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}