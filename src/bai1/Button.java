package bai1;

public class Button extends Window{
    @Override
    public void drawWindow() {
        System.out.println("Button:"+super.getTop()+"-"+super.getLeft());
    }
}
