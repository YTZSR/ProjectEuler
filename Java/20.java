import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static void main(String []args) throws IOException {
        int [] product = new int [10000];
        for(int i = 0;i < 10000;i++){
            product[i] = 0;
        }
        product[0] = 1;
        int temp = 0;
        for(int i = 2;i <=100;i++){
            for(int j = 0;j< 10000; j++){
                product[j] *= i;
            }
            temp = 0;
            for(int j = 0;j< 10000; j++){
                product[j] += temp;
                temp = product[j] / 10;
                product[j] = product[j] % 10;
            }
        }
        int total = 0;
        for(int j = 0;j< 10000; j++){
            total += product[j];
        }
        System.out.println(total);
    }
}