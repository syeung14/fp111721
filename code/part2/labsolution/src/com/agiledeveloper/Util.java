package com.agiledeveloper;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.util.stream.Collectors.toList;

interface Util {
  static List<String> getNamesOfLength4(List<String> names) {
    return names.stream()
      .filter(name -> name.length() == 4)
      .collect(toList());
  }

  static List<String> getNamesOfLength5InUpperCase(List<String> names) {
    return names.stream()
      .filter(name -> name.length() == 5)
      .map(name -> name.toUpperCase())
      .collect(toList());
  }

  static List<String> getInUpperCaseNamesOfLength4AndHavingL(List<String> names) {
    return names.stream()
      .filter(name -> name.length() == 4)
      .filter(name -> name.contains("l"))
      .map(name -> name.toUpperCase())
      .collect(toList());
  }
}