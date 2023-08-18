package com.interswitch.maven;

public class UpperLowerCase {
    public String wordToUpperCase(String word) {
        if (word != null && !word.isEmpty()){
            String[] words = word.substring(0,1).split(" ");
           return words[0].toUpperCase() + word.substring(1);

        }
      throw new IllegalArgumentException("Word cannot be null");
    }

    public String wordToLowerCase(String word) {
        if (word != null && !word.isEmpty()){
            String[] words = word.substring(0, 1).split(" ");
            System.out.println(words[0].toLowerCase() + word.substring(1));

        }
        throw new IllegalArgumentException("Word cannot be null");
    }
}
