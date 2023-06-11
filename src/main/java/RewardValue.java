import java.math.BigDecimal;

public class RewardValue {
    public double cash;
    public int miles;

    public RewardValue (){}
    public RewardValue (double cash){

    }
    public RewardValue (int miles){

    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCashValue(){
        double cashValue = (miles / 0.00305);
        return cashValue;
    }
    public double getMilesValue(){
        double milesValue = (cash * 0.00305);
        return milesValue;
    }
}
