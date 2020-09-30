package test;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(14);
        list.forEach(System.out::println);

    }
}
