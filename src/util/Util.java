package util;


public class Util {
    
    //5227 6513 0915 5386
    //5315 3980 9262 2155
    //4716 6413 6134 6321
    public static boolean validaCartao(String number) {
        int s1 = 0, s2 = 0;
        String reverse = new StringBuffer(number).reverse().toString();
        for (int i = 0 ;i < reverse.length();i++) {
            int digit = Character.digit(reverse.charAt(i), 10);
            if(i % 2 == 0) { s1 += digit; }
            else {
                    s2 += 2 * digit;
                    if (digit >= 5) { s2 -= 9; }
            }
        }
        return (s1 + s2) % 10 == 0;
    } 
}
