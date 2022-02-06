class NeedForSpeed {
  private int speed;
  private int batteryDrain;
  private int batteryPercentage;
  private int distanceDriven;

  public NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
    this.batteryPercentage = 100;
    this.distanceDriven = 0;
  }

  public boolean batteryDrained() {
    if (this.batteryPercentage <= 0) {
      return true;
    } else {
      return false;
    }
  }

  public int distanceDriven() {
    return this.distanceDriven;
  }

  public void drive() {
    if (!this.batteryDrained()) {

      this.distanceDriven += this.speed;
      this.batteryPercentage -= this.batteryDrain;
    }
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(50, 4);
  }
}

class RaceTrack {
  private int distance;

  public RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean carCanFinish(NeedForSpeed car) {
    // drive the car for as long as it has battery
    // if the total distance of the track is less than the distance driven,
    // then the car can finish the track
    while (!car.batteryDrained()) {
      car.drive();
    }

    if (distance > car.distanceDriven()) {
      return false;
    } else {
      return true;
    }
  }
}
