public class Egemen {
    private int tcNo;
    public String name;
    public String surname;
    private String motherName;
    private String fatherName;
    private int sgkNo;
    public String medeniHali;

//Constructors

    public Egemen(){
        name= "Egemen";
        surname = "Keskin";
        medeniHali = "Bekar";
    }


    public void printNameAndSurname() {
        System.out.println("Name: "    + name +
                           " Surname: " + surname);
    }

    //METHODS BELOW
    public String getFirst3LettersMotherName() {
        if (motherName != null && motherName.length() >= 3) {
            return motherName.substring(0, 3);
        } else {
            return motherName;
        }
    }
    public String getFirst3LettersFatherName() {
        if (fatherName != null && fatherName.length() >= 3) {
            return fatherName.substring(0, 3);
        } else {
            return fatherName;
        }
    }
    public String getFirst3DigitsTcNo() {
        String tcNoString = Integer.toString(tcNo);
        if (tcNoString.length() >= 3) {
            return tcNoString.substring(0, 3);
        } else {
            return tcNoString;
        }
    }
    public String getFirst3DigitsSgkNo() {
        String sgkNoString = Integer.toString(sgkNo);
        if (sgkNoString.length() >= 3) {
            return sgkNoString.substring(0, 3);
        } else {
            return sgkNoString;
        }
    }

}