package account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int money){
        balance+=money;
        System.out.println("So du: "+balance);

    }
    public void withDraw(int money){
        if(money>balance){
            System.out.println("Tai khoan khong du tien");
        }else {
            balance=balance-money;
            System.out.println("So tien con lai: "+balance);
        }
    }
    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account account=new Account();
        account.setBalance(300);
        account.deposit(200);
        account.withDraw(600);
        account.withDraw(200);
    }
}
