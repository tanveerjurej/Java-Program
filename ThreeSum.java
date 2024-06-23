import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1,4,-6,7,2,8,5,3,-1,5,7};
        int target =7;
        solution(arr,target, arr.length);

    }
    public static void solution(int[]ary, int target, int n){
        Arrays.sort(ary);
        for(int i=0; i<n; i++){
           if(i==0 || (ary[i]!=ary[i-1])){
               int j = i+1, k=n-1;
               int tar = target-ary[i];
               while(j<k){
                   if (ary[j]+ary[k]==tar){
                       System.out.println(ary[i]+" "+ary[j]+" "+ary[k]);

                       while (j<k && ary[j]==ary[j+1]) j++;

                       while (j<k && ary[k]==ary[k-1]) k--;

                       j++;
                       k--;

                   } else if (ary[j]+ary[k]<tar) {
                       j++;

                   }else {
                       k--;
                   }
               }
           }
        }
    }
}
