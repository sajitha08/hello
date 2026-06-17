import java.util.HashMap;
import java.util.Map;
public class Day11{
    public static void main(String[]args){
        Map<String , Object> person = new HashMap<>();
        person.put("ram",89);
        person.put("john",78);
        person.put("Aravindh",67);
        person.put("ramesh",90);
        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }

}
















