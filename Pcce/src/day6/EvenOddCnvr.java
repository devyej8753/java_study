package day6;

import java.util.Arrays;

public class EvenOddCnvr {
	public static void main(String[] args) {
		
			int num_list[] = {1,2,3,4,5};
		    int list[] = new int[2];
		        int even = 0;
		        int odd = 0;
		        for(int num : num_list){
		            if(num %2==0){
		                even++;
		            }else{
		                odd++;
		            }
		        }
		        list[0] = even;
		        list[1] = odd;
		        System.out.println(Arrays.toString(list));
		    
		
		
		
	}
}
