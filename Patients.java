class Patients extends  Person{
    private int patientId;
    public Patients(String surname, String name, int birthDay, int birthMonth, int birthYear, int patientId) {
        super(surname, name, birthDay, birthMonth, birthYear);
        this.patientId = patientId;
    }

    public int getClientId(){
        return patientId;
    }
}