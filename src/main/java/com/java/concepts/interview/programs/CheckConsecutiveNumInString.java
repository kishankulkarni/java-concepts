package com.java.concepts.interview.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckConsecutiveNumInString {
    public static void main(String[] args) {
        //consecutive number
        String strNum = "123567";
//        List<Integer> numeric = strNum.chars().mapToObj(i -> i - '0').collect(Collectors.toList());
//        System.out.println(numeric);
//
//        boolean isConsecutive = true;
//        for (int i = 0; i< numeric.size()-1; i++) {
//            if (numeric.get(i+1) - numeric.get(i) != 1){
//                isConsecutive = false;
//            }
//        }
//
//        if (isConsecutive) {
//            System.out.println("Number are consecutive");
//        } else {
//            System.out.println("Number are not consecutive");
//        }

        int start = isConsecutive(strNum);
        if (start != -1)
            System.out.println("Yes \n" + start);
        else
            System.out.println("No");

        // Test Case 1:
//        String s1 ="123@67";
//        s1 = s1.replaceAll("[^0-9]","");
//        Integer[] arr1 = s1.chars().mapToObj(i -> i - '0').toArray(Integer[]::new);
//        System.out.print(consecutiveRanges(arr1));
//        System.out.println();
//
//
//        // Test Case 2:
//        String s2 ="-1012568";
//        int negValue2 = s2.replaceAll("[^-]","").length();
//        s2 = s2.replaceAll("[^-[0-9]]","");
//        Integer[] arr2 = new Integer[s2.length() - negValue2];
//        for(int i =0 , j =0; i< s2.length();){
//            if (s2.charAt(i) == '-'){
//                arr2[j] = -(s2.charAt(i+1)-'0');
//                i = i+2;
//                j++;
//            } else {
//                arr2[j] = s2.charAt(i)-'0';
//                i++;
//                j++;
//            }
//        }
//        System.out.print(consecutiveRanges(arr2));
//        System.out.println();
//
//        // Test Case 3:
//        String s3 ="-1345202125";
//        int negValue3 = s3.replaceAll("[^-]","").length();
//        s3 = s3.replaceAll("[^-[0-9]]","");
//        Integer[] arr3 = new Integer[s3.length() - negValue3];
//        for(int i =0 , j =0; i< s3.length();){
//            if (s3.charAt(i) == '-'){
//                arr3[j] = -(s3.charAt(i+1)-'0');
//                i = i+2;
//                j++;
//            } else {
//                arr3[j] = s3.charAt(i)-'0';
//                i++;
//                j++;
//            }
//        }
//        System.out.print(consecutiveRanges(arr3));


    }

    // function to check consecutive sequential number
    static int isConsecutive(String str)
    {
        int start;
        int length = str.length();

        for (int i = 0; i < length / 2; i++)
        {

            String new_str = str.substring(0, i + 1);

            int num = Integer.parseInt(new_str);

            start = num;
            while (new_str.length() < length)
            {
                num++;
                new_str = new_str + String.valueOf(num);
            }

            if (new_str.equals(str))
                return start;
        }

        return -1;
    }

    static List<String> consecutiveRanges(Integer[] a)
    {
        int length = 1;
        List<String> list = new ArrayList<>();

        if (a.length == 0) {
            return list;
        }

        // Traverse the array from first position
        for (int i = 1; i <= a.length; i++) {

            if (i == a.length || a[i] - a[i - 1] != 1) {

                if (length == 1) {
                    list.add(String.valueOf(a[i - length]));
                }
                else {

                    if (a[i - (length-1)] == a[i - 1]) {
                        list.add(a[i - length] + "," + a[i - 1]);
                    } else {
                        list.add(a[i - length] + "," + a[i - (length-1)] + "," + a[i - 1]);
                    }
                }

                length = 1;
            }
            else {
                length++;
            }
        }

        return list;
    }
}
