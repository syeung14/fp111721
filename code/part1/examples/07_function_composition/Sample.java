import java.util.function.*;

//Functional composition is a way to combine or compose functions to create
//other functions.

public class Sample {
  public static void print(int number, String msg, Function<Integer, Integer> func) {
    System.out.println(number + " " + msg + ": " + func.apply(number));
  }

  public static void main(String[] args) {
    Function<Integer, Integer> inc = e -> e + 1;
    print(5, "incremented", inc);
    print(10, "incremented", inc);

    Function<Integer, Integer> doubleIt = e -> e * 2;
    print(5, "doubled", doubleIt);
    print(10, "doubled", doubleIt);


    print(5, "incremented and doubled", inc.andThen(doubleIt));
    print(10, "incremented and doubled", inc.andThen(doubleIt));

    Function<Integer, Integer> incAndDouble = inc.andThen(doubleIt);
    print(20, "incremented and doubled", incAndDouble);

    /*
        inc:
        data ---> | inc | ---> output

        doubleIt:
        data ---> | doubleIt | ---> output

        
	incAndDouble:
	data --> ||---> | inc | ---> | doubleIt | ---> || ---> output
    */
  }
}

