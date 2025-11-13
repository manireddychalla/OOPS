public abstract class Activity {

    private String activityId;
    private int durationMinutes;
    private double distanceKMs;
    private String date;
    private String activityName;

    public abstract int calculateCalories();
    //default constructor

    public Activity(){

    }

    //setting the values
    public Activity(String activityId, int durationMinutes, double distanceKMs, String date,String activityName){

        this.activityId = activityId;
        this.durationMinutes = durationMinutes;
        this.distanceKMs = distanceKMs;
        this.date = date;
        this.activityName = activityName;

    }


    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getActivityId() {
        return activityId;
    }

    public double getDistanceKMs() {
        return distanceKMs;
    }

    public String getDate() {
        return date;
    }
    public String getActivityName() {
        return activityName;
    }


}
