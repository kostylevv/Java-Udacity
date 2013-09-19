package com.unionfind.javase.udacity_java;

public class Twitterizer {
/**
 * Shortens and returns long posts by removing vowels
 * @param longPost the post whos vowels need to be removed
 * @return a version of the post without vowels
 */
public String shorten(String longPost) {
	String result = "";
    for (int i=0; i < longPost.length(); i++){
        
    	String ch = longPost.substring(i, i+1);
        if (!"aeiouAEIOU".contains(ch)){
            result += ch;   
        }
    }
    return result;
}

}


