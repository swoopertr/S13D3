import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        Human Ego = new Human();
//        Ego.name = "Egemen";
//        System.out.println(Ego.name);
//        System.out.println(Ego.name + " doğum yılı :" + Ego .getBirthYear());
//
//        Human mete = new Human(1990);
//        mete.name = "Metehan";
//        System.out.println(mete.name);
//
//
//        System.out.println(mete.getAge());
//
//        Human ali = new Human();
//
//        ali.moveRight();
//        ali.GetPosition();
//        ali.moveUp();
//        ali.GetPosition();
//        ali.moveRight();
//        ali.GetPosition();

        Egemen egoInst = new Egemen();
        egoInst.printNameAndSurname();

        Elif elifObj = new Elif();
        elifObj.surName=" yeniECE";
        elifObj.printNameAndSurname();




        Sinan sinanObj = new Sinan();
//        System.out.println(sinanObj.name + " " + sinanObj.surName);
//        sinanObj.surName = "Mahmut";
//        System.out.println(sinanObj.name + " " + sinanObj.surName);
        sinanObj.printNameAndSurname();


        Gokalp gokalpObj = new Gokalp();
        //gokalpObj.lastName= "Akçaabat";
        // System.out.println(gokalpObj.name +" " + gokalpObj.lastName + " " + gokalpObj.address);
        gokalpObj.printNameAndLastName();
        System.out.println(gokalpObj.GetBirthYear());


        Mete meteObj = new Mete ();
        meteObj.surname= "Bayın";
        meteObj.printNameAndSurname();

    }
}
