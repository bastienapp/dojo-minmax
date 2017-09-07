class Ex {
  static String fizzbuzz(int entree) {
    if (entree % 15 == 0) {
      return "fizzbuzz";
    }
    else if (entree % 5 == 0) {
      return "buzz";
    }
    else if (entree % 3 == 0) { 
      return "fizz";
    }
    else {
     return  Integer.toString(entree);
    }
  }
}
