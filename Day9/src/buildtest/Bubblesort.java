package buildtest;

public class Bubblesort {

	public static void main(String[] args) {
		
		int a,b,t;
		int size = 7;
		int nums[] = {10,3,41,52,39,8,96};
		
		System.out.println("**************Bubble Sort************");
		
		System.out.println("######Array used for sorting#######");
	for(int j=0;j<size;j++){
		System.out.println(+nums[j]);
		
	}	
		
		
		for(a=1;a<size;a++){
			
			for(b=size-1;b>=a;b--){
				
				if(nums[b-1] > nums[b]){
				//Exchange elements	
					t= nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
					
					
				}
				
				
			}
			
			
		}

	//display the sorted array
		
		System.out.println("*************Sorted array is***************");
		for(int k=0;k<size;k++){
			System.out.println(""+nums[k]);
			
		}
	
	
	}

}
