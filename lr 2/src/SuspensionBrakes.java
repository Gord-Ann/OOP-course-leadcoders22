public class SuspensionBrakes {
    private String forwardSuspensionType;
    private String forwardBrakesType;
    private String rearSuspensionType;
    private String rearBrakesType;

    public SuspensionBrakes(String forwardSuspensionType, String forwardBrakesType, String rearSuspensionType, String rearBrakesType){
        this.forwardSuspensionType = forwardSuspensionType;
        this.forwardBrakesType = forwardBrakesType;
        this.rearSuspensionType = rearSuspensionType;
        this.rearBrakesType = rearBrakesType;
    }

    public SuspensionBrakes(){
    }
    public String getForwardBrakesType() {
        return forwardBrakesType;
    }
    public void setForwardBrakesType(String forwardBrakesType) {
        this.forwardBrakesType = forwardBrakesType;
    }
    public String getForwardSuspensionType() {
        return forwardSuspensionType;
    }
    public void setForwardSuspensionType(String forwardSuspensionType) {
        this.forwardSuspensionType = forwardSuspensionType;
    }
    public String getRearBrakesType() {
        return rearBrakesType;
    }
    public void setRearBrakesType(String rearBrakesType) {
        this.rearBrakesType = rearBrakesType;
    }
    public String getRearSuspensionType() {
        return rearSuspensionType;
    }
    public void setRearSuspensionType(String rearSuspensionType) {
        this.rearSuspensionType = rearSuspensionType;
    }
}
