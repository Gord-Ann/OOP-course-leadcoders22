public abstract class Person {

    protected String surname;
    protected String name;
    protected String email;

    public Person(String surname, String name, String email) {
        System.out.println(" ");
        this.surname = surname;
        this.name = name;
        this.email = email;
    }


        public String getSurname() {
            return surname;
        }
        public void setSurname (String surname){
            this.surname = surname;
        }

        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }


    }
