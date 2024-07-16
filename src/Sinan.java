import java.util.Date;

public class Sinan {

        public String name;
        public String surName;
        public String address;
        public boolean gender;
        public Date birtDate;
        public int ID;
        public String fatherName;
        public String motherName;
        ;
        //constructors
        public Sinan() {
                name = "Sinan";
                surName = "Yolal";
                address = "Tuzla, Istanbul";
                gender = true;
                birtDate = new Date(2004, 07,01);
                ID = 9990088;
                fatherName = "Adem";
                motherName = "Havva";

        }
        // methods
        public void printNameAndSurname() {
                System.out.println(name + " " + surName);
        };


}
