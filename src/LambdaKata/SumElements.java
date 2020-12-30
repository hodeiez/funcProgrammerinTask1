package LambdaKata;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SumElements {
    /*Sigruns
      public static IntStream getIntStream(List<Integer> list)
    {
        return list.stream().mapToInt(Integer::intValue);
    }

    public static int calculate(List<Integer> numbers) {

      //  return numbers.stream().reduce(0, (total, number) -> total + number);

        //alternative solution:
        return getIntStream(numbers).sum();
     */
    public static int calculate(List<Integer> numbers) {

     return numbers.stream().collect(Collectors.summingInt(a->a));
        //  throw new UnsupportedOperationException("Not supported yet.");
    }
}
