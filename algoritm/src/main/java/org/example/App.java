package org.example;

import org.example.binary_search.BinarySearch;
import org.example.enamRoman.EnumRomanToArabic;
import org.example.enamRoman.RomanAndArab;
import org.example.enamRoman.TranslateColor;
import org.example.factorial.FactorialСycle;
import org.example.factorial.RecursionFactorial;
import org.example.hashMap.PhoneBook;
import org.example.hashMap.RomeToArabic;
import org.example.multiplicationTable.FromGPT;
import org.example.multiplicationTable.MultiplicationTableArray;
import org.example.multiplicationTable.MultiplicationTableRecursion;
import org.example.multiplicationTable.TryAgainMultiTable;
import org.example.quickSort.QuickSortGPT;
import org.example.recursion.MaxElement;
import org.example.recursion.MaxGPT;
import org.example.recursion.SumFromGPT;
import org.example.recursion.SumRecursion;
import org.example.sort.MyTrySort;
import org.example.sort.SortArrayBySmall;
import org.example.sort.SortBigToSmall;
import org.example.sort.SortReturnArrMy;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {


        int[] arr = {-11, -6, 0, 3, 5, 7, 9, 66, 77, 4};
        int[] arr2 = {11, -6, 0, -333, 5, 7, 9, 66, -77, 666, 8, -99,  999};
        int[] arrForSort = {11, -6, 12, -333, 5, 7, 9, 66, -77, 666, 8, -99,  999, -9};
        int[] arrForSort2 = {11, -6, 12, -333, 5, 7, 9, 66, -77, 666, 8, -99,  999, -9};
        int[] arrForSort3 = {6, 8, 4, 9, 7, 1, 8, 3};

        int[] arr3 = {2, 4, 5, 10};
        int[] arr4 = {4, 5};

        int f = 5;
        String str = "v";
        String[] arabToRoman = new String[1];


//        RomanAndArab romanAndArab = RomanAndArab.valueOf(str.toUpperCase());
//        System.out.println(romanAndArab + "  work method");
        RomanAndArab[] values = RomanAndArab.values();

        for (int i = 0; i < values.length; i++) {
            if (values[i].getX() == f){
                System.out.println("SUPER int f");
            }
            if (values[i].getStr().equalsIgnoreCase(str)) {
                System.out.println("GREAT String from v " );
            }

        }


//        System.out.println(str.toUpperCase());
//        if (str.equalsIgnoreCase(RomanAndArab.V.getStr())){
//            System.out.println("Good!");
//        }
//
//        System.out.println(RomanAndArab.IV.getStr() + " RomanAndArab " + RomanAndArab.IV.getX());
//        System.out.println(Arrays.toString(RomanAndArab.values()));
//        RomanAndArab romanAndArab = Ro
//        for (int i = 0; i < RomanAndArab.; i++) {
//            if (arr3[i] == f){
//
//                System.out.println("I find element in enum: " );
//            }

//        }


//        TranslateColor translateColor = TranslateColor.RED;
//        System.out.println((translateColor.getColorToRussian()) + " работа с энам");
//        System.out.println((TranslateColor.GREEN.getColorToRussian()) + " работа с энам");
//
        PhoneBook phoneBook = new PhoneBook();
        System.out.println((phoneBook.convertToStringName(222)) + " конвертируем число в строку по HashMap");
//
//        RomeToArabic romeToArabic = new RomeToArabic();
//        System.out.println((romeToArabic.superConverter("L") + romeToArabic.superConverter("V")) + " римские в арабские цифры");

        TryAgainMultiTable.tryAgainMultiTable(arr4);

//        FromGPT.fromGPT(arr4, 0, 0);

//        MultiplicationTableRecursion.multiplicationTableRecursion(arr3);
//
//        MultiplicationTableArray.multiplicationTable(arr3);

        System.out.println((Arrays.toString(SortBigToSmall.sortBigToSmall(arrForSort3))) + " Сортируем рекурсией от большего к меньшему");

        int[] returnSortArr = SortReturnArrMy.sortReturnArrMy(arr3);
        System.out.println((Arrays.toString(returnSortArr)) + "  сортируем рекурсией");

        MyTrySort.myTrySort(arrForSort2);
        System.out.println(Arrays.toString(arrForSort2));

        MyTrySort.myTrySort(arr3);
        System.out.println(Arrays.toString(arr3));


        QuickSortGPT.quickSort(arrForSort);
        System.out.println(Arrays.toString(arrForSort) + " QuickSortGPT");

        System.out.println(MaxGPT.max(arr2) + " maxElementSource GPT full");

        System.out.println(MaxElement.maxElementSource(arr2) + " Max element in array");

        System.out.println(SumRecursion.sumRecursionLol(arr) + " Chat GPT Recursion");

        System.out.println(SumRecursion.sumRecursionLol(arr3) + " sum all elements in Recursion");

        System.out.println(RecursionFactorial.recursionFactorial(f) + " factorial from recursion");


        BigInteger bigInteger = new BigInteger(String.valueOf(f)) ;
        FactorialСycle factorialСycle = new FactorialСycle();
        System.out.println((factorialСycle.factorial(bigInteger)) + " factorial Сycle");


        SortArrayBySmall sortArrayBySmall = new SortArrayBySmall();
        int[] minFirst = sortArrayBySmall.sortArrayBySmall(arr2);
        System.out.println(Arrays.toString(minFirst) + " sort from small to big");


        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(arr, f);
        System.out.println(result + " binary search");




    }
}
