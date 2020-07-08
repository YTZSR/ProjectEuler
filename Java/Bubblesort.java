import java.io.*;
import java.io.IOException;
import java.util.Arrays;


public class Bubblesort {
    public static void switchNum(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void bubblesort(int []arr, int high){
        if(high == 0){
            return;
        }
        for(int i = 0; i < high;i++){
            if(arr[i] > arr[i + 1]){
                switchNum(arr, i, i + 1);
            }
        }
        bubblesort(arr, high - 1);
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
        bubblesort(arr, 9);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}