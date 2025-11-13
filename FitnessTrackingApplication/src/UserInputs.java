import java.util.ArrayList;
import java.util.List;

public class UserInputs {
    private String userId;
    private String name;
    private double weight;
    private int totalCaloriesBurned;
    private List<Activity> activityLog;

    public UserInputs(String userId, String name, double weight) {
        this.userId = userId;
        this.name = name;
        this.weight = weight;
        this.totalCaloriesBurned = 0;
        this.activityLog = new ArrayList<>();
    }

    //method to log activity and update the total calories

    public void logActivity(Activity activity) {
        activityLog.add(activity);
        int calories=activity.calculateCalories();
        totalCaloriesBurned+=calories;
        System.out.println(name+" logged "+calories+" calories  burned for the activity " +activity.getActivityName()+" with activity id : "+activity.getActivityId());

    }

    public void displayWorkoutDetails(){
        System.out.println("\n--- Fitness Summary for " + name + " ---");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Total Calories Burned: " + totalCaloriesBurned);
        System.out.println("Total Activities Logged: " + activityLog.size());
        System.out.println("------------------------------------");
    }

    public String getUserId() {
        return userId;
    }
}
