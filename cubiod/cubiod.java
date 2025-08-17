import java.util.Scanner;

public class cubiod {
    public static void main(String...args){
        int length,breadth,height;
        int volume , totalarea;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length , breadth and height  ");
        length= sc.nextInt(); breadth=sc.nextInt();
        height=sc.nextInt();
        volume = length*breadth*height;
        System.out.println(volume);

        System.out.println("total Area ");
        int front_back = length*height;
        int right_left = breadth*height;
        int top_bottom = length*breadth;
        totalarea =2*(front_back+right_left+top_bottom);
        System.out.println("so the total area is :"+totalarea);



    }
}