package Sorting.bubblesort;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,3,7,34,12};
        bubble(arr);
        for(int i : arr){
            System.out.print(i + "  ");
        }

    }

    private static void bubble(int[] arr) {
        for(int i = 0; i < arr.length -1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
