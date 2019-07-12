package org.dimigo.oop;

public class Calculator {

    /* 인스턴스 필드 */
    // static 없는 필드
    // 객체를 만들어야지만 쓸 수 있다
    // 'new 객체' 형식으로 객체화 해야 함
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator(){ }
    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    /* 인스턴스 메소드 */
    // static 없는 필드
    // 객체를 만들어야지만 쓸 수 있다, 객체 없이 바로 호출 x
    // '객체.메소드' 형식으로 호출
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

    public int add(){
        this.powerOn();
        return this.num1 + this.num2;
    }
    public int sub(){
        this.powerOn();
        return this.num1 - this.num2;
    }
    public int mul(){
        this.powerOn();
        return this.num1 * this.num2;
    }
    public double div(){
        this.powerOn();
        return (double)this.num1 / this.num2;
    }


}
