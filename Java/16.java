import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {
    
    public static void main(String []args) {
        int [] list = new int[501];
        list[500] = 1;
        for(int i = 0;i < 500;i++){
            list[i] = 0;
        }
        for(int i = 0;i < 1000;i++){
            for(int j = 500;j>=1;j--){
                list[j] *= 2;
            }
            for(int j = 500; j >= 1; j--){
                if(list[j] >= 10){
                    list[j] -= 10;
                    list[j-1] ++;
                }
            }
        }
        int sum = 0;
        for(int i = 500; i >= 1;i--){
            
            sum += list[i];
        }
        System.out.println(sum);
    }
}