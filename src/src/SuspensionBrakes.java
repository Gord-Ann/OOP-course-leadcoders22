public class SuspensionBrakes {
    private String forwardsuspensionType;
    private String forwardbrakesType;
    private String rearsuspensionType;
    private String rearbrakesType;

    public SuspensionBrakes(String forwardsuspensionType, String forwardbrakesType, String rearsuspensionType, String rearbrakesType){
        this.forwardsuspensionType = forwardsuspensionType;
        this.forwardbrakesType = forwardbrakesType;
        this.rearsuspensionType = rearsuspensionType;
        this.rearbrakesType = rearbrakesType;
    }

    public SuspensionBrakes(){
    }
    public String getforwardbrakesType() {
        return forwardbrakesType;
    }
    public void setforwardbrakesType(String forwardbrakesType) {
        this.forwardbrakesType = forwardbrakesType;
    }
    public String getforwardsuspensionType() {
        return forwardsuspensionType;
    }
    public void setforwardsuspensionType(String forwardsuspensionType) {
        this.forwardsuspensionType = forwardsuspensionType;
    }
    public String getrearbrakesType() {
        return rearbrakesType;
    }
    public void setrearbrakesType(String rearbrakesType) {
        this.rearbrakesType = rearbrakesType;
    }
    public String getrearsuspensionType() {
        return rearsuspensionType;
    }
    public void setrearsuspensionType(String rearsuspensionType) {
        this.rearsuspensionType = rearsuspensionType;
    }
}
