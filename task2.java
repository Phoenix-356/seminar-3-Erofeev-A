// Пусть дан произвольный список целых чисел, удалить из него четные числа


import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

 class Ideone {
    public static void main(String[] args) {
        System.out.println(get(Arrays.asList(1,2,3,4,5)));    // [2, 4]
        System.out.println(get(Arrays.asList(1,2,3,4,5,-1))); // [1, 3, 5, -1]
    }

    static List<Integer> get(List<Integer> integers){
        Map<Boolean, List<Integer>> map = integers.stream()
             .collect(partitioningBy(x -> x % 2 == 0, toList()));
        return map.get(map.get(false).size() % 2 != 0);
    }
}