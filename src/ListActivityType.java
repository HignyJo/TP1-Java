import java.util.HashMap;
import java.util.Map;

public class ListActivityType {

    Map<String,ActivityType> mapActivity = new HashMap<>();

    public void addActivityType(String name, boolean registrationRequired){

    }

    public ActivityType getActivityType(String name) {
        ActivityType activity = null;
        if (name != null && !mapActivity.containsKey(name)){
            activity = mapActivity.get(name);
        }
        return activity;
    }

    public void removeActivityType(String name) {

    }

}
