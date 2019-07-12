package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        // int 타입 2차원 배열
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][2] = 100;
        intArr[1][1] = 100;
        printArray(intArr);

        // String 타입 2차원 배열
//        String[][] strArr = new String[2][];
//        strArr[0] = new String[] {"C", "C++", "Java"};
//        strArr[1] = new String[] {"C#", "PHP"};
        String[][] strArr = {
                {"C", "C++", "Java"},
                {"C#","PHP"}
        };

        String[][] strArr2 = new String[][]{
                new String[] {"C", "C++", "Java"},
                new String[] {"C#","PHP"}
        };
        String[][] strArr3 = new String[][] {
                {"C", "C++", "Java"},
                {"C#","PHP"}
        };

        printArray(strArr);


    }

    private static void printArray(int[][] intArr) {
//        for(int i = 0 ; i < intArr.length; i++){
//            for(int j = 0; j < intArr[i].length; j++){
//                System.out.print(intArr[i][j] + " | ");
//            }
//            System.out.println();
//        }
//        System.out.println();
        for(int[] arr : intArr){
            for(int value : arr){
                System.out.print(value + " | ");
            }
            System.out.println();
        }
    }

    public static void printArray(String[][] strArr) {
        for(String[] arr : strArr){
            for(String value : arr){
                System.out.print(value + " | ");
            }
            System.out.println();
        }
    }
}
