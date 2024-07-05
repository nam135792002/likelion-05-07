package vn.edu.likelion.ex02;

import java.util.Arrays;
import java.util.List;

public class DeleteDuplicate {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Original list of numbers: " + listInteger);

        List<Integer> listDistinct = listInteger.stream().distinct().toList();
        System.out.println("After removing duplicates frm the siad list: " + listDistinct);


    }
}
