package com.pixel.morganstanley;

public class ReverseAString {
    public static void main(String[] args) {
        // Using String Concatenation
        String str = "ABCD";
        String rev = "";

       /* int length = str.length();
        for (int i=length-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);*/
        // 2. Using Character Array
       /* char a[] = str.toCharArray();
        int length = a.length;
        for (int i=length-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println(rev);*/
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
