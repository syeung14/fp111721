import java.util.*;
import static java.util.stream.Collectors.toList;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    System.out.println(numbers.stream()
      .filter(e -> e % 2 == 0)
      .mapToInt(e -> e * 2)
      .sum()); //sum is a special form of reduce

    System.out.println(numbers.stream()
      .filter(e -> e % 2 == 0)
      .mapToInt(e -> e * 2)
      .max()); //max is a special form of reduce

    System.out.println(numbers.stream()
      .filter(e -> e % 2 == 0)
      .map(e -> e * 2)
      .collect(toList())); //collect is a special form of reduce
  }
}

/*
reduce comes in different flavors.
reduce does not always give a single value, it may be a collection as well.

reduce transforms from a functional pipeline to a terminal value where the
value may be a single value or a collection of values.
*/

