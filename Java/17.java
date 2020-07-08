import java.io.*;
import java.io.IOException;
import java.util.Arrays;

public class temp {

    public static int sub1(int value){
        switch(value){
            case 1://one
            case 2://two
            case 6://six
            return 3;
            case 4://four
            case 5://five
            case 9://nine
            return 4;
            case 3://three
            case 7://seven
            case 8://eight
            return 5;

            case 10://ten
            return 3;
            case 11://eleven
            case 12://twelve
            return 6;
            
            case 15://fifteen
            case 16://sixteen
            return 7;
            case 18://eighteen
            case 19://nineteen
            case 13://thirteen
            case 14://fourteen
            return 8;
            case 17://seventeen
            return 9;

        } 
        return 0;
    }
    public static int sub2(int value){
        switch(value){
            case 1://ten
            return 3;
            case 5://fifty
            case 6://sixty
            case 4://forty
            return 5;
            case 2://twenty
            case 3://thirty
            case 9://ninety
            case 8://eighty
            return 6;
            case 7://seventy
            return 7;
        }
        return 0;
    }
    
    public static int totalChar(int value){
        int num = 0;
        int hundredDown = value % 100;
        int hundredUp = value / 100;
        if(hundredUp > 0 ){
            num += 7 + sub1(hundredUp);
            if(hundredDown != 0){
                num += 3;
            }
        }
        if(hundredDown < 20){
            num += sub1(hundredDown);
        }else{
            num += sub1(hundredDown % 10) + sub2(hundredDown / 10);
        }
        return num;
    }


    public static void main(String []args) {
        int ans = 0;
        for(int i = 1;i < 1000; i++){
            ans += totalChar(i);
        }
        ans += 11;//1000
        System.out.println(ans);
    }
}