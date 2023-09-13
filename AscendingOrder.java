package first;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int [] a = {76,98,52,23,111,2,3,4444,566,9};
     int k=0;
     for(int i=0;i<a.length;i++) {
    	 
    	 for(int j=i+1;j<a.length;j++) {
    		 
    		 if (a[i]>a[j]) {
    			
    			k=a[i];
    			a[i]=a[j];
    		    a[j]=k;
    			 
    		 }
    	 }
     }
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+ ",");
}

	}

}
     
