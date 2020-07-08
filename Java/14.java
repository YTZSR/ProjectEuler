import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static int chain(long value,int already){
        if(value == 1){
            return already + 1;
        }
        if(value % 2 == 0){
            return chain(value / 2, already + 1);
        }else{
            return chain(3 * value + 1, already + 1);
        }
    }
    public static void main(String []args) {
        long ans = 0;
        int length = 0;
        int temp = 0;
        for(long i = 1; i < 1000000;i++){
            temp = chain(i,0);
            if (temp > length){
                length = temp;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}