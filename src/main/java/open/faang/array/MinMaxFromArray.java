package open.faang.array;

public class MinMaxFromArray {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 56, 10000, 167};
        System.out.println(getMinMax(arr));

    }
   private static String getMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];


        for(int i=0;i<=arr.length-1;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return "Min value: "+String.valueOf(min)+"| Max Value:" + String.valueOf(max);
   }
}
