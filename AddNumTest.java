package targetNum;

public class AddNumTest {

	public static void main(String[] args) {
	
		int[] nums= {2,7,11,15};
		
		for(int i=0;i<nums.length;i++) {
			for(int j=1;j<nums.length;j++) {
				int add=nums[i]+nums[j];
				if(add==17) {
					System.out.println("["+ i + ","+j + "], target= "+add);
				}
			}
		}
	}

	/*
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
}
