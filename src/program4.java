// Write a java program to read two strings and number of characters. Two functions will have same name and each function will accept different number of arguments. First version compares first string with second string completely and second version compares only specified number of characters from first string with second string. The program must follow compile time comparison.

import java.util.*;
class Main{
    static void strcmp(String s1,String s2) {
        if(s1.compareTo(s2)==0)
        System.out.println("Both strings are the same.");
        else
        System.out.println("Strings are different.");
    }

    static void strcmp(String s1,String s2,int n) {
        int i=0;
        for(i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i))break;
        }
        if(i==n)System.out.println("Substrings of length " + n + " are the same.");
        else
        System.out.println("Substrings are unequal.");
    }

    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
        String s1,s2;
        int n;
        System.out.println("Enter 2 strings_");
        s1=sc.next();
        s2=sc.next();
        System.out.println("Enter number of characters to compare:");
        n=sc.nextInt();
        strcmp(s1,s2);
        strcmp(s1,s2,n);        
    }
}
