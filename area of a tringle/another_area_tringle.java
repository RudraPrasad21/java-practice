import java.lang.Math;
import java.util.Scanner;

public class another_area_tringle{
    public static void main(String...args){
        int a,b,c;
        float s;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a,b,c ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        s=a+b+c/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);





    }
}