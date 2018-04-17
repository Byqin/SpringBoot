package com.example.service;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Arrays.asList(new String[] {"ddd"}).
        	forEach(e -> {System.out.println(e);});
        
        int sum = 0;
		List<String> list = Arrays.asList(new String[]{"a","b"});
		sum = list.stream().mapToInt(item -> item.charAt(0)).map(item -> item + 100).reduce(0, (x,y) -> x + y);
		System.out.println(sum);
    }
}
