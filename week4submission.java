package week4submisson;

public class week4submission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

 // I created a string of integers
int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//a Used negative one to subtract from the first element 
int result1 = ages[ages.length -1] - ages [0];
System.out.println("Result:" + result1);
//b created a new array and defining the number of elements
int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
 result1 = ages2[ages2.length -1] - ages[0]; 
// then subtracted the last element from the first 
System.out.println("Result1 :" + result1);

int firstElement = ages2[0];
int lastElement = ages2[ages2.length -1];
int result = lastElement - firstElement;

//c loop adding all the elements and finding the average 
int sum = 0;
for (int age : ages2) {
  sum += age;
} // sum divided by the array length 
 double average = (double) sum / ages.length;
 System.out.println ("Sum of ages2:" + sum);
 System.out.println ("Average of ages2 :" + average);
 
// 2 new array of strings
 
 String[] names= new String [6];
 names[0] = "Sam";
 names[1] = "Tommy";
 names[2] = "Tim";
 names[3] = "Sally";
 names[4] = "Buck";
 names[5] = "Bob";
 
 //A
 
int totalLetters = 0;
for (String name : names) {
	totalLetters += name.length();
	// counting up all the letters in each element 
}
double averageLetters = (double) totalLetters / names.length;
// totaling the average letters in the names for the array

System.out.println("Average  number of letters per name: " + averageLetters);
  


//3
//  names [names.length -1] ; // accessing the last array element

//4
// names[0]; // accessing the first array element

//5
int[] nameLengths = new int [names.length]; // creating a new array integer to store total of letters

for (int i = 0; i < names.length; i++) {
nameLengths[i] = names[i].length();
// 
   }

for (int length : nameLengths) {
  System.out.println (length + " ");
}

//6
sum = 0;
for (int length:nameLengths) {
	sum += length;
}
System.out.println ("Sum of all elements in nameLengths" + sum); 
//adding all the elemnts in the array   

// 7
System.out.println(repeatWord("word!", 9));
// 8
System.out.println(fullName("Yana","Moody" ));


	} // end of main
//7
public static String repeatWord (String word, int n) {
String result = "";
for (int i = 0; i < n; i++) {
  result += word;
}
  return result; } // created a loop that will print word as many times and value stored in int 

//8
public static String fullName (String firstName, String lastName) { 
  return firstName+ " " + lastName;
} // printed the first and last name to create a full add a space 

//9 
public static boolean sumGreaterThan( int[] numbers) {
 int sum= 0;
 for ( int number : numbers) { // loops through each number and adds to sum
	 sum += number;	 
 }  
     return sum > 100; 
 // returns true if elements are greater than
}    
     //10
public static double averageElement (double[] num) {

if  (num.length == 0) { 
	return 0;
}
   double sum = 0; 
for (double numbers : num) { // loops each value 
sum += numbers; // adds each numer to sum
}
	return sum / num.length;
	// dividing to get the average
}
 //11 
public static boolean whichIsGreater (double[] arr1, double[] arr2) {

double sum1 = 0;
for (double num : arr1) {
 sum1 += num;
}

double sum2 = 0;
for (double num : arr2) {
 sum2 += num;
 
}

double avg1 = sum1 / arr1.length;
double avg2 = sum2 / arr2.length;

if (avg1 > avg2) {
 return true;
} else {
 return false;
}
}
//12
public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
 if (isHotOutside && moneyInPocket > 10.50) { //checks to see if the value of double and boolean will return true
	 return true;
	 
 } else { 
	 return false; 
 }}
 // 13
 public static boolean workoutMinutes (int m, int h) {
	 int totalMin = m + h * 60;
	 boolean metGoal = totalMin >= 120;
return metGoal; 

 
} // this method add the minutes plus the hours ai've worked out today to get the total number of minutes. I wrote this method to check to see if I met my goal for the day
 
	 
}




   



