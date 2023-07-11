package bai3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class Shape {
    private float PI=3.14F;
    private float radius;
    private float length;
    private float width;
    public abstract void input();
    public abstract void area(); //tinh dien tich
    public abstract void cirumference(); //tinh chu vi

}
