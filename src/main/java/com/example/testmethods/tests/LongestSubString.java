package com.example.testmethods.tests;

public class LongestSubString {

    public static int longestSubString(String str){

         int n=str.length();
         int res=0;

         for(int i=0; i<n;i++){//loop through the string
             // Note : Default values in visited are false
             boolean[] visited = new boolean[256];
             for(int j = i; j < n; j++)
             {
                 // If current character is visited
                 // Break the loop
                 if (visited[str.charAt(j)] == true)
                     break;
                     // Else update the result if
                     // this window is larger, and mark
                     // current character as visited.
                 else
                 {
                     res = Math.max(res, j - i + 1);
                     visited[str.charAt(j)] = true;
                 }
             }

             // Remove the first character of previous
             // window
             visited[str.charAt(i)] = false;
         }
        return res;
    }
    public static void main (String args[]){
        String name = "MADDIE";
        System.out.println("The input string is " + name);

        int len = longestSubString(name);
        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + len);

    }
         }

