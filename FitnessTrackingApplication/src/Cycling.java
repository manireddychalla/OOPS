public class Cycling extends Activity{

    private int elevationGainMeters;
    private static final int CALORIES_PER_MIN=8;
    Cycling(){

    }
    public Cycling(String activityId, int durationMinutes, double distanceKMs, String date,int elevationGainMeters) {
        super(activityId, durationMinutes, distanceKMs, date,"Cycling");
        this.elevationGainMeters = elevationGainMeters;
    }

    @Override
    public int calculateCalories(){

        return getDurationMinutes() *  CALORIES_PER_MIN;
    }

}
