package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(50,1,1,2,40,203,40291,202));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // Convert the list of numbers in a stream of numbers (a sequence of numbers, first 50, then 1...)
        numbers.stream().forEach(FP01Functional::print); // method reference
    }
}
