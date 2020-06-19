package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has" +
                " to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";

        Map<Character,Integer> charCounter = countChar(myString);

        for (Map.Entry mapElement : charCounter.entrySet()) {
            Character key = (Character)mapElement.getKey();
            int value = (int)mapElement.getValue();

            System.out.println(key + " : " + value);
        }
    }
    public static Map<Character, Integer> countChar(String text){
        Map<Character,Integer> counter = new HashMap<Character, Integer>();
        char[] charactersInString = text.toCharArray();
        for (char c : charactersInString) {
            if (counter.containsKey(c)){
                counter.put(c, counter.get(c) + 1);
            } else {
                counter.put(c, 1);
            }

        }
        return counter;
    }
}
