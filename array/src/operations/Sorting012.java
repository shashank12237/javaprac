package operations;

public class Sorting012 {

	
	public static void main(String[] args) {
		int a[]= {0,1,2,0,1,2,1};
		int n=a.length;
		 int count=0;
	        int count1=0;
	        int count2=0;
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]==0) {
	            count++;
	           }
	             if(a[i]==1) {
	            count1++;
	          
	             }
	             if(a[i]==2) {
	            count2++;
	            
	             }
	         }
	        int i=0;
	        while(count>0) {
	        	a[i++]=0;
	        	count--;
	        }
	        while(count1>0) {
	        	a[i++]=1;
	        	count1--;
	        }	         
	        while(count2>0) {
	        	a[i++]=2;
	        	count2--;
	        }
	          for(int j=0;j<n;j++)
	          {
	        	  System.out.print(a[j]+" ");
	          }
	         
	}

}
