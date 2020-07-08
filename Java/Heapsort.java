import java.io.*;
import java.io.IOException;
import java.util.Arrays;


public class Heapsort {
    public static void switchNum(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void update(int []arr, int x, int len){
        if(x * 2 + 1 >= len){
            return;
        }//leaves
        if(x * 2 + 2 == len ){
            if(arr[x] < arr[x * 2 + 1]){
                switchNum(arr, x, x * 2 + 1);
            }
            return;
        }//one leaf
        if(arr[x] >= arr[2 * x + 1] && arr[x] >= arr[2 * x + 2]){
            return;
        }//alread the biggest

        if(arr[2 * x + 1] >= arr[2 * x + 2]){
            switchNum(arr, x, 2 * x + 1);
        }else{
            switchNum(arr, x, 2 * x + 2);
        }//general case        
    }

    public static void heapsort(int []arr, int high){
        if(high == 0){
            return;
        }
        for(int i = (high + 1) / 2 - 1; i >= 0; i--){
            update(arr, i, high + 1);
        }
        switchNum(arr, 0, high);
        heapsort(arr, high - 1);
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
        heapsort(arr, 9);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}