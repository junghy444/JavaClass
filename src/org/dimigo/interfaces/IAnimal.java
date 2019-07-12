package org.dimigo.interfaces;

public interface IAnimal {
    // 상수 선언
    public static final String FARM_NAME = "디미 동물농장";
    String FARM_NAME2 = "디미 동물농장";      // 자동으로 public static final

    // 모든 메소드는 추상메소드 (JDK 7)
    void bark();                // 자동으로 public abstract

    // 디폴트 메소드 (JDK 8)
    default void eat(){
        System.out.println("냠냠");
    }

    default void sleep(){
        System.out.println("쿨쿨");
    }

    // static 메소드 (자동으로 public이 붙음)
    static void welcome(){
        System.out.println(FARM_NAME + "에 오신걸 환영합니다");
    }
}
