package Day1;

public class Solution1Java {
    void prank(long[] a, int n)
    {
        long[] b=new long[n];
        for(int i=0;i<n;i++){
            b[i]=a[(int)a[i]];
        }
        for(int j=0;j<n;j++){
            a[j]=b[j];
        }
    }
}
