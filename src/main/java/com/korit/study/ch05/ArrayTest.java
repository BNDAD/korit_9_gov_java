package com.korit.study.ch05;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 1번.
        int[] nums = {10, 20, 30, 40, 50};
        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);

        }


        System.out.println();

        // 2번.
        int result = 0;
        int[] nums2 = {5, 10, 15, 20, 25};
        for (int i = 0; i < 5; i++) {
            result += nums2[i];
        }
        System.out.println(result);
        System.out.println();



        int[] nums3 = {23, 45, 12, 67, 34, 89, 11};
        int max = 0;
        for (int i = 0; i < 7; i++) {
            if (nums3[i] > max) {
                max = nums3[i];
            }

        }
        System.out.println(max);


        System.out.println();
        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      /*  System.out.print("짝수:");
        for (int i = 0; i < 10; i++) {
            if (nums4[i] % 2 == 0) {
                System.out.print(" " + nums4[i]);
            }

        }*/
        int[] evens = new int[0];
        for (int i = 0; i < nums4.length; i++) {
            if (nums4[i] % 2 == 0) {
                int[] temp = new int[evens.length + 1];
                for (int j = 0; j < evens.length; j++) {
                    temp[j] = evens[j];
                }
                evens = temp;
                evens[evens.length - 1] = nums4[i];
                System.out.print(nums4[i]);
            }
        }



        }

    }




