package bai4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student implements IPerson{
    List<StudentClass> list=new ArrayList<>();
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    class StudentClass{
        private String id;
        private String name;
        private int age;
    }

    @Override
    public void insert() {
        Scanner sc=new Scanner(System.in);
        StudentClass st=new StudentClass();
        System.out.println("ID:");
        st.setId(sc.nextLine());
        System.out.println("Name:");
        st.setName(sc.nextLine());
        System.out.println("Age:");
        st.setAge(Integer.parseInt(sc.nextLine()));
        list.add(st);
    }

    @Override
    public void delete() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ID can XOA:");
        String id=sc.nextLine();
        for(StudentClass item:list){
            if(item.getId().equals(id)){
                list.remove(item);
                System.out.println("After deleted");
                display();
            }
            else {
                System.out.println("Khong ton tai ID da nhap");
            }

        }



    }


    @Override
    public void update() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ID can SUA:");
        String id=sc.nextLine();
        int count=1;
        for(StudentClass item:list){
            count++;
            if(item.getId().equals(id)){
                System.out.println("Update name: ");
                item.setName(sc.nextLine());
                System.out.println("Update Age:");
                item.setAge(Integer.parseInt(sc.nextLine()));
                break;
            }
        }
        if(count> list.size()) {
            System.out.println("Khong ton tai ID da nhap");
        }
        display();



    }

    @Override
    public void display() {
        System.out.println("ID\t\tName\t\tAge");
        for (StudentClass item:list){
            System.out.println(item.getId()+"\t\t"+item.getName()+"\t\t"+item.getAge());

        }

    }

    public static void main(String[] args) {
        Student st=new Student();
        boolean flag=true;
        while (flag){
            System.out.println("---MENU---");
            System.out.println("1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Chon so 1-5");
            int i;
            Scanner sc=new Scanner(System.in);
            i=Integer.parseInt(sc.nextLine());
            switch (i){
                case 1:
                    st.insert();
                    break;
                case 2:
                    st.update();
                    break;
                case 3:
                    st.delete();
                    break;
                case 4:
                    st.display();
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhap lai!");
                    break;

            }
        }


    }
}
