package io.github.fisksmk.codeskill;

/**
 * Created by Adrian Smykowski on 11.03.2017.
 */
public class LifeCoding6 {

    public static int[] mergeArrays(int[] a, int[] b){
        boolean emptyA = a == null || a.length==0;
        boolean emptyB = b == null || b.length==0;
        if(emptyA && emptyB){
            return new int[0];
        } else if (emptyA){
            return b;
        } else if (emptyB) {
            return a;
        }
        int[] c = new int[a.length+b.length];
        int ia=0,ib=0,ic=0;
        while (ia<a.length && ib<b.length) {
            if(a[ia] <= b[ib]){
                c[ic] = a[ia];
                ia++;
            } else {
                c[ic] = b[ib];
                ib++;
            }
        }
        if (ia<a.length){

        } else if (ib<b.length) {

        }
        return c;
    }

    public int[] countPairs(int a[]) {
        if (a == null || a.length == 0) {
            return new int[0];
        }
        int[] ret = new int[a.length/2+1];
        int ir=0;
        for (int ia=0; ia<a.length;){
            ret[ir] = a[ia++];
            ret[ir] += a[ia++];
        }
        return ret;
    }


}
