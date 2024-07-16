import java.util.Date;

public class Mete {
    public String name;
    public String surname;
    public boolean gender;
    public Date date;
    public String Address;
    public String fathername;
    public String mothername;

    public Mete () {

        name= "Mete";
        surname="Mutlu";
        gender = true;
        date = new Date(1993,04,12);
        Address="Ankara";
        fathername="Abdullah";
        mothername="Habibe";
    }
    public void printNameAndSurname (){
        System.out.println(name + " " + surname);
    }
}
