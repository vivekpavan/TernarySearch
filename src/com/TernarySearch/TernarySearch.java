package com.TernarySearch;

public class TernarySearch {
    public int ternarySearch(int[] array,int number){
        var left = 0;
        var right = array.length - 1;
        return ternarySearch(array,number,left,right);
    }
    private int ternarySearch(int[] array,int number,int left,int right){
        if(left > right)
            return -1;
        var partitionsize = (right - left) / 3;
        var mid1 = left + partitionsize;
        var mid2 = right - partitionsize;
        if(array[mid1] == number)
            return mid1;
        if(array[mid2] == number)
            return mid2;
        if(number < array[mid1])
            return ternarySearch(array,number,left,mid1 -1);
        else if(number > array[mid2])
            return ternarySearch(array,number,mid2 + 1,right);
        else
            return ternarySearch(array, number,mid1 + 1,mid2 - 1);
    }
}
