import java.util.*;
import java.util.stream.*;

public class Sample {
  public static void main(String[] args) {
    int factor = 2;

    List<Integer> numbers = Arrays.asList(1, 2, 3);

    Stream<Integer> stream = numbers.stream()
      .map(e -> e * factor); 

    //factor = 2; //mutating and thus factor is not effective final.
    //uncomment the previous line and run the code. If we uncomment the
    //previous line the error shows up in line 11 within the closure.
    //Java is trying to protect us. If we don't change factor, it is considered
    //to be effectively final.

    stream.forEach(e -> System.out.println(e));

//lambdas and closure have to be pure
  }
}

