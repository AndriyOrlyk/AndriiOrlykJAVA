package first;

class TransformWordsFunction {
  static String transformIfMoreThanSeven(long numberToCheck) {
    if (numberToCheck > 7l) {
      return "Привет";
    }
    return "";
  }

  static String transformIfVyacheslav(String stringToCheck) {
    if ("Вячеслав".equalsIgnoreCase(stringToCheck)) {
      return "Привет, Вячеслав";
    }
    return "Нет такого имени";
  }

}
