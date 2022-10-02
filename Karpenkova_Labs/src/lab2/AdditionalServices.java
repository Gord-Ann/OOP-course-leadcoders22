package lab2;

public class AdditionalServices {
    private String privileges;
    private int bonusPoints;

    public AdditionalServices (String privileges, int bonusPoints) {
        this.privileges = privileges;
        this.bonusPoints = bonusPoints;

    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }


    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }
}

