class Patients extends Person {
    private int patientId;
    public Patients(String surname, String name, int birthDate,int patientId) {
        super(surname, name, birthDate);
        this.patientId = patientId;
    }

    public int getPatientsId(){
        return patientId;
    }
}