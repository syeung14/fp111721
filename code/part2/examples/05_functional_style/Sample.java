import java.util.function.Supplier;

public class Sample {
  private final int value;

  public Sample(int value) {
    this.value = value;
  }

  public Sample add(Supplier<Integer> supplier) {
    return new Sample(value + supplier.get());
  }

  public Sample mult(Supplier<Integer> supplier) {
    return new Sample(value * supplier.get());
  }

  public Sample print() {
    System.out.println(value);
    return this;
  }

  public static void main(String[] args) {
    new Sample(1)
      .add(() -> 5)
      .mult(() -> 6)
      .print();

   //this is a functional style of programming. We have a functional pipeline.
   //But, I would not go to the extent of calling this functional programming.
  }
}

/*
Functional style of programming uses functional composition

We have a nice flow or transformation of data using a functional pipeline
*/
