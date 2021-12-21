public class ActivityType {
    String name;
    boolean inscription;

    public ActivityType(String name, boolean inscription) {
        this.name = name;
        this.inscription = inscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRegistration() {
        return inscription;
    }

    public void setRegistration(boolean flag) {
        this.inscription = flag;
    }
}
