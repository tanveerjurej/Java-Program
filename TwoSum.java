import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TwoSum {
    public static void main(String[] args) {
        //add to number in the array to find the target
        int []arr = {1,4,3,54,2,46,5,48,6,4,84,2,6};

        int target= 11;
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0; i< arr.length; i++){
            int sno = target - arr[i];
            if (map.containsKey(sno)){
                ans[0]=map.get(sno);
                ans[1]= i;
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println(ans[0] +"  "+ ans[1]);


    }

}
