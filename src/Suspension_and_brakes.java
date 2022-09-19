public class Suspension_and_brakes {
    private String forward_suspension_type;
    private String forward_brakes_type;
    private String rear_suspension_type;
    private String rear_brakes_type;

    public Suspension_and_brakes(String forward_suspension_type, String forward_brakes_type, String rear_suspension_type, String rear_brakes_type){
        this.forward_suspension_type = forward_suspension_type;
        this.forward_brakes_type = forward_brakes_type;
        this.rear_suspension_type = rear_suspension_type;
        this.rear_brakes_type = rear_brakes_type;
    }

    public Suspension_and_brakes(){
    }
    public String getForward_brakes_type() {
        return forward_brakes_type;
    }
    public void setForward_brakes_type(String forward_brakes_type) {
        this.forward_brakes_type = forward_brakes_type;
    }
    public String getForward_suspension_type() {
        return forward_suspension_type;
    }
    public void setForward_suspension_type(String forward_suspension_type) {
        this.forward_suspension_type = forward_suspension_type;
    }
    public String getRear_brakes_type() {
        return rear_brakes_type;
    }
    public void setRear_brakes_type(String rear_brakes_type) {
        this.rear_brakes_type = rear_brakes_type;
    }
    public String getRear_suspension_type() {
        return rear_suspension_type;
    }
    public void setRear_suspension_type(String rear_suspension_type) {
        this.rear_suspension_type = rear_suspension_type;
    }
}
