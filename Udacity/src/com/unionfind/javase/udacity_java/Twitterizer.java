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

/**
 * Prints a post backwards to hide its contents.
 * @param post the post to be reversed.
 */
public String reverse(String post){
    if (post.length() == 0) return "";
    if (post.length() == 1) return post;
    
    String result = "";
    for (int i = post.length(); i > 0; i--){
        result += post.substring(i-1,i);
    }
    return result;
}


}


