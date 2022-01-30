
class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    int[] lastWeek = new int[] { 0, 2, 5, 3, 7, 8, 4 };
    return lastWeek;
  }

  public int getToday() {
    if (birdsPerDay.length == 0) {
      return 0;
    } else {

      return birdsPerDay[birdsPerDay.length - 1];
    }
  }

  public void incrementTodaysCount() {
    birdsPerDay[birdsPerDay.length - 1]++;
  }

  public boolean hasDayWithoutBirds() {
    boolean hasNone = false;
    for (int i = 0; i < birdsPerDay.length; i++) {
      if (birdsPerDay[i] == 0) {
        hasNone = true;
      }
    }
    return hasNone;
  }

  public int getCountForFirstDays(int numberOfDays) {
    int sum = 0;
    if (numberOfDays > birdsPerDay.length) {
      numberOfDays = birdsPerDay.length;
    }
    for (int i = 0; i < numberOfDays; i++) {
      sum += birdsPerDay[i];
    }

    return sum;
  }

  public int getBusyDays() {
    int busyCount = 0;
    for (int i = 0; i < birdsPerDay.length; i++) {
      if (birdsPerDay[i] >= 5) {
        busyCount++;
      }
    }
    return busyCount;
  }
}
