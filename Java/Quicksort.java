import java.io.*;
import java.io.IOException;
import java.util.Arrays;


public class Quicksort {
    public static void switchNum(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void quicksort(int []arr, int low, int high){
        if(low >= high){//one element
            return;
        }
        if(low == high - 1){ // two elements
            if(arr[low] > arr[high]){
                switchNum(arr, low, high);
            }
            return;
        }
        //general case
        int i = low;
        int j = high;
        int count = 0;
        while(i != j){
            //System.out.println(arr[i] + " " + arr[j] + " " + i + " " + j);
            if(arr[i] < arr[j]){
                if(count == 0){
                    j--;
                }
                else{
                    i++;
                }
            }
            else{
                switchNum(arr, i, j);
                count = Math.abs(1-count);
            }
        }
        quicksort(arr, low, i-1);
        quicksort(arr, i+1, high);
    }

    
    public static void main(String []args)  {
        int [] arr = new int[10];
        arr[0] = 3;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 7;
        arr[5] = 2;
        arr[6] = 5;
        arr[7] = 4;
        arr[8] = 9;
        arr[9] = 6;
        quicksort(arr, 0, 9);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}