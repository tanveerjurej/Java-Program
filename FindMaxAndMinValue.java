public class FindMaxAndMinValue {


    public static void main(String[] args) {
        int[] arr={1,5,3,1,4,8,65,2,54,6,2165,13};

        findMaxMin(arr);
    }
    static void findMaxMin(int[] arr){
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            } else if (arr[i]<min) {
                min=arr[i];

            }
        }
        System.out.println("max value is "+max);
        System.out.println("min value is "+min);
    }
}
