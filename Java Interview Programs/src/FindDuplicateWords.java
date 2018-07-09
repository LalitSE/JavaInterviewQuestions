
public class FindDuplicateWords {

	public static void main(String[] args) {
		String[] strArray = {"Lalit", "Vishwash", "Chaandra", "Lalit"};
		
		for(int i=0; i<strArray.length-1; i++) {
			for(int j=1; j<strArray.length; j++) {
				if(strArray[i] == strArray[j] && i!=j) {
					System.out.println("Duplicate Elements are: "+strArray[j]);
				}
			}
		}

	}

}
