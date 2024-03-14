import java.util.*;
class pro7{
	public static void main(String args[]){
		int i,flag=0,pos=0;
		int arr[] = new int[10];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = scn.nextInt();
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++)
			arr[i] = scn.nextInt();
		System.out.println("The array is : ");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		System.out.println("\nEnter the element to search : ");
		int element = scn.nextInt();
		for(i=0;i<n;i++){
			if(arr[i] == element){
				pos = i+1;
				flag = 1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Element Found at position : "+pos);
		}else{
			System.out.println("Element not found");
		}
	}
}

