package com.agiledeveloper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

interface Util {
  public static boolean isPrime(int number) {
    //Think declarative and then code functionally

    //Given a number, it is prime if no number in the range 2 to number - 1 divides the given number

    return number > 1 && IntStream.range(2, number)
      .noneMatch(i -> number % i == 0);
  }

  public static long countWordsInFile(String filePath, String searchWord) throws IOException {
    //Is it possible to read the content of a file and get a functional pipeline (stream) for the contents?
    //Looking into the JDK, we find Files.lines

    return Files.lines(Paths.get(filePath))
      .filter(line -> line.contains(searchWord))
      .count();
  }
}
