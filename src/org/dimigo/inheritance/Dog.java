package org.dimigo.inheritance;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    // Dog에만 있는 메소드 추가
    public void wag() {
        System.out.println(name + "이/가 꼬리를 흔든다.");
    }
}
