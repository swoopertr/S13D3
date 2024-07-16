import java.util.Date;

public class Human {
    public String gender;
    public String name;
    public String lastName;
    private Date birthDate;
    public String adres;

    public int X;
    public int Y;

    //Constructors
    public Human(){
        X= 50;
        Y= 50;

        if(birthDate == null){
            birthDate = new Date(2000,1,1);
        }
    }

    public Human(Date _birthDate){
        birthDate =_birthDate;
    }

    public Human(int _birthyear){
        birthDate = new Date(_birthyear,1,1);
    }

    //End of Constructors

    //public Organ[] organs;
    private void move(int x ,int y){
        X = x;
        Y = y;
    }

    public void moveRight(){
       move(X+1, Y);
    }
    public void moveLeft(){
        move(X-1, Y);
    }

    public void moveUp(){
        move(X, Y-1);
    }

    public void moveDown(){
        move(X, Y+1);
    }

    public void GetPosition(){
        System.out.println("X : " + X + " , Y : " + Y);
    }





    int getAge(){
        return (new Date(2024,1,1).getYear() -birthDate.getYear());
    }

    int getBirthYear(){
        return birthDate.getYear();
    }

}
