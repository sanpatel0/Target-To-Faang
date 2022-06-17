package open.faang.array;


import java.util.Arrays;

class MinDiff {
    int getMinDiff(int[] arr, int n, int k) {

        Arrays.sort(arr);
        int diff = arr[n-1]-arr[0];
        int min,max;

        for(int i = 0;i<n;i++){
            if(arr[i]-k<0) continue;
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[i]-k,arr[0]+k);
            diff = Math.min(diff,max-min);
        }
        return diff;
    }
}