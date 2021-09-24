package programming;

import java.util.ArrayList;
import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(true,false,true,false,false,true,true));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Boolean> numbers) {
        // Find the true values
        // Functional
       numbers.stream().filter(item -> item.equals(true)).forEach(System.out::println);

       // Estruturado
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
