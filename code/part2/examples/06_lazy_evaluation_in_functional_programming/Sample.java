import java.util.*;

public class Sample {
  public static boolean isGT3(int number) {
    System.out.println("isGT3 called for " + number);
    return number > 3;
  }

  public static boolean isEven(int number) {
    System.out.println("isEven called for " + number);
    return number % 2 == 0;
  }

  public static int doubleIt(int number) {
    System.out.println("doubleIt called for " + number);
    return number * 2;
  }

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

    //find the double of the first number > 3 and is even

    //imperative style
    int result = 0;

    for(int e: numbers) {
      if(isGT3(e) && isEven(e)) {
        result = doubleIt(e);
	break;
      }
    }

    System.out.println(result);

    System.out.println("-------");

    //Functional style
    System.out.println(numbers.stream()
      .filter(Sample::isGT3)
      .filter(Sample::isEven)
      .map(Sample::doubleIt)
      .findFirst()
      .orElse(0));

   //How much work was done in each of these solutions:
   //In the imperative style we did 8 units of work, thanks to short circuiting and
   //break. The computation never touched, in this example, the values 6, 7, 8,...

   //In the functional style, it *appears* to take 22 units.
   //filter all numbers > 3 -> 10 operations to produce 7 values
   //filter all even numbers > 3 -> 7 operations to produce 4 values
   //map all given values -> 4 operations to produce 4 values
   //find first -> 1 operation
   //22 operations
   //darn it, I am out of here

   //Thanfully that is not true in functional programming.

   //Languages like JavaScript, Ruby, Groovy, etc. do take that much time and perform
   //that many operations. They are not functional programming, they offer functional
   //style of programming.

   //Languages like Hashell, Erlang, Java, C#, etc. offer functional programming.

   //Stream does not process all the elements through the first function given.
   //Stream have two kinds of operations: intermediate and terminal.
   //filter, map, etc. are intermediate.
   //findFirst, reduce, etc. are terminal
   //Stream first fuses the intermediate operations into one internal function.
   //This of this like the functional composition example we wrote with andThen.
   //
   //It evaluate only as little as necessary the fused function but on elements
   //until the result is obtained.

   //Lazy evaluation.
   //Evaluate functions, but only on demand, and only as little as necessary.


   //Both the imperative and the functional programming version did the same 
   //amount of work and the same sequence of work. There was not wastage of computation
   //and there were not intermediate collections that were created.

   //Never ask how fast it can run. Instead ask, is the performance adequate?
   //If it is, benefit from all the other good things.

   //Imperative style performs well but is hard to maintain and to parallelize.
   //Functional programming performs well and is also easier to maintain and to
   //parallelize.

   //It is good enough mostly and when we need more we can parallelize more easily
   //if that is the right solution.
  }
}

//Polymorphism is to Object-Oriented Programming 
//as lazy evalution is to Functional Programming

//Lazy evaluation == effificency

//Functional Programming == Functional Composition + Lazy Evaluation

//Functional style gives us fluenct, concise, easy to understand code, 
//that is necessary but not sufficient.

//For functional programming we want fluency + efficiency.

