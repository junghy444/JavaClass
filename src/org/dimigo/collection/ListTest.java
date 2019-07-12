package org.dimigo.collection;

import org.dimigo.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // 1. List계열 : ArrayList
//        List list = new ArrayList();
//        list.add("정하영");
//        list.add(100);
//        list.add(new Dog("멍멍이"));
//        String s = (String) list.get(0);

        // 제네릭(Generic)
        List<String> list = new ArrayList<>();
        list.add("사과");

        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");   // 추가, 뒤에 값들은 자동으로 뒤로 밀림
        list.set(2, "바나나");               // 교체
        printList(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        list.remove(0);              // 삭제, 뒤에 값들은 자동으로 앞으로 땅겨짐
        printList(list);

        list.remove("딸기");
        printList(list);

        list.clear();                     // 전체 삭제
        printList(list);

    }

    private static void printList(List<String> list) {
        for(String value : list){
            System.out.print(value + "|");
        }
        System.out.println();
    }
}
