/*
 Author: Jan McNulty
 Date: 6/15/22
 */

package chapter10;

public class Exercise10_3 {

	public static void main(String[] args) {
        myinteger num1 = new myinteger(7);
        myinteger num2 = new myinteger(8);
        myinteger num3 = new myinteger(25);

        System.out.printf("Number 1 = %d isPrime: %b isOdd: %b isEven %b\n",
                num1.getValue(), num1.isPrime(), num1.isOdd(), num1.isEven());

        System.out.printf("Number 2 = %d isPrime: %b isOdd: %b isEven %b\n",
                num2.getValue(), num2.isPrime(), num2.isOdd(), num2.isEven());
        System.out.printf("Number 3 = %d isPrime: %b isOdd: %b isEven %b\n",
                num3.getValue(), num3.isPrime(), num3.isOdd(), num3.isEven());

        System.out.printf("Num 1 == Num 2: %b\n", num1.equals(num2));
        System.out.printf("Num 1 == Num 3: %b\n", num1.equals(num3));
        System.out.printf("Parse int 100 string value == %d\n", myinteger.parseInt("100"));
        System.out.printf("Parse int 150 char array value == %d\n", myinteger.parseInt("150".toCharArray()));

	}

}
