package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울", "시흥", "광주", "안산"};

        System.out.println(Arrays.toString(src));

        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));

        // 배열 복사
        System.out.println(src == dest);
        System.out.println(Arrays.equals(src, dest));

        // 배열 정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        // 배열 검색 (정렬을 먼저 해야함)
        System.out.println(Arrays.binarySearch(dest, "고구마"));
    }
}
