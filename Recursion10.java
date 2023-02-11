public class Recursion10 {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //array is sorted till now
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5};
        System.out.println(isSorted(arr, 0));
    }
    
}

//Check if an array is sorted (Strictly Increasing)