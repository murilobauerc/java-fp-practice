package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        // Estruturada
        final List<Integer> integers = List.of(1, 2, 5, 1013, 3, 3, 23, 213);
        for(Integer number : integers) {
            System.out.println(number);
        }
    }
}
