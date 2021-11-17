import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    numbers.stream()
      .filter(e -> e % 2 == 0)
      .forEach(e -> System.out.println(e));
  }
}

/*
a filter will throw away a value that does not satisfy the given predicate

Think of a filter like a coin sorter. For example, it passes dimes through but block the other coins.

Logically speaking:
0 <= # of values in the output < # of elements in the output

The output is a subset of the input. No element in the output is not also in the input.
*/
