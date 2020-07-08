import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static int numOfDivisors(long value){
        int num = 0;
        for(long i = 1;i <= value;i++){
            if(i * i == value){
                num += 1;
                break;
            }
            if(i * i > value){
                break;
            }
            if(value % i == 0 ){
                num += 2;
            }
        }
        return num;
    }

   
    public static void main(String []args) {
        long ans = 1;
        long i = 2;
        while(true){
            ans += i;
            if(numOfDivisors(ans) > 500){
                break;
            }
            i++;
        }
        System.out.println(ans);
    }
}