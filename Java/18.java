import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static void main(String []args) throws IOException {
        File file = new File("18.txt");      
        FileInputStream fip = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        String str = sb.toString();
        

        int row = 0;
        int col = 0;
        int temp = 0;
        int[][] list = new int[15][15];
        for (int j = 0; j < 15;j++){
            for(int h = 0; h <= j;h++){
                list[j][h] = 0;
            }
        }

        int i = 0;
        for (int j = 0; j < 15;j++){
            for(int h = 0; h <= j;h++){
                while(str.charAt(i)-48 < 0 || str.charAt(i)-48 > 9){
                    i++;
                }
                list[j][h] = (str.charAt(i)-48) * 10 + str.charAt(i+ 1)-48;
                //System.out.print(list[j][h] + " ");
                i += 2;
            }
            //System.out.println("\n");
        }

        int[][] sum = new int[15][15];
        for (int j = 0; j < 15;j++){
            for(int h = 0; h <= j;h++){
                sum[j][h] = 0;
            }
        }
        sum[0][0] = list[0][0];

        for(int j = 1;j < 15;j++){
            for(int h = 0; h <= j; h++){
                if(h == 0){
                    sum[j][h] = sum[j-1][h] + list[j][h];
                }
                else{
                    sum[j][h] = Math.max(sum[j-1][h], sum[j-1][h-1]) + list[j][h];
                }
                System.out.print(sum[j][h] + " ");
            }
            System.out.println("\n");
        }
        int ans = 0;
        for(int j = 0; j < 15; j++){
            if (sum[14][j] > ans){
                ans = sum[14][j];
            }
        }
        System.out.println(ans);
    }
}