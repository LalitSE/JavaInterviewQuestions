import java.util.Arrays;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
	
	/*int[] nums = new int[]{1,2,1,3,4,1,2};
	Arrays.sort(nums);
	for(int i=0; i< nums.length-1; i++) {
		//System.out.println(nums[i]);
		
		if(nums[i] == nums[i+1]) {
			System.out.println("Duplicate number: "+nums[i+1]);
		}
		
	}*/
		
		int[] array = {2,3,4,2,5};
		System.out.println(array.length);
		for(int i=0; i<array.length-1;i++) {
			for(int j=1;j<array.length;j++) {
				if(array[i] == array[j] && i!=j) {
					System.out.println("Duplicate number is: "+array[j]);
				}
			}
		}
	}
	
}
