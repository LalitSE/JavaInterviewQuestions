import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
/*Set is not the pair of keys and values, basically it doesnt allow duplicate values
 * Set is implemented by HashSet, LinkedSet and TreeSet*/
	public static void main(String[] args) {
		Set<String> hash_set = new HashSet<String>();
		hash_set.add("Lalit");
		hash_set.add("Chandra");
		hash_set.add("Vishwash");
		hash_set.add("Lalit"); //it will override the first Lalit value
		hash_set.add("Amit");
		
		System.out.println("Data without duplicates: "+hash_set);
		
		System.out.println("Sort the elements");
		Set<String> tree_set = new TreeSet<String>(hash_set);
		System.out.println("In Sorted Order: "+tree_set);
		
//		Iterator itr = 

	}

}
