public class ElonsToyCar {
  public int distance = 0;
  public int batteryLevel = 100;

  public static ElonsToyCar buy() {
    ElonsToyCar car = new ElonsToyCar();
    return car;
  }

  public String distanceDisplay() {
    return "Driven " + distance + " meters";
  }

  public String batteryDisplay() {
    if (batteryLevel == 0) {
      return "Battery empty";
    } else {
      return "Battery at " + batteryLevel + "%";
    }
  }

  public void drive() {
    if (batteryLevel > 0) {
      distance += 20;
      batteryLevel -= 1;
    }

  }
}
