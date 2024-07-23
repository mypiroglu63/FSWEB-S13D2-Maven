package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(6));
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int number) {
        // Negatif sayıları pozitif yapmak için mutlak değerini al
        int absNumber = Math.abs(number);

        // Sayıyı string'e çevir
        String numberStr = String.valueOf(absNumber);

        // String'i ters çevir
        String reversedStr = new StringBuilder(numberStr).reverse().toString();

        // Ters çevrilmiş string'i tekrar integer'a çevir ve döndür
        int reverseInt = Integer.parseInt(reversedStr);

        // Palindrom kontrolü
        return absNumber == reverseInt;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }

    public static String numberToWords(int sayi){
        String output = "";
        if(sayi < 0){
            return "Invalid Value";
        }
        else{
            String stringSayi = String.valueOf(sayi);
            char[] charArray = stringSayi.toCharArray();

            for (int i = 0 ; i < charArray.length ; i++) {
                if(charArray[i]=='0'){
                    output += "Zero ";
                }
                else if(charArray[i]=='1'){
                    output += "One ";
                }
                else if(charArray[i]=='2'){
                    output += "Two ";
                }
                else if(charArray[i]=='3'){
                    output += "Three ";
                }
                else if(charArray[i]=='4'){
                    output += "Four ";
                }
                else if(charArray[i]=='5'){
                    output += "Five ";
                }
                else if(charArray[i]=='6'){
                    output += "Six ";
                }
                else if(charArray[i]=='7'){
                    output += "Seven ";
                }
                else if(charArray[i]=='8'){
                    output += "Eight ";
                }
                else if(charArray[i]=='9'){
                    output += "Nine ";
                }
            }

        }
        return output.trim();

    }
}