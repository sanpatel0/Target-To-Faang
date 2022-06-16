package open.faang.array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class KthSmallestNo {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 56, 10000, 167};
       // System.out.println("Kth Smallest is : "+kthSmallest(arr,4));
         System.out.println("Kth Smallest is : "+kthSmallestUsingMap(arr,4));

    }

    public static int kthSmallestUsingMap(int[] arr,int iTh){
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i = 0;i<=arr.length-1;i++){
            map.put(i+1,arr[i]);
        }
        return map.get(iTh);
    }

    public static int kthSmallest(int[] arr,int iTh){
        Arrays.sort(arr);
        return arr[iTh-1];
    }
}
