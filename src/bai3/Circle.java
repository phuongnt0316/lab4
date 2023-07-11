package bai3;

import java.util.Scanner;

public class Circle extends Shape{
    @Override
    public void input() {
        System.out.println("input radius: ");
        Scanner sc=new Scanner(System.in);
        super.setRadius(Float.parseFloat(sc.nextLine()));

           }

    @Override
    public void area() {
        float area= (float) (super.getPI()*super.getRadius()*super.getRadius());
        System.out.println("Area of circle: "+area);

    }

    @Override
    public void cirumference() {
        float cirum=2*super.getPI()*super.getRadius();
        System.out.println("Cirumference of circle: "+cirum);

    }


}
