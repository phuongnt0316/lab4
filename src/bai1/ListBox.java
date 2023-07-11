package bai1;

public class ListBox extends Window{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void drawWindow() {
        System.out.printf("ListBox: %s -%s -%s ",content,super.getTop(),super.getLeft());
    }
}
