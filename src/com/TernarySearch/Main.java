package com.TernarySearch;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        var ternarySearch = new TernarySearch();
        var number = ternarySearch.ternarySearch(numbers,7);
        System.out.println(number);
    }
}
