import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {
    
    public static int[] list = new int [200];

    public static int function(int num, int power){
        for(int i = 0;i < 200;i++){
            list[i] = 0;
        }
        list[0] = 1;
        for(int i = 0;i < power;i++){
            for(int j = 0;j < 200;j++){
                list[j] *= num;
            }
            for(int j = 0;j < 200;j++){
                while(list[j] >= 10){
                    list[j + 1] += list[j] / 10;
                    list[j] = list[j] % 10;
                }
            }
        }
        int ans = 0;
        for(int i = 0;i < 200;i++){
            ans += list[i];
        }
        return ans;
    }
    
    public static void main(String []args)  {
        int ans = 0;
        for(int i = 2;i < 100;i++){
            for(int j = 2;j < 100;j++){
                ans = Math.max(ans, function(i, j));
            }
        }
        System.out.println(ans);
    }
}