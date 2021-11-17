import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //imperative style: we tell what to do and also how to do it
    //declarative style: we tell what to do and *not* how to do it

    if(names.contains("Nemo")) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
  }
}

//declarative style the details are just one layer below. It is not on our face,
//but we can reach over to it when we like

//no explicit mutability
//we delegate to other functions to get the work done
//it follows the SLAP - Single Level of Abstraction Principle

//It is easier to read, to maintain, to understand

