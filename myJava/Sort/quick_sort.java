package Sort;

import java.util.Arrays;

public class quick_sort {
    public int lomuto(int l,int r,int[] a)
    {
        int pivot=a[r];int ru=l-1;int luu;
        for(int i=l;i<=r;i++)
        {
            if(a[i]<=pivot)
            {
                ru++;
                luu=a[ru];
                a[ru]=a[i];
                a[i]=luu;
            }
        }
        return ru;
    }
    public void quickS(int l,int r,int [] a)
    {
        if(l>r) return;
        int k=lomuto(l,r,a);
        quickS(l, k-1, a);
        quickS(k + 1, r, a);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        quick_sort b=new quick_sort();
        b.quickS(0, a.length-1, a);
        for(int x:a) System.out.print(x+" ");
        
    }
}
