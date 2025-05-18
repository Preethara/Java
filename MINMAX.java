public class Main {
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	int MAX = arr[0], MIN = arr[0];
	for(int i=1; i<arr.length;i++){
	    if(arr[i]>MAX) MAX = arr[i];
	    if(arr[i]<MIN) MIN =arr[i];
	}
	System.out.println("Maximum="+MAX);
	System.out.println("Minimum="+MIN);
}
}