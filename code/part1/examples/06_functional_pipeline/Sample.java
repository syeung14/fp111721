import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //find the total of double of even numbers

    //imperative style
    int result = 0;

    for(int e: numbers) {
      if(e % 2 == 0) {
        result += e * 2;
      }
    }

    System.out.println(result);

    System.out.println(numbers.stream()
      .filter(e -> e % 2 == 0) //declarative + higher-order function == functional
      .mapToInt(e -> e * 2) //declarative + higher-order function == functional
      .sum()); //declarative 
  }
}

//Some examples we can relate to
//  data   ----> filter     ----> map  ---->   reduce
//  cat file | grep something | sed ...  |  wc -l
//  air      | purifier       | heater   | ...
//  water    | purifier'      | cooler   | ...

//think in terms of a series of transformations through a pipeline

//functional pipeline

//pipeline of functions through which we pass data...

// data -> function 1 -> function 2 -> function 3 -> ...

