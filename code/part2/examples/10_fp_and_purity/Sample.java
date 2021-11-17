import java.util.*;
import java.util.stream.*;

public class Sample {
  public static void main(String[] args) {
    int[] factor = new int[] { 2 }; //DON't DO THIS

    List<Integer> numbers = Arrays.asList(1, 2, 3);

    Stream<Integer> stream = numbers.stream()
      .map(e -> e * factor[0]);  //lazy evaluation, so it uses the value that is
      //changed later. Also, if we run in parallel result will be unpredicatable.

    factor[0] = 0; 

    stream.forEach(e -> System.out.println(e));//this triggers the evaulation of the function passed to map
  }
}

