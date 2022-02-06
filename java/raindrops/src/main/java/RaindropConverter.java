class RaindropConverter {

  // has 3 as a factor, add 'Pling'
  // has 5 as a factor, add 'Plang'
  // has 7 as a factor, add 'Plong'
  // doesn't have 3,5,7, result should be digits of the number
  String convert(int number) {
    StringBuilder sb = new StringBuilder();
    if (number % 3 == 0) {
      sb.append("Pling");
    }
    if (number % 5 == 0) {
      sb.append("Plang");
    }
    if (number % 7 == 0) {
      sb.append("Plong");
    }
    if (sb.isEmpty()) {
      sb.append(number);
    }
    return sb.toString();
  }

}
