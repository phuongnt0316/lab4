package bai1;

public class Window {
    String top;
    String left;

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public void drawWindow(){
        System.out.println("Window:"+top+"-"+left);
    }
}
