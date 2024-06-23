public class FrequencyOfWord {
    public static void main(String[] args) {
        int[] arr = {3,26,3,3,2,3,15,3,12,5,3,21,3,3,3,4,2,12,3,1,3,21,3};
        System.out.println(solution(arr, arr.length));



    }
    public static int solution(int[] arr, int n){
        int count =1;
        int candid= arr[0];
        for (int i =0; i<n; i++){
            if (arr[i]==candid){
                count++;
            }
            else {
                count--;
            }
            if (count==0){
                candid=arr[i];
                count=1;
            }
        }
        count=0;
        for(int value: arr) {
            if(value == candid){
               count++;
            }
        }
        if(count>n/2){
            return candid;
        }
        else {
            return -1;

        }
    }
}
