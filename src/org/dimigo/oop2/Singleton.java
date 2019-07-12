package org.dimigo.oop2;

public class Singleton {
    // 1번 패턴
    private static Singleton instance = new Singleton();

    private Singleton(){ }

    public static Singleton getInstance(){
        return instance;
    }

    // 2번 패턴
    public static synchronized Singleton getInstance2(){    // 필요할 때, 메소드 호출 --> 객체 생성
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }



}
