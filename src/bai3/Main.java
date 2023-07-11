package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Key: ");
        String key;
        Scanner sc=new Scanner(System.in);
        key=sc.nextLine();
        switch (key){
            case "circle":
                Circle circle=new Circle();
                circle.input();
                circle.area();
                circle.cirumference();
                break;
            case "rectangle":
                Rectangle rectangle=new Rectangle();
                rectangle.input();
                rectangle.area();
                rectangle.cirumference();
                break;
            default:
                System.out.println("Nhap lai!");
        }
    }
}
