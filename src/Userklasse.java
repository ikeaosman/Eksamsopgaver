import java.util.ArrayList;
import java.util.Collections;

public class Userklasse {
    private String userName;
    ArrayList<String> list = new ArrayList<>();

    //Getter
    public String getUserName(){
        list.add("Ikhra");
        list.add("Ifrax");
        list.add("Freya");
        list.add("Susmita");
        list.add("Ugbaad");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return userName;
        //opgave: Nu skal du printe  de forskellige  brugere ud ( med navn ).
        }

    public void metodeHans(){
        list.remove(0);
        list.add(0, "Hans");
        System.out.println(list);

        //opgave: Nu skal du ændre den første brugers navn til ”Hans”.
    }

    public void sorteNavn(){
        Collections.sort(list);
        System.out.println(list);

        //opgave: Vær sød at sorte userne.  Print herefter userne  ud.
    }

    public void fjerneUser(){
        list.remove(0);
        System.out.println(list);
        //opgave:Vær sød at fjerne den 3 user.  Print derefter userne  ud igen.
    }

    public void indsætPaul(){
        list.remove(0);
        list.add(0, "Paul");
        System.out.println(list);

        //opgave:Vær sød at erstatte første user i listen med useren ”Poul”.
    }








}
