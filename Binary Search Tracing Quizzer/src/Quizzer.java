import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

public class Quizzer
	{
	public static ArrayList myArray = new ArrayList();
	public static void main(String[] args)
		{

	int inputNumber;
	Scanner keyboard = new Scanner(System.in);
	int counter = 0;
	int round = 0;
	int total = 0;
	
	do
		{
	System.out.println("Please an interger from 1 to 20, when you are done please enter -1.");

	if(keyboard.hasNextInt() == false)
		{
		System.out.println("Please enter an integer.");
		Scanner file = new Scanner(System.in);
		inputNumber = file.nextInt();	
		}
	
	else
		{
		inputNumber = file.nextInt();		
		}
	
	if(inputNumber < -1 && inputNumber > 20)
		{
		System.out.println("Please enter an integer between 1 and 20");
		inputNumber = file.nextInt();
		}
	
	else
		{
		myArray.add(inputNumber);
		}

		}
	
	while(inputNumber != -1 && inputNumber > 0 && inputNumber < 21);

	Collections.sort(myArray);
	System.out.println("The array you made is " + myArray);
	System.out.println();
	
	Random r = new Random();
	int target =(int) myArray.get(r.nextInt(myArray.size()));
	System.out.println("Your target number is " + target + ".");
	System.out.println();
	
	
	int left = 0;
	int right = myArray.size() - 1;
	while(left <= right)
		{
		int middle = (left +  right)/2;
		System.out.println("What is the left position?");
		int inputLeft = keyboard.nextInt();
		if(inputLeft == left)
		{
		System.out.println("Nice job! That is correct!");
		counter ++;
		total ++;
		}
		else
			{
			System.out.println("I'm sorry that isn't correct, the left is actually " + left + ".");
			total ++;
			}
		
		System.out.println("What is the right position?");
		int inputRight = keyboard.nextInt();
		if(inputRight == right)
		{
		System.out.println("Nice job! That is correct!");
		counter ++;
		total ++;
		}
		else
			{
			System.out.println("I'm sorry that isn't correct, the right is actually " + right + ".");
			total ++;
			}

		System.out.println("What is the middle position?");
		int inputMiddle = keyboard.nextInt();
		if(inputMiddle == middle)
		{
		System.out.println("Nice job! That is correct!");
		counter ++;
		total ++;
		}
		else
			{
			System.out.println("I'm sorry that isn't correct, the middle is actually " + middle + ".");
			total ++;
			}
		
		System.out.println("What is the int at the middle position?");
		int inputMiddleValue = keyboard.nextInt();
		if(inputMiddleValue == (int) myArray.get(middle))
		{
		System.out.println("Nice job! That is correct!");
		counter ++;
		total ++;
		}
		else
			{
			System.out.println("I'm sorry that isn't correct, the middle value is actually " + myArray.get(middle) + ".");
			total ++;
			}
		
		
		if(target < (int) myArray.get(middle))
			{
			right = middle - 1;
			round ++;
			System.out.println("This is the end of round " + round + ".");
			System.out.println();
			}
		else if(target > (int) myArray.get(middle))
			{
			left = middle + 1;
			round ++;
			System.out.println("This is the end of round " + round + ".");
			System.out.println();
			}
		else
			{
			System.out.println(middle);
			System.out.println("Nice job! you got " + counter + " out of " + total +  " points on this quizzer!");
			break;
			}

		}
		

	}
 
	}
