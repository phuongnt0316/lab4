package bai3;

import java.util.Scanner;

public class Rectangle extends Shape{
    @Override
    public void input() {
        System.out.println("input: ");
        System.out.println("length: ");
        Scanner sc=new Scanner(System.in);
        super.setLength(Float.parseFloat(sc.nextLine()));
        System.out.println("width: ");
        super.setWidth(Float.parseFloat(sc.nextLine()));

    }

    @Override
    public void area() {
        float area= (float) (2*(super.getLength()+super.getWidth()));
        System.out.println("Area of rectangle: "+area);

    }

    @Override
    public void cirumference() {
        float cir= (float) (super.getLength()*super.getWidth());
        System.out.println("Cirumference of rectangle: "+cir);

    }
}
