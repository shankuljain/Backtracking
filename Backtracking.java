
import java.io.*;
import java.util.*;

class Problem1{
	public static void main(String [] args) throws Exception{
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		//for(int i=0;i<primeNo.length;i++){
		//	System.out.println(primeNo[i]);
		//}
		
		int t =  Integer.parseInt(rd.readLine());
		int a[] = new int[t];
		for(int i = 0;i<t;i++){
			a[i] = Integer.parseInt(rd.readLine());
		}
		
		for(int i=0;i<t;i++){
			count = 0;
			System.out.println(solveProblem(a[i],3));
		}
	}
	
	private static int solveProblem(int x, int d ){
		
		if(x == 7 || x==5 || x== 3 || x ==2){
			count++;
			return count;
		}else if(x ==1){
			return -1;
		}
		
		while(d!=-1){
			if(x > primeNo[d]){
				if(solveProblem(x-primeNo[d],d) == -1){
					solveProblem(x,d-1);
					d = 0;
				}else{
					count++;
					d = 0;
				}

			}			
			d--;
		}
		
		return count;
		
	}
	
	private static int count = 0;
	private static int[] primeNo = {2,3,5,7};
}