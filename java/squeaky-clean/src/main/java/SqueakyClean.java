class SqueakyClean {
  static String clean(String identifier) {

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < identifier.length(); i++) {
      char ch = identifier.charAt(i);
      if (Character.isSpaceChar(ch)) {
        sb.append("_");
      } else if (Character.isISOControl(ch)) {
        sb.append("CTRL");
      } else if (ch == '-' && i < identifier.length() + 1) {
        i++;
        sb.append(Character.toUpperCase(identifier.charAt(i)));
      } else if (ch >= '\u03b1' && ch <= '\u03c9') {
      } else if (Character.isAlphabetic(ch)) {
        sb.append(ch);
      }

    }
    return sb.toString();
  }
}
