package account;

public class SavingAccount extends Account{
    float rate;

    public SavingAccount(int initialize, float rate) {
        super(initialize);
        this.rate = rate;
    }

    public SavingAccount(float rate) {
        this.rate = rate;
    }

    public void getInterest(){


    }
}
