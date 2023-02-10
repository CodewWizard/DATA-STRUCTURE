package CODES.RECURSION.OLD;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[], int row, int col, int max){
        if(row == 0){
            return;
        }

        if(row > col){
            if(arr[col] > arr[max]){
                selectionSort(arr, row, col+1, col);
            }
            else{
                selectionSort(arr, row, col + 1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selectionSort(arr, row - 1, 0, 0);
        }
    }
}
