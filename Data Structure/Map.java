import java.util.HashMap;

public class Map {
public interface Entry<T1, T2> {

	}

public static void main(String[] args) {
	HashMap<String, Integer> emIdHashMap=new HashMap<>();
	emIdHashMap.put("Mishal", 1234);
	emIdHashMap.put("RAsheen", 45678);
	System.out.println(emIdHashMap);
}
}
