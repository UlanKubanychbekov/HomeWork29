package peaksoft;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /**Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.*/

        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            integers.add(random.nextInt(30));

        }
        System.out.println(integers);
        System.out.println();
      integers.stream().filter(x -> x % 2 == 0).map(x->x*x).max(Integer::compare).ifPresent(System.out::println);
    }
}
