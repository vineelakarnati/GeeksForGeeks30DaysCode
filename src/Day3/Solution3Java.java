package Day3;

import java.io.*;
import java.util.*;
class Solution3Java{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Test Cases");
        int t = sc.nextInt();
        while(t > 0){
            System.out.println("Enter Array size:");
            int n = sc.nextInt();
            long array[] = new long[n];
            System.out.println("Enter Array elements");
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextLong();
            }
            Solution ob = new Solution();
            System.out.println("output is"+ob.smallestpositive(array,n));
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    long smallestpositive(long[] array, int n){
        // Your code goes here
        Arrays.sort(array);
        long res=1;
        for(int i=0;i<n && array[i]<=res; i++){
            res += array[i];
        }
        return res;
    }
}
