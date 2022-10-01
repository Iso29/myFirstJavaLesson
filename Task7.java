package ilkAyucunTasklar;


public class Task7 {
	 public static char[] removeTheElement(char[] arr, int index)
	    {
	 
	        // If the array is empty
	        // or the index is not in array range
	        // return the original array
	        if (arr == null || index < 0
	            || index >= arr.length) {
	 
	            return arr;
	        }
	 
	        // Create another array of size one less
	        char[] anotherArray = new char[arr.length - 1];
	 
	        // Copy the elements except the index
	        // from original array to the other array
	        for (int i = 0, k = 0; i < arr.length; i++) {
	 
	            // if the index is
	            // the removal element index
	            if (i == index) {
	                continue;
	            }
	 
	            // if the index is not
	            // the removal element index
	            anotherArray[k++] = arr[i];
	        }
	 
	        // return the resultant array
	        return anotherArray;
	    }
	 
	 public static void MinEqSet(char[] set) {
		 int i = 0;
		 int j = 1;
		 char[] tempSet = new char[set.length];
		 while(i<tempSet.length-1) {
			 while(j<tempSet.length) {
				 if(tempSet[i]==tempSet[j]) {
					 tempSet=removeTheElement(tempSet,j);
					 
				 }
				 else {
					 j++;
				 }
				 
			 }
			 i++;
		 }
		 
		 System.out.print("set a = { ");
		 for(char c : set) {
			 System.out.print(c+" ");
		 }System.out.print("}");
		 
		 int s =0 ;
		 int size = tempSet.length*tempSet.length;
		 char[][] eqSet = new char[size][];
		 while(s<size) {
			 for(int b=0;b<tempSet.length;b++) {
				 for(int a=0;a<tempSet.length;a++) {
					 eqSet [s] =new char[] {tempSet[b],tempSet[a]};
					 s++;
				 }
				 
			 }
		 }
		 
		 
		 for(char[] arr: eqSet) {
			 System.out.print("equivalent Set = { ");
			 for(char c: arr) {
	                System.out.print(c+" ");
	            }
			 System.out.print(" }");
	         System.out.println();
	            
	        }
		 
		 
	 }
}
