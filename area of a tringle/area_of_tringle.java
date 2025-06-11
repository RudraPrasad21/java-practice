import  java.util.*;

public class area_of_tringle{
public static  void main(String...args){
    float b,h;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a and b ");
    b= sc.nextInt(); h= sc.nextInt();
    float area = 1f/2f*(b*h);

    System.out.println(area);
}
}