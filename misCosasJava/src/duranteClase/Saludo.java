package duranteClase;

import java.util.Arrays;

public class Saludo {

	public static int[] order(int []nums) {
		int aux;
		for(int i =0;i<nums.length;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					aux=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=aux;
				}
				System.out.println(Arrays.toString(nums));
			}
			
		}
		return nums;
		
	}
	public static void main(String[] args) {
		int []nums={6,5,3,1,8,2};
		System.out.println("Mi array"+Arrays.toString(nums));
		order(nums);
		System.out.println(Arrays.toString(nums));
	}

}
