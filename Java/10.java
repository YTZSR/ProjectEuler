public class temp {
    public static boolean isPrime(int value){
        for(int i = 2; i < value;i++){
            if(i * i > value){
                //System.out.println(value);
                return true;
            }
            if(value % i == 0){
                return false;
            }
        }
        //System.out.println(value);
        return true;
    }
    public static void main(String []args) {
        long sum = 0;
        for(int i = 2;i < 2000000;i++){
            if (isPrime(i) == true){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}