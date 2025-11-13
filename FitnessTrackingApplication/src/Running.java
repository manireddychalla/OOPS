public class Running extends Activity{

    private int averageHeartRate;

    private static final int CALORIES_PER_KM=70;

    public Running(){

    }

    public Running(String activityId, int durationMinutes, double distanceKMs, String date,int averageHeartRate){
        super(activityId, durationMinutes, distanceKMs, date,"Running");
        this.averageHeartRate = averageHeartRate;
    }

    @Override
    public int calculateCalories() {
        return (int) getDistanceKMs()*CALORIES_PER_KM;
    }
}
