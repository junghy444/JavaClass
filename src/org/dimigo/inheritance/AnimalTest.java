package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();       // Animal의 bark()

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.eat();
        d.sleep();
        d.bark();       // Animal의 bark()
        d.wag();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.eat();
        c.sleep();
        c.bark();       // Cat의 bark()
        c.scratch();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.bark();       // Tiger의 bark()
        t.hunt();


        //---------------------------//
        Animal[] animals = {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for(Animal value : animals){
            //System.out.println(value);
            //value.bark();
            doBark(value);
        }

        Animal a2 = new Cat("야옹이");
        a2.eat();
        a2.sleep();
        a2.bark();
        //a2.scratch();
        ((Cat) a2).scratch();

        //Dog d2 = (Dog) a2;

        Animal dog = new Dog("멍멍이");
        Animal cat = new Cat("야옹이");

        System.out.println(dog instanceof Dog); // true
        System.out.println(cat instanceof Cat); // true
        System.out.println(dog instanceof Cat); // false
        System.out.println(cat instanceof Dog); // false
        System.out.println(dog instanceof Animal); // true
        System.out.println(cat instanceof Animal); // true

        doBark(dog);
        doBark(cat);


    }

    private static void doBark(Animal animal) {
        if(animal instanceof Dog){
            ((Dog) animal).wag();
        }
        else if(animal instanceof Cat){
            ((Cat) animal).scratch();
        }
        System.out.println(animal);
        animal.bark();
    }


}
