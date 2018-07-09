import java.util.HashMap;

public class HashMapExample {

	/*HashMap is a pair of key and value
	 * 1. In HashMap duplicates keys are not allowed*/
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("Lalit", "City: Pune");
		map.put("Chandra", "City: BiratNagar");
		map.put("Vishwash", "City: Bangalore");
		
		System.out.println("Data: "+map);
		
		System.out.println(map.get("Lalit"));
		System.out.println(map.get("City: Pune")); //null
		System.out.println(map.remove("Chandra"));
		System.out.println("Data After Removing: "+map);
		
	}

}
