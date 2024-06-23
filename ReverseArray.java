public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {1,52,45,84,35,12,87};
        int n = arr.length-1;
        for (int i=0; i<n/2; i++){
            int swap = arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=swap;
        }
        for (int a:arr) {
            System.out.println(a);

        }

    }
}
