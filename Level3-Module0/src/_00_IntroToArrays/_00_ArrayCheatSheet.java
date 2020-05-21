package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringArr = {"one", "two", "three", "four", "five"};
		//2. print the third element in the array
		System.out.println(stringArr[2]);
		//3. set the third element to a different value
		stringArr[2] = "newThree";
		//4. print the third element again
		System.out.println(stringArr[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < stringArr.length; i++) {
			stringArr[i] = "string of choice";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < stringArr.length; i++) {
			System.out.println(i+1 + " " + stringArr[i]);
		}
		//7. make an array of 50 integers
		int[] intArr = new int[10];
		System.out.println(intArr.length);
		
		Random rand = new Random();
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = rand.nextInt(1000);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallestInt = intArr[0];
		for(int i = 1; i < intArr.length; i++) {
			if(intArr[i] < smallestInt) {
				smallestInt = intArr[i];
			}
		}
		System.out.println("smallest = " +smallestInt);
		
		//10 print the entire array to see if step 8 was correct
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		//11. print the largest number in the array.
		int largestInt = intArr[0];
		for(int i = 1; i < intArr.length; i++) {
			if(intArr[i] > largestInt) {
				largestInt = intArr[i];
			}
		}
		System.out.println("Largest Int = " + largestInt);
		//12. print only the last element in the array
		System.out.println(intArr[intArr.length - 1]);
	}
}
