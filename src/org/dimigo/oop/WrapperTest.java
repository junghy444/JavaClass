package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper 클래스 : Primitive Type을 Wrapping 해주는 클래스
        // 왜 쓸까? 클래스의 메소드를 활용하기 위해
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));

        // Boxing (Primitive Type -> Wrapper 객체)
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        Double d1 = Double.valueOf(3.14);

        // Unboxing (Wrapper 객체 -> Primitive Type)
        int r1 = i1.intValue();
        double r2 = d1.doubleValue();

        // 문자열 -> 해당되는 Primitive Type
        int r3 = Integer.parseInt("300");
        double r4 = Double.parseDouble("3.14");

        // 100 + 200 = 300
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d", a1, a2, a1 + a2);
        System.out.println();

        Integer obj1 = new Integer(1000);
        Integer obj2 = new Integer(2000);
        System.out.println(obj1 + obj2);

        Integer a = 1000;       //Autoboxing
        int b = a + 100;        //Autounboxing

        // Autoboxing, Autounboxing이 총 몇 번 일어나고 있나>
        Integer c = 10;         // Autoboxing : 1
        Integer d = c + 10;     // Autounboxing : 1, Autoboxing : 1
        Integer result = c + d; // Autounboxing : 2, Autoboxing : 1


    }

}
