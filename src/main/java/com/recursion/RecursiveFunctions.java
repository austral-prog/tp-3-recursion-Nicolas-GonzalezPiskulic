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
        return -1;
    }

    public static int recursiveFactorial(int n) {
        return -1;
    }

    public static int recursivePow(int base, int exponent) {
        return -1;
    }

    public static int recursiveFibonacci(int n) {
        return -1;
    }

    public static boolean recursivePalindrome(String word) {
        return false;
    }


}
