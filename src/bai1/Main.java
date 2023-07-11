package bai1;

public class Main {
    public static int cong(int a,int b){
        return a+b;
    }
    public static float cong(float a, int b){
        return  a+b;
    }
    public static int cong(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
//        Button button=new Button();
//        button.setTop("Button Top");
//        button.setLeft("Button Left");
//        ListBox listbox=new ListBox();
//        listbox.setTop("ListBox Top");
//        listbox.setLeft("ListBox Left");
//        listbox.setContent("ListBox content");
//        button.drawWindow();
//        listbox.drawWindow();
        System.out.println("cong int "+(cong(1,2)));
        System.out.println("cong float "+(cong(1.2f,2)));
        System.out.println("cong int int int "+(cong(1,2,3)));
    }
}
