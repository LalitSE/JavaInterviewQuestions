import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDuplicatesDigit {

	public static void main(String[] args) {
		//Remove the duplicates from 1,2,3,1,2,4
		Map<Integer, Integer> mapObj = new HashMap<Integer, Integer>();
		mapObj.put(1, 1);
		mapObj.put(2, 3);
		mapObj.put(3, 3);
		mapObj.put(4, 1);
		mapObj.put(5, 2);
		mapObj.put(6, 4);
		
		Set<Object> uniqueValues = new HashSet<Object>(mapObj.values());
		System.out.println(uniqueValues);

	}

}
