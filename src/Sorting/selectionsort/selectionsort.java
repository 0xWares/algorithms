package Sorting.selectionsort;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,5,3,2,0,8,1};
        selection(arr);
        for(int i : arr){
            System.out.print(i);
        }
    }

    private static void selection(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
