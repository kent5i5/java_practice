/**
 * 
 */
package migratoryBirds;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * HackerRank challenge question 
 * Authorshashank21j
 * DifficultyEasy
 * Max Score10
 *  
 * 
 * Solution Author: Kenneth Eng
 */
public class migratoryBirdsProblem {
	int[] birdcage = new int[7];
	int arr[];

	
	public static void main(String[] args) {
		try {
			migratoryBirdsProblem mbp =  new migratoryBirdsProblem();
			mbp.CollectInput();
			
		}catch(Exception e) {
			System.out.println("error!");
		}
		
	}

	/*
	 * Collect the size of the array and call for other methods.
	 */
	public void CollectInput() {
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNextInt()) {
			int size_of_array = sc.nextInt();
			if ( size_of_array >= 5 && size_of_array <= 2*(int)Math.pow(10, 5)) {
				this.arr = new int[size_of_array];
	
				fillTheArray(); // 1 for-loop O(n)
				
				fillBirdCage(); // 1 for-loop O(n)
				
				int answer = findMostFequentAppearBird( birdcage); // 1 for-loop O(n)
				System.out.println("answer is " + answer); // O(n) + O(n) + O(n) = 3(n) = O(n)
			} else {
				System.out.println("Please enter a number greater than 5 and less than 2*10^5");
			}
	
		}
	}
	
	public void fillTheArray() {
		// O(n)
		for(int i=0; i < this.arr.length ; i++) {	
			this.arr[i] = createRandomNumber();	
		}
		
		for(int i=0; i < this.arr.length ; i++) {	
			System.out.print( this.arr[i] + " ");
		}
		System.out.print("\n");
	}
	
	public void fillBirdCage() {
		// O(n)
		for(Integer bird: arr) {
			switch(bird){
				case 1 :birdcage[1] += 1;
					break;
				case 2: birdcage[2] += 1; 
					break;
				case 3: birdcage[3] += 1;
					break;
				case 4: birdcage[4] += 1;
					break;
				case 5: birdcage[5] += 1;
					break;	
				default: break;	
			}
		
		}
	}
	
	public int findMostFequentAppearBird(int[] birdcage){
		// O(n)
		birdcage[0] = 0;
		int answer = 0;
//		System.out.println( birdcage[1] + " " + birdcage[2] + " " 
//							+ birdcage[3] + " " + birdcage[4] + " " + birdcage[5] + " ");
		for (int j=0 ;  j < 6 ;j++) {
			if (birdcage[j] > answer ) {
				answer = j;
			} 
		}
		
		return answer; 
	}
	
	public int createRandomNumber() {
		Random rand = new Random();
		int randomNum = rand.nextInt(6-1) + 1;
		//System.out.println(randomNum);
		return randomNum;
	}
}
