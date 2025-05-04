package first_java;

public class checkPalindrome {
    public static void main(String[] args) {
        checkforpalindrome("abba");
    }

    private static void checkforpalindrome(String str) {
        
        String strRev= "";
        for(int i=str.length()-1;i>=0;i--){
            strRev = strRev + str.charAt(i);
        }
        if(strRev.equals(str)){
            System.out.println("The string is palindrome.");
        }
        else {
            System.out.println("Not!!!!!");
        }
    }

    
}
