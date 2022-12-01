package out.production.ProgramingFundamentals.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*Write a program that will take an array of strings, go through all the elements, select only those longer than five characters, and sort and return them as a new list.
 */
public class StreamFundamental {
    public static void main(String[] args) {


        String[] fruits = {"Apple", "Pineapple", "Banana", "Orange", "CusturdApple", "Avacado"};
        List<String> newString= Arrays.stream(fruits).filter(arr->arr.length()>5).sorted().collect(Collectors.toList());
               newString.forEach(System.out::println);
        System.out.println(newString);

    }
}
