import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static void main(String []args) throws IOException {
        File file = new File("13.txt");      
        FileInputStream fip = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        String str = sb.toString();
        

        int row = 0;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int[][] num = new int[100][50];

        for(int i = 0; i < str.length();i++){
            if(str.charAt(i)-48 >= 0 && str.charAt(i)-48 <= 9){
                for(int j = 0; j < 50;j++){
                    num[row][j] = str.charAt(i++)-48;
                    //System.out.print(num[row][j] + " ");
                }
                row++;
                if(row == 100){
                    break;
                }
            }

        }

        int [] ans = new int[53];
        for(int i = 49; i >= 0;i--){
            temp1 = temp2;
            temp2 = temp3;
            temp3 = 0;
            ans[i+3] = temp1;
            for(int j = 0;j < 100;j++){
                ans[i + 3] += num[j][i];
                if(ans[i + 3] >= 10){
                    ans[i + 3] -= 10;
                    temp1++;
                    if(temp1 == 10){
                        temp1 = 0;
                        temp2 ++;
                        if(temp2 == 10){
                            temp2 = 0;
                            temp3 ++;
                            System.out.println("a");
                        }
                    }
                }
            }
        } 
        ans[2] = temp1;
        ans[1] = temp2;
        ans[0] = temp3;
        for(int i = 0;i < 53;i++){
            System.out.print(ans[i]);
        }
        //System.out.println(ans);
        reader.close();
    }
}