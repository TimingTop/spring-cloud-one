package com.timing.cloud.netty;

public class Sort<T extends Comparable> {

    private T[] aux;

    public Sort(T[] a) {
//        aux = new Comparable[a.length];
    }

    public void merge(T[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public boolean less(T a, T b) {
        int result = a.compareTo(b);
        if (result < 0) {
            return true;
        } else {
            return false;
        }
    }


}
