import java.util.*;
import static java.util.stream.Collectors.toList;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    //If you have a one-to-one function, then Stream<T>.map(fTR) ==> Stream<R>
    //we go from a collection to a collection

    List<Integer> result1 = numbers.stream()
      .map(e -> e + 1)
      .collect(toList());

    System.out.println(result1);

    //If you have a one-to-many funciton, then Stream<T>.map(fTListR) ==> Stream<List<R>>
    //we go from a collection to a collection of collection

    //If we have people. Each person has a id. 
    //Stream<ID> ids = people...map(person -> getId())...

    List<List<Integer>> result2 = numbers.stream()
      .map(e -> Arrays.asList(e - 1, e + 1))
      .collect(toList());

    System.out.println(result2);

    //If you want to go from a collection to a collection, then you got it.

    //If we have people and each person has many email addresses
    //Stream<List<Email>> listofListOfEmails = people.map(person -> getEmails());
    //Hum, do we really want a list of list of emails or a list of emails?


    //In some langauges there is a nice convenience function called flatten.
    //See the Kotlin example below.

    List<Integer> result3 = numbers.stream()
      .flatMap(e -> Arrays.asList(e - 1, e + 1).stream())
      .collect(toList());

    System.out.println(result3);

    /*
          if you have         |     if you want                         |  use
       ------------------------------------------------------------------------------
       a one-to-one function  | collection to collection                |  map
       a one-to-many function | collection to collection of collection  |  map
       a one-to-many function | collection to collection                |  flatMap
    */
  }
}


/*
//sample.kts

val numbers = listOf(1, 2, 3)

val result1 = numbers.map { e -> e + 1 }
println(result1)

val result2 = numbers.map { e -> listOf(e - 1, e + 1) }
println(result2)

val result3 = result2.flatten()
println(result3)

//we can map and then flatten, but that is boring, why not combine
//those two steps.

//val result4 = numbers.mapFlatten { e -> listOf(e - 1, e + 1) }
//mapFlatten maps and flatten while giving jaw pain. So, to save
//humanity they changed it to flatMap. But, you know it really is
//map and flatten in that order.

val result4 = numbers.flatMap { e -> listOf(e - 1, e + 1) }
println(result4)

*/
