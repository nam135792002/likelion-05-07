package vn.edu.likelion.ex01;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);
        int sumEven = listInteger.stream().filter(integer -> integer % 2 == 0).reduce(Integer::sum).orElse(0);
        int sumOdd = listInteger.stream().filter(integer -> integer % 2 != 0).reduce(Integer::sum).orElse(0);

        System.out.println("List of numbers: " + listInteger);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

    }
}
