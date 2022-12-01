package out.production.ProgramingFundamentals.stream;

import java.util.stream.IntStream;

public class EvenNumberMultiplies {
    public static void main(String[] args) {
        int[] numbers={2,9,7,4,12,6};
        int sum = IntStream.of(numbers)
                .filter(n->n%2==0)
                .map(i->i*2)
                .sum();
        System.out.println(sum);
    }
}