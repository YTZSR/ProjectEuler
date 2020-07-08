import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static void main(String []args) throws IOException {
        int day = 1;
        int total = 0;
        for(int year = 1901; year <= 2000; year++){
            for(int month = 1;month <= 12;month ++){
                switch(month){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        day += 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        day += 30;
                        break;
                    case 2:
                        if(year % 4 == 0){
                            day += 29;
                        }else{
                            day += 28;
                        }
                }
                if(day % 7 == 6){
                    total ++;
                }
            }
        }


        System.out.println(total);
    }
}