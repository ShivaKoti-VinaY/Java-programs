public class largestthreenums{
    public static void main(String[] args) {
        
// define three numbers
int num1 = 10;
int num2 = 20;
int num3 = 30;

// initialize the largest number to the first number
int largest = num1;

// check the second number if it is larger than the current largest number
if (num2 > largest) {
  largest = num2;
}

// check the third number if it is larger than the current largest number
if (num3 > largest) {
  largest = num3;
}

// print the largest number
System.out.println(largest);
    }
}