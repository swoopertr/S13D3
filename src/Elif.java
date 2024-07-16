import java.util.Date;

public class Elif{
    public String name;
    public String surName;
    public boolean gender;
    public String adress;
    public Date birthDate;
    public int tckn;
    public String mom_name;
    public String dad_name;
    public String birtDateCity;


    public Elif(){
        name="Elif";
        surName="Ece";
        tckn=232323242;
        mom_name="Iraz";
        dad_name="daddad";
        birtDateCity="citycity";
        gender= false;
        birthDate= new Date(1986,01,01);

    }
    public void printNameAndSurname(){
        System.out.println("name : " + name + " surname :" + surName);

    }
}
