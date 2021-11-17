import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    numbers.stream() //Stream<Integer>
      .map(e -> e * 2.0) //Stream<Double>
      .forEach(e -> System.out.println(e));
  }
}

/*
  [x1, x2, x3, ... xi, ...].map(fX) => [y1, y2, y3, ... yi, ...]

  where yi = f(xi)

  map applies the given function to each of the elements in the collection.

Logically speaking:
  # of elements in the output == # of elements in the input

The elements in the output may be of a different type than the input.

Stream<Integer>.map(e -> e + 1) ===> Stream<Integer>
Stream<Integer>.map(e -> e * 1.0) ===> Stream<Double>

Stream<T>.map(Function<T, R>) ===> Stream<R>

The function passed to the map function decides on the type of the output elements.
The input stream and the function input type have to match.
*/
