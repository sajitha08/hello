import java.util.ArrayList;
public class day10 {
    static void main() {
        ArrayList<String> list= new ArrayList<String> ();
        //String[] StudentsList={"Saji","Siva","Ram","Lasi","Seetha"};
        //System.out.println(StudentsList.length);
        list.add("Saji");
        list.add("Siva");
        list.add("Ram");
        list.add("Lasi");
        list.add("Seetha");
        for (String s:  list){
            System.out.println(s);
        }
        list.remove("Ram");
        System.out.println();
        for (String s:  list){
            System.out.println(s);
        }
    }
}










