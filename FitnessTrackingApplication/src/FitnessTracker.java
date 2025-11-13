import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {
    private final List<UserInputs> users=  new ArrayList<>();

    public static void main(String[] args) {
        FitnessTracker app = new FitnessTracker();
        app.setUpDemo();

    }

    public void setUpDemo(){

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<USER:1 WORKOUT DETAILS WITH LIST OF ACTIVITY LOG>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        UserInputs user1=new UserInputs("AP0023","SAHIL",78.0);
        Activity run1 = new Running("A001", 30, 5.0, "2024-01-01", 120);
        Activity cycle1 = new Cycling("A002", 60, 20.0, "2024-01-02", 150);
        user1.logActivity(run1);
        user1.logActivity(cycle1);
        users.add(user1);
        user1.displayWorkoutDetails();

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<USER:2 WORKOUT DETAILS WITH LIST OF ACTIVITY LOG>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        UserInputs user2=new UserInputs("AP0023","SAI",60.0);
        Activity run2 = new Running("A003", 30, 5.0, "2024-01-02", 140);
        Activity cycle2=new Cycling("A004", 60, 20.0, "2024-01-02", 160);
        user2.logActivity(run2);
        user2.logActivity(cycle2);
        users.add(user2);
        user2.displayWorkoutDetails();



    }
}
