package java8Assingment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//4. WAP to find maximum from array of numbers with the help of stream api.
public class MaximumAss4{
	
	public static void main(String[] args) {
		
		Integer [] arr = {11,22,33,88,44,55,66,77};
		List<Integer> list = Arrays.asList(arr);
		Integer maximum = list.stream().max(Integer :: compare).get(); 
		System.out.println(maximum);
	}
}
