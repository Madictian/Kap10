public class Myinteger {
    private int value = 1000;


    public Myinteger(){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isOdd(){
        if (this.value % 2 == 0){
            return false;
        }else{
            return true;
        }
    }
    public boolean isEven(){
        if (this.value % 2 == 0){
            return true;
        }else{
            return false; }
    }
    public boolean isPrime(){
        for(int i=2;i < this.value;i++) {
            if(this.value%i==0)
                return false;
            break;
        }
        return true;

    }

    public static boolean isOdd(int value){
        if (value % 2 == 0){
            return false;
        }else{
            return true;
        }
    }
    public static boolean isEven(int value){
        if (value % 2 == 0){
            return true;
        }else{
            return false;
        }

    }
    public static boolean isPrime(int value){
            for(int i = 2;i < value; i++) {
                if(value % i == 0)
                return false;
                break;
            }
            return true;

    }

    public static boolean isOdd(Myinteger value){

        if (value.getValue() % 2 == 0){
            return false;
        }else{
            return true;
        }
    }
    public static boolean isEven(Myinteger value){
        if (value.getValue() % 2 == 0){
            return true;
        }else{
            return false;
        }

    }
    public static boolean isPrime(Myinteger value){

        for(int i = 2;i < value.getValue(); i++) {
            if(value.getValue() % i==0)
                return false;
            break;
        }
        return true;

    }

    public static int parseint(char[] chars){
        String parsing = "";
        for(int i = 0; i < chars.length; ++i) {
            parsing += chars[i];
        }

        return Integer.valueOf(parsing);
    }

    public static int parseint(String string){

        return Integer.valueOf(string);
    }

}
