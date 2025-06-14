import java.util.Scanner;

public class Quadratic {
    public static void main(String...args){
        int a,b,c;
        double r1,r2;
        System.out.println("Enter the value of a,b,c");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        r1=(-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println(r1);
        double a1 = (b * b) - (4 * a * c);
        r2=(-b-(Math.sqrt(a1)))/(2*a);
        System.out.println(r1);

        System.out.println("So the roots are "+r1+" "+r2);

    }
}