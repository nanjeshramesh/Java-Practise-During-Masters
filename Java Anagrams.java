Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting . 
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".




Solution:

import java.util.Scanner;

public class Solution {


static boolean isAnagram(String A, String B) {
      //Complete the function 
       int temp,i;  int arr[]=new int[26];
        
         if(A.length()!=B.length()){return false;}
       for(i=0;i<A.length();i++)
           {
           temp=A.charAt(i);
           if(temp>=65 && temp<=90){arr[temp-65]++;}
                 else if(temp>=97 && temp<=122){arr[temp-97]++;}
       }
       for(i=0;i<A.length();i++)
           {
           temp=B.charAt(i);
           if(temp>=65 && temp<=90){arr[temp-65]--;}
                 else if(temp>=97 && temp<=122){arr[temp-97]--;}
       }
       for(i=0;i<26;i++)
           {
           if(arr[i]!=0) return false;
           
       }
       return true;
   
   }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
