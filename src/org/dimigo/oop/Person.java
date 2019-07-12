package org.dimigo.oop;

public class Person {
    //private final String species = "포유류";
    private final String birthDt;
    private String name;
    // 상수, 보통 대문자로 씀
    private static final String SPECIES = "포유류";

    public Person(String birthDt, String name) {
        this.birthDt = birthDt;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "species='" + Person.SPECIES + '\'' +
                ", birthDt='" + birthDt + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020313", "정하영");
        Person p2 = new Person("20020304", "김주희");
        System.out.println(p1);
        System.out.println(p2);

        //p1.species = "파충류";
        System.out.println(Person.SPECIES);

    }

}
