package lesson3;

import java.util.*;
public class HomeWork3 {
    public static void main(String [] args) {
        String [] words = {
                "Car", "Sun" , "Road", "Car", "Table", "Around", "Value", "Watch" , "Road", "Mouse"
        };
        Map<String, Integer> numCount = new HashMap<>();
        for (String num : words) {
            numCount.put(num, numCount.getOrDefault(num,0)+1);
        }
        System.out.println(numCount);
    }
}
