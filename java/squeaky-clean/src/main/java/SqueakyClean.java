class SqueakyClean {
  static String clean(String identifier) {
    // throw new UnsupportedOperationException("Please implement the (static)
    // SqueakyClean.clean() method");
    String test = identifier;
    test = test.replaceAll(" ", "_");

    StringBuilder sb = new StringBuilder(test);

    for (int i = 0; i < test.length(); i++) {

      if (Character.isISOControl(test.charAt(i))) {
        sb.replace(i, i + 1, "CTRL");
      }
      if (Character.getType(test.charAt(i)) == Character.DASH_PUNCTUATION) {
        StringBuilder upperCaseLetter = new StringBuilder();
        upperCaseLetter.append(Character.toUpperCase(test.charAt(i + 1)));
        sb.replace(i, i + 2, upperCaseLetter.toString());
      }

    }
    return sb.toString();
  }

}
