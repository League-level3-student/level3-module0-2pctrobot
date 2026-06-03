package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] beans = new String[5];
    	beans[0] = "String Bean";
        beans[1] = "Pinto Bean";
        beans[2] = "Black Bean";
        beans[3] = "Navy Bean";
        beans[4] = "Kidney Bean";
        // 2. print the third element in the array
    	System.out.println("Bean 3: " + beans[2]);
        // 3. set the third element to a different value
    	beans[2] = "Lima Bean";
        // 4. print the third element again
    	System.out.println("New Bean 3: " + beans[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i = 0; i < beans.length; i++){
            beans[i] = "Refried Bean";
        }
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i = 0; i < beans.length; i++){
            String s = beans[i];
            System.out.println("ERROR! New Bean " + (i+1) + ": " + s);
        }
        // 7. make an array of 50 integers
    	int[] beanCounters = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random random = new Random();
    	
    	for(int i = 0; i < beanCounters.length; i++){
    		int randomInt = random.nextInt(1000);
            beanCounters[i] = randomInt;
        }
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int smolBean = 9999;
    	int bigBean = 0;
    	for(int i = 0; i < beanCounters.length; i++){
    		if(beanCounters[i]<smolBean) {
    			smolBean=beanCounters[i];
    		}
        }
    	System.out.println("Smallest Bean Found! "+smolBean);
        // 10 print the entire array to see if step 8 was correct
    	for(int i = 0; i < beanCounters.length; i++){
            System.out.println("Counting Bean: "+(beanCounters[i]+1));
        }
        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
