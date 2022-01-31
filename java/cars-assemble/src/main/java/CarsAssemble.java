import java.lang.Number;

public class CarsAssemble {

  public double productionRatePerHour(int speed) {
    double successRate = 1;
    switch (speed) {
      case 5:
      case 6:
      case 7:
      case 8:
        successRate = 0.9;
        break;
      case 9:
        successRate = 0.8;
        break;
      case 10:
        successRate = 0.77;
      default:
        break;
    }

    return speed * 221 * successRate;
  }

  public int workingItemsPerMinute(int speed) {
    return ((int) productionRatePerHour(speed) / 60);
  }
}
