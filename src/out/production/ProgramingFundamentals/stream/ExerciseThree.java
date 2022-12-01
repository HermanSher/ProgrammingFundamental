package out.production.ProgramingFundamentals.stream;

import java.util.List;

/*Write a program that takes a list of strings,
counts all the elements whose length is greater than 5, and returns the final count.*/
public class ExerciseThree {
    public static void main(String[] args) {
    List<String> country = List.of("India", "China", "Pakistan", "Bangladesh");

    long newList = country.stream().filter(c->c.length()>5)
            .count();
        System.out.println(newList);

    }
}

