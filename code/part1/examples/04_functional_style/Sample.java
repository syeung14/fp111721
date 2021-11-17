public class Sample {
  public static void main(String[] args) {
    //functions
    //we can pass objects to functions
    //we can create objects in functions
    //we can return objects from functions

    //higher-order functions
    //we can pass functions to functions
    //we can create functions in functions
    //we can return functions from functions

    //in addition to doing object decomposition we can also do functional decomposition

    Thread th1 = new Thread(new Runnable() { //Java once had the idiology that everthing should be object (though that was not followed entirely)
      public void run() {
        System.out.println("In another thread");
      }
    });
    th1.start();

    //we can treat functions or code as first class citizens - function or code as data

    Thread th2 = new Thread(() -> System.out.println("In another thread"));
    th2.start();

    //we passed a function (an anonymous one) to another function (constructor)
    //Thread's constructor, in this example, is a higher-order function.

    System.out.println("In main");
  }
}
