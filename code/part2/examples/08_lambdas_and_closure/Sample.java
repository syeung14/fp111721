import java.util.*;
import java.util.stream.*;

public class Sample {
  public static void main(String[] args) {
    final int factor = 2;
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    Stream<Integer> stream1 = numbers.stream()
      .map(e -> e * 2); //lambda expression receive parameters, do work, and return
    //lambdas do not depend on any external state.
  
    stream1.forEach(e -> System.out.println(e));

    Stream<Integer> stream2 = numbers.stream()
      .map(e -> e * factor); //this is a closure.
    //This anonymous function depends on an external (immutable) state.
    //The compiler can't use the given anonymous function without binding the
    //variable factor to where it comes from. In this case, it comes from the
    //defining scope of the lambda, called lexical scoping.
    //Because the compiler has to close-over the lexical scope this is called
    //a closure. Closure == close-over
  
    stream2.forEach(e -> System.out.println(e));

    //lambdas do not have any external dependencies.
    //Closures have to close over the defining scope.

    //It is our responsibility to keep closures and lambdas pure.
  }
}

