import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static int sum(int value){
        int a = 0;
        for(int i = 1;i < value;i++){
            if(value % i == 0){
                a += i;
            }
        }
        return a;
    }

    public static void main(String []args)  {
        int total = 0;
        for(int i = 1; i < 10000;i++ ){
            if(sum(i) > i){
                if (i == sum(sum(i))){
                    total += i + sum(i);
                }
            }
        }
        System.out.println(total);
    }
}