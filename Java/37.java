import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {
    public static boolean isPrime(int value){
        if(value == 1){
            return false;
        }
        for(int i = 2; i < value;i++){
            if(i * i > value){               
                return true;
            }
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean leftstart(int value){
        int temp = 10;
        while(true){
            if (isPrime(value % temp) != true){
                return false;
            }
            if(value % temp == value){
                break;
            }
            temp *= 10;

        }
        return true;
    }
    public static boolean rightstart(int value){
        int temp= value;
        while(temp >= 1){
            if(isPrime(temp) != true){
                return false;
            }
            temp /=10;
        }
        return true;
    }
    
    public static void main(String []args)  {
        int [] list = new int[11];
        int i = 11;
        int order = 0;
        while(order < 11){
            if(leftstart(i) && rightstart(i)){
                list[order] = i;
                order++;
                //System.out.println(i);
            }
            i++;
        }
        int sum = 0;
        for(int j = 0;j < 11;j++){
            sum += list[j];
        }
        System.out.println(sum);
    }
}