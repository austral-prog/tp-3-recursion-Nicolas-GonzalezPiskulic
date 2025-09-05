package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveFunctions {

    public static int recursiveIndexOf(List<String> list, String target) {
        if(!list.isEmpty()){
            if(target.equals(list.getFirst())){
                return 0;
            }
            else {
                if (recursiveIndexOf(list.subList(1, list.size()), target) == -1){
                    return -1;
                }
                else {
                return (recursiveIndexOf(list.subList(1, list.size()), target) + 1);
                }
            }
        }
        else {
            return -1;
        }
    }

    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        List<String> shortlist = list.subList(index,list.size());
        if (recursiveIndexOf(shortlist, target) == -1){
            return -1;
        }
        else {
            return (recursiveIndexOf(shortlist, target) + index);
        }
    }

    public static int recursiveIndexOfEmpty(List<String> list) {
        return (recursiveIndexOf(list, ""));
    }

    public static int recursivePut(String target, List<String> list) {
        if (recursiveIndexOfEmpty(list) != -1){
            list.set(recursiveIndexOfEmpty(list), target);
            return recursiveIndexOf(list, target);
        }
        else {
            return -1;
        }
    }

    public static int recursiveRemove(List<String> list, String target) {
        if ((recursiveIndexOf(list, target) == -1) || (list.isEmpty())) {
            return 0;
        }
        else {
            if(list.getFirst().equals(target)){
                return(recursiveRemove(list.subList(1, list.size()), target)+1);
            }
            else {
                return(recursiveRemove(list.subList(1, list.size()), target));
            }
        }
    }

    public static int recursiveSum(List<Integer> list) {
        if (list.isEmpty()){
            return 0;
        }
        else {
            return (list.getFirst() + recursiveSum(list.subList(1, list.size())));
        }
    }

    public static int recursiveFactorial(int n) {
        if (n<=1){
            return 1;
        }
        else {
            return n*recursiveFactorial(n-1);
        }
    }

    public static int recursivePow(int base, int exponent) {
        if (exponent <= 1){
            return base;
        }
        else {
            return base*recursivePow(base, exponent-1);
        }
    }

    public static int recursiveFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        else if (n<1){
            return 0;
        }
        else {
            return recursiveFibonacci(n-2)+recursiveFibonacci(n-1);
        }
    }

    public static boolean recursivePalindrome(String word) {
        if (word.length() <= 1) {
            return(true);
        }
        else if (word.charAt(0) == word.charAt(word.length()-1)) {
            return recursivePalindrome(word.substring(1, word.length()-1));
        }
        else  {
            return false;
        }
    }


}
