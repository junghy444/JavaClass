package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // for문
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d*%d=%d\t", i, j, i*j);
            }
            System.out.println();
        }

        // for-each문
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        for (int data: arr) System.out.print(data + " ");
        System.out.println();

        // String타입 배열로 foreach문
        String[] idol = {"성규", "동우", "우현", "성열", "명수", "성종"};
        for(String member: idol) System.out.print(member + " ");
        System.out.println();

        // do~while문
        // 메뉴처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. 트와이스");
            System.out.println("2. 블랙핑크");
            System.out.println("3. 아이즈원");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("트와이스 선택");
                    break;
                case 2:
                    System.out.println("블랙핑크 선택");
                    break;
                case 3:
                    System.out.println("아이즈원 선택");
                    break;
                case 9:
                    System.out.println("Bye");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴입니다");
                    break;
            }
        } while(menu != 9);
    }
}
