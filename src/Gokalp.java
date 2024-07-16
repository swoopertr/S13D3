import java.util.Date;

public class Gokalp {

        public String name;
        public String lastName;
        public Date birthDate;
        public String address;
        private String TCKN;
        private int favnumber;
        public String mothername;
        public String fathername;

        public Gokalp(){
            name= "Gökalp";
            lastName= "Çoban";
            birthDate= new Date(1967,8,2);
            address= "TRABZON";
            TCKN= "61616161610";
            favnumber=61;
            mothername= "Yasemin";
            fathername= "Arif";

        }

    public void printNameAndLastName () {
        System.out.println(name + " " + lastName);
    }

    public String GetBirthYear(){
            return birthDate.getYear() + " " + favnumber;
    }

}
