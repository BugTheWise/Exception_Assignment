import java.util.Calendar;
public class LapTimer
{
   private boolean running;
   private long startTime;
   private long lapStart;
   private long lapTime;
   private long totalTime;
   private int lapsCompleted;
   final private int lapsInRace;
   
   public LapTimer(int n)
   {
      running = false;
      startTime = 0;
      lapStart = 0;
      lapTime = 0;
      totalTime = 0;
      lapsCompleted = 0;
      lapsInRace = n;
      
      
   } 
   
   public void start() throws Exception
   {
      if (running)
      {
         throw new Exception("Race is already Started");
      }
      long currentTime = Calendar.getInstance().getTimeInMillis();
      running = true;
      startTime = (currentTime);
      lapStart = (currentTime);
      System.out.println("Start time: " + startTime);
   }
   
   public void markLap() throws Exception
   {
      if (lapsCompleted == lapsInRace)
      {
         throw new Exception("Race is already finished");
      }
      long currentTime = Calendar.getInstance().getTimeInMillis();
      lapTime = (currentTime - lapStart);
      totalTime += lapTime;
      lapStart = currentTime;
      lapsCompleted++;
   }
   
   public long getLapTime() throws Exception
   {
      if (lapsCompleted < 1)
      {
         throw new Exception("You have not finished a lap");
      }
      return lapTime;
   }
   
   public long getTotalTime() throws Exception
   {
      if (lapsCompleted < 1)
      {
         throw new Exception("You have not finished a lap");
      }
      return totalTime;
   }
   
   public int getLapsRemaining()
   {
      return lapsInRace - lapsCompleted;
   }
   
}