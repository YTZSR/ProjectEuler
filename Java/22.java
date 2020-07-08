import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {
    //total name 5163
    public static boolean fun(char []name, char[]name2){
        for(int i = 0;i < 11;i++){
            if(name[i] > name2[i]){
                return true;
            }
            if(name[i] < name2[i]){
                return false;
            }
        }
        return false;
    }

    public static int nameValue(char[]name){
        int value = 0;
        for(int i = 0;i < 11;i++){
            value += name[i] - 64;
        }
        return value;
    }

    public static void main(String []args) throws IOException {
        File file = new File("22.txt");      
        FileInputStream fip = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        String str = sb.toString();
        

        char [][] names = new char[5163][11];
        for(int i = 0;i < 5163;i++){
            for(int j = 0;j < 11;j++){
                names[i][j] = 'A'-1;
            }
        }

        int order = 0;
        int temp = 0;
        long sum = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                
                int j = 0;
                while(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                    names[order][j] = str.charAt(i);
                    i++;
                    j++;
                }
                order ++;
            }
        }
        reader.close();
        for(int i = 0;i < 5163;i++){
            order = 1;
            for(int j = 0;j < 5163;j++){
                if(fun(names[i], names[j] )== true){
                    order++;
                }
            }
            sum += order * nameValue(names[i]);

        }
        System.out.println(sum);
    }
}