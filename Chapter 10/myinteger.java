package chapter10;

public class myinteger {
    private int value;

    public myinteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
    	int range = (int)Math.sqrt(value);
 
        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
       int range = (int)Math.sqrt(value);

        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(myinteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(myinteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(myinteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(myinteger myInteger) {
        return this.value == myInteger.value;
    }

  
    public static int parseInt(char[] value) {

        double valueDouble = 0;
        int toPower = value.length - 1;
        for (char aValue : value) {

            valueDouble += Math.pow(10, toPower--) * (aValue - '0');
        }

        return (int)valueDouble;
    }

    public static int parseInt(String value) {

        return myinteger.parseInt(value.toCharArray());
    }
}
