// 1. write a java program to count number of vowels in string

// 2. write a java program to convert case of each letter
        // input = "JavaDev"
        // output = "jAVAdEV"

// 3. Write a program to count occurrence of a given char in a string

package string;

public class StringPallindrome {

    public static void main(String[] args) {
        System.out.println(isPallindrome("Malayalam"));
    }

    static boolean isPallindrome(String str){
        str = str.toLowerCase();

        int len = str.length();
        for (int i =0; i<len/2; i++){
            if (str.charAt(i) != str.charAt(len-1-i)) return false;
        }
        return true;
    }
}
