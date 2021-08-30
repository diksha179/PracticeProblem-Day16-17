package blz.algorithmprogram;

public class InsertionStringSort{
	public static void main(String[] args) {
		
		String array[] = {"diksha","sneha","abhishek","komal"};
		System.out.println("before sorting: ");	
		for(String item: array) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		for (int i =1; i<array.length;i++) {
			String temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j].compareTo(temp)>0) {				
				array[j+1] = array[j];
				j--;
			}
			array[j+1]=temp;
		}
		
		System.out.println("after sorting: ");	
		for(String item: array) {
			System.out.print(item+" ");
		}
	}
}
		
	
