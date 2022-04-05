import java.util.HashMap;
import java.util.stream.Collectors;

public class sortmap {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("arvind",1);
        hm.put("raj",2);
        hm.put("king",5);
        hm.put("gok",3);
        hm.put("khuba",4);
        hm.entrySet().stream().sorted((i1, i2)->i1.getValue().compareTo(i2.getValue())).collect(Collectors.toList()).forEach(System.out::println);

    }
}
