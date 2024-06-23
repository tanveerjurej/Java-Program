public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4},
                     {5,6,7,8,},
                    {9,10,11,12},
                    {13,14,15,16}};
        transposeMatrix(arr);
        reverseColumn(arr);
        printMatrix(arr);

    }

    public static void printMatrix(int[][] arr){
        for(int[] val: arr){
            for (int ral: val){
                System.out.print(ral+" ");

            }
            System.out.println();
        }
    }
    public static void rotate90(int[][]arr){
        for (int i = 0; i< arr.length; i++){
            for (int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        int left=0, right=arr[0].length-1;
        while(left<right){
            for (int i=0;i< arr.length; i++){
                int temp = arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
            }
            left++;
            right--;
        }

    }
    public static void transposeMatrix(int[][] arr){
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverseColumn(int[][] arr){
        int left = 0, right = arr[0].length-1;
        while(left<right){
            for (int i =0; i<arr.length;i++) {
                int temp = arr[i][left];
                arr[i][left]= arr[i][right];
                arr[i][right]=temp;


            }
            left++;
            right--;
        }
    }
}
