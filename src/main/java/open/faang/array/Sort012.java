package open.faang.array;

public class Sort012 {
    // Sort 0 1 and 2s
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        int C0 = 0;
        int C1 = 0;
        int C2 = 0;
        for(int i = 0;i <= arr.length-1;i++){
            if(arr[i]==0){
                C0++;
            }
            if(arr[i]==1){
                C1++;
            }
            if(arr[i]==2){
                C2++;
            }
        }
        int j = 0;
        for(j=0;j<C0;j++){
            arr[j] = 0;
        }
        for(;j<C1+C0;j++){
            arr[j] = 1;
        }
        for(;j<C2+C1+C0;j++){
            arr[j] = 2;
        }

        for(int a : arr){
            System.out.print(a+" ");
        }
    }

}
