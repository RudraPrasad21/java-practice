class Literal {
    public static void main(String[] args) {
        byte b1= 10;
        byte b2= 0b1010;
        byte b3 = 012;
        byte b4= 0XA;

        long l=127_977_678_567L;

        float f=12.6f;
        double d=13_234_232.688;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println(l);

        System.out.println(f);
        System.out.println(d);
    }
}

// we cam usw "_" in between number . it is use for onlyreadeble purpose . it does not show on output.     for example here i use in double,long.
// note ..... "_" not use on last of on data.