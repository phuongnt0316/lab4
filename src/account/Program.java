package account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean flag=true;
        int f;
        SavingAccount sv=new SavingAccount(600);
        while (flag){
            System.out.println("Menu");
            System.out.println("1.Van tin");
            System.out.println("2.Gui tien");
            System.out.println("3.Rut tien");
            System.out.println("4.Exit");
            Scanner sc= new Scanner(System.in);
            f=Integer.parseInt(sc.nextLine());
            switch (f){
                case 1:
                    System.out.println("So tien trong tai khoan: "+sv.getBalance());
                    break;
                case 2:
                    System.out.println("Nhap so tien can gui: ");




            }
        }
    }
}
