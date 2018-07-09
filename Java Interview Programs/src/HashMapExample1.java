import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer, Object> mapObj = new HashMap<Integer, Object>();
		mapObj.put(1, "I am Lalit");
		mapObj.put(2, "Kumar from Bihar");
		mapObj.put(1, "I am Kumar");
		
		System.out.println(mapObj);
		
		System.out.println(mapObj.get(1)+ " "+mapObj.get(2));
		System.out.println(mapObj.values());
		System.out.println(mapObj.keySet());
		mapObj.remove(1);
		mapObj.remove(2);
		System.out.println(mapObj.isEmpty());

	}

}
