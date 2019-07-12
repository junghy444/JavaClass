package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        // 산술연산자
        int a = 5, b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 2.5가 나오려면?
        System.out.println((double)a / b);
        System.out.println(1.0 * a / b);

//        System.out.println(a / 0);

        // 다른 타입 간의 계산
        int i = 10;
        double d = 3.14;
        int r = (int)(i + d);
        double r2 = i + d;
        System.out.printf("%d, %f\n", r, r2);

        short s1 = 1, s2 = 2;
        short r3 = (short)(s1 + s2);
        int r4 = s1 + s2;
        System.out.printf("%d, %d\n", r3, r4);

        // Short-Circuit
        boolean flag = true;

        if(flag || (10 / 0 == 0)) {
            System.out.println("OR 연산");
        }
        if(!flag && (10 / 0 == 0)){
            System.out.println("AND 연산");
        }

        // 문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 6;
        String name = "정하영";

        System.out.println(school + grade + ban + name);
        System.out.println(grade + ban + school + name);

        // '26디미고정하영'이 나오게 하려면?
        System.out.println(grade + (ban + school + name));
        System.out.println("" + grade + ban + school + name);

    }

}
