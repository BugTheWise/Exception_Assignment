public class RaceDemo
{
  public static void main(String[] args) throws Exception {
//test
      try {
          LapTimer lap = new LapTimer(5);
          lap.start();
          while (lap.getLapsRemaining() > 0)
          {
              lap.markLap();
              System.out.println();
              System.out.printf("Lap Time: %d\n", lap.getLapTime());
              System.out.printf("Laps Remaining: %d\n", lap.getLapsRemaining());
              System.out.printf("Total Time: %d\n", lap.getTotalTime());
              System.out.println();
          }
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
  }


}
