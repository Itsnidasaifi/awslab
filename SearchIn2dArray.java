import java.util.Arrays;

public class SearchIn2dArray {
    static int[] searchIn(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4,5,6},
            {12,45,67,89,88},
            {23,63}
        };
        int target=23;
        int ans[]=searchIn(arr, target);
        System.out.println(Arrays.toString(ans));
        
        
    }
    static int mainly(){
        int[] arr = new int[7];
        int length = arr.length;

        String str = "x";
        str.length();

        
    }
    
}
