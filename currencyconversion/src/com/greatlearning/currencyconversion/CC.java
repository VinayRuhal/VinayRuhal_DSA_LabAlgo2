package com.greatlearning.currencyconversion;

import java.util.Arrays;

public class CC {
    public void counting(int[] curSize, int amount) {
        int notes[] = new int[curSize.length];
        int sum = 0;
       
        for (int i = 0; i < curSize.length; i++) {
            notes[i] = amount / curSize[i];
            amount = amount % curSize[i];
            sum += notes[i];
            
            if (notes[i] != 0) 
            {
                System.out.println(curSize[i] + " X " + notes[i]);
            }
        }

                  System.out.println("number of notes "+sum);
        }
    }
    

