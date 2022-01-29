public class LogLevels {
    
    public static String message(String logLine) {
      String result[] = logLine.split(":");
      String message = result[1];
      return message.strip();
      
    }

    public static String logLevel(String logLine) {
      
      String result[] = logLine.split(":");
      String level = result[0];
      return level.replaceAll("\\W", "").toLowerCase();

    }

    public static String reformat(String logLine) {      
      return LogLevels.message(logLine).concat(" (" + LogLevels.logLevel(logLine) + ")");
    }
}
