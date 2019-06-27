package oop.dataTypeConversion;

public class sumNumbers {

    private int num = 12345;
    private int sum = 0;

    public int sumModulo(){

        while(num>0) {
            sum += num%10;
            num = num / 10;
        }
        return sum;
    }


    public int sumSplittingCharacters(){

    String string = String.valueOf(num);
    char[] array = string.toCharArray();

        for (char a : array){
        sum += Integer.parseInt(String.valueOf(a));
    }
        return sum;
 }

}
