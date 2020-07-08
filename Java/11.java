import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static boolean inRange(int value, int dir){
        if(value + dir * 3 < 0 || value + dir * 3 > 19){
            return false;
        }else{
            return true;
        }
    }

    public static int product(int row, int col,int[][] num){
        int value = 0;
        int x = 1;
        for(int i = -1;i <= 1;i++){
            for (int j = -1; j <= 1; j++){
                if (x < 6){
                    x++;
                }
                else{
                    if (inRange(row,i) && inRange(col,j)){
                        int temp = num[row][col] * num[row + i][col + j] * num[row + 2 * i][col + 2 * j] * num[row + 3 * i][col + 3 * j];
                        if (temp > value){
                            value = temp;
                        } 
                    }
                }
            }
        }
        return value;
    }
    public static void main(String []args) throws IOException {
        File file = new File("11.txt");      
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
        int[][] num = new int[20][20];

        for(int i = 0; i < str.length();i++){
            if(str.charAt(i)-48 >= 0 && str.charAt(i)-48 <= 9){
                temp = (str.charAt(i)-48) * 10 + str.charAt(i+ 1)-48;
                i++;
                num[row][col] = temp;
               // System.out.print(num[row][col] + " " );
                row ++;
                if (row == 20){
                    row = 0;
                    col++;
                    //System.out.print("\n");
                }
                if (col == 20){
                    break;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < 20;i++){
            for(int j = 0;j < 20;j++){
                if(ans < product(i,j,num)){
                    ans = product(i,j,num);
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(ans);
    }
}