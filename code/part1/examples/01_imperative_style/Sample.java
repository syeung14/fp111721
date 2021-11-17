import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //in the past we used imperative + object-oriented programming

    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //Is our friend Nemo in there?

    //imperative style: we tell what to do and also how to do it

    boolean found = false; //garbage variable

    //for(int i = 0; i < names.size(); i++... //that is tedious - how

    for(String name: names) {
      //if(name == "Nemo" //how
      if(name.equals("Nemo")) { //how
        found = true;
	break; //another how
      }
    }

    if(found) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
  }
}

//We are all very familiar with this.

//familiar != simple

//what are some of the smells of the imperative style?
//verbose, tiring to write, and especially to read
//hard to reason
//hard to parallelize where need
//often uses mutability

//details are on your face, you have no choice

