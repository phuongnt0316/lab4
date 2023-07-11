package account;

public class CheckAccount extends Account{
    int FeeTransfer;

    @Override
    public void deposit(int money) {
        super.deposit(money);
        System.out.println("Phi dich vu: "+this.FeeTransfer);
        super.setBalance(super.getBalance()-FeeTransfer);
        System.out.println("So du: "+super.getBalance());
    }

    public CheckAccount(int balance, int feeTransfer) {
        super(balance);
        FeeTransfer = feeTransfer;
    }

    public CheckAccount(int feeTransfer) {
        FeeTransfer = feeTransfer;
    }

    @Override
    public void withDraw(int money) {
        super.withDraw(money);
        System.out.println("Phi dich vu: "+this.FeeTransfer);
        super.setBalance(super.getBalance()-FeeTransfer);
        System.out.println("So du: "+super.getBalance());
    }
}
