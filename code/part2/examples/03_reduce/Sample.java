import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    System.out.println(numbers.stream() 
      .reduce(0, (total, e) -> total + e));

    System.out.println(numbers.stream() 
      .reduce(1, (product, e) -> product * e));

    
    System.out.println(numbers.stream() 
      .reduce(Integer.MAX_VALUE, (min, e) -> Math.min(min, e)));

    System.out.println(numbers.stream()
      .filter(e -> e % 2 == 0)
      .map(e -> e * 2)
      .reduce(0, (total, e) -> total + e));
  }
}

/*
Imagine the gym and the floor mat


----------------------

After workout we may fold, or more so, roll the mat into a cylinder and put it against
the wall.

reduce is going to take a collection and get us to a single value which combines
the values in the collection using some operation.

Now imagine four people, P1, P2, P3, P4 with ages 10, 15, 21, and 30.

We want to total the age of all the people.

We can do like this:

We can start with a 0 and ask each person to do the following:

given an input -> add your age to it -> return the new value as output
Do not change any value (no mutation). Create a copy or a new note with the age.

        P1          P2         P3         P4
        10          15         21         30
        |           |          |          |
  0 ->  +  -> 10 -> + -> 25 -> + -> 46 -> + -> 76 -> output

               ei
               |
   init -----> op ------------> output
          ^            |
	  |            |
	  --------------

     filter % 2 == 0   map * 2            reduce +
x1       |                                 0
---------------------------------------------\----------
x2  -------------------> * 2  -------> y2 --> +
-----------------------------------------------\--------
x3       |                                      \
-------------------------------------------------\------
x4  -------------------> * 2  -------> y4 ------> +
---------------------------------------------------\----
x5       |                                          \
-----------------------------------------------------\--
x6  -------------------> * 2  -------> y6 --------->  +
                                                       \
						        ----> output

Logically speaking:
                0
    1           |
    2->2->4->+->4
    3           |
    4->4->8---->+->12
    5               |
    6->6->12------->+ 24
*/
