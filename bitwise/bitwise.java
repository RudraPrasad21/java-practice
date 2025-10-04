package bitwise;

import java.sql.SQLOutput;

public class bitwise {
    public static void main (String[] args) {
        int a = 0b1010; // we can take binary form in int datatype
        int b = 0b0110;
        int x= 0b0011;
        int c,d,e,f,g,h,i,j;
        c = a & b;
        d = a | b;
        e = a ^ b;
        f=a>>1;
        g=a>>>1;
        h=x<<2;
        j =~x;

        System.out.println(c); //and operator
        System.out.println(d); // or
        System.out.println(e); // xor
        System.out.println(f); //
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);

        System.out.println(String.format("%s",Integer.toBinaryString(x))); // print in binary form
        System.out.printf("%s",Integer.toBinaryString(g));

        }}