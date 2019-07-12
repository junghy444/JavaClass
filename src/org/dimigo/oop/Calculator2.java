package org.dimigo.oop;

public class Calculator2 {
    private boolean powerFlag;
    public static double PI = 3.141592;

    public void powerOn(){
        if(!this.powerFlag){
            System.out.println("전원을 켭니다.");
            this.powerFlag = true;
        }
    }
    public void powerOff(){
        if(this.powerFlag) {
            System.out.println("전원을 끕니다.");
            this.powerFlag = false;
        }
    }

    public static int add(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 + num2;
    }
    public static int sub(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 - num2;
    }
    public static int mul(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 * num2;
    }
    public static double div(int num1, int num2, Calculator2 c){
        c.powerOn();
        return (double)num1 / num2;
    }


}
