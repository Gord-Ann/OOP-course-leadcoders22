public class HRmanager {
    private String name;
    private int working_hours;

    public HRmanager(String name,int working_hours) {
        this.name = name;
        this.working_hours = working_hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }
}
