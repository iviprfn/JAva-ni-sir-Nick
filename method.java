import java.util.Scanner;

class MyFunctions
{
	public static void problemNo1()
	{
		   
        System.out.println("HELLO BSIT 2B");

	}
	public static void problemNo2()
	{
		   
        int height = 7;
        int width = 5;

        int perimeter = 2 * (height + width);
        int area = height * width;

        System.out.println("Perimeter of the rectangle = " + perimeter + " inches");
        System.out.println("Area of the rectangle = " + area + " square inches");
    }

	
    public static void problemNo3(Scanner sc)
    {
        System.out.print("Input the Employees ID(Max. 10 chars): ");
        String id = sc.next();

        System.out.print("Input the working hrs: ");
        double hours = sc.nextDouble();

        System.out.print("Salary amount/hr: ");
        double rate = sc.nextDouble();

        double salary = hours * rate;

        System.out.println("Employees ID = " + id);
        System.out.println("Salary = U$ " + String.format("%.2f", salary));
    }

	public static void problemNo4(Scanner sc) {
	    

	    System.out.print("Input the first integer: ");
	    int num1 = sc.nextInt();

	    System.out.print("Input the second integer: ");
	    int num2 = sc.nextInt();

	    System.out.print("Input the third integer: ");
	    int num3 = sc.nextInt();

	    int max = num1; 

	    if (num2 > max) {
	        max = num2;
	    }
	    if (num3 > max) {
	        max = num3;
	    }

	    System.out.println("Maximum value of three integers: " + max);
	}

	public static void problemNo5(Scanner sc) {
	    

	    System.out.print("Input x1: ");
	    double x1 = sc.nextDouble();

	    System.out.print("Input y1: ");
	    double y1 = sc.nextDouble();

	    System.out.print("Input x2: ");
	    double x2 = sc.nextDouble();

	    System.out.print("Input y2: ");
	    double y2 = sc.nextDouble();

	    
	    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	    
	    System.out.println("Distance between the said points: " + String.format("%.4f", distance));
	}
public static void problemNo6(Scanner sc) {
	    

	    System.out.print("Input the amount: ");
	    int amount = sc.nextInt();

	    int n100 = amount / 100;
	    int n50  = (amount % 100) / 50;
	    int n20  = (amount % 50) / 20;
	    int n10  = (amount % 20) / 10;
	    int n5   = (amount % 10) / 5;
	    int n2   = (amount % 5) / 2;
	    int n1   = (amount % 2);

	    System.out.println("There are:");
	    System.out.println(n100 + " Note(s) of 100.00");
	    System.out.println(n50  + " Note(s) of 50.00");
	    System.out.println(n20  + " Note(s) of 20.00");
	    System.out.println(n10  + " Note(s) of 10.00");
	    System.out.println(n5   + " Note(s) of 5.00");
	    System.out.println(n2   + " Note(s) of 2.00");
	    System.out.println(n1   + " Note(s) of 1.00");
	}

public static void problemNo7(Scanner sc) {
	    

	    System.out.print("Input seconds: ");
	    int totalSeconds = sc.nextInt();

	    int hours = totalSeconds / 3600;
	    int minutes = (totalSeconds % 3600) / 60;
	    int seconds = totalSeconds % 60;

	    System.out.println("There are:");
	    System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds);
	}


public static void problemNo8(Scanner sc) {
	

	    System.out.print("Input a number between 1 to 12 to get the month name: ");
	    int month = sc.nextInt();

	    String monthName = "";

	    switch (month) {
	        case 1:  monthName = "January"; break;
	        case 2:  monthName = "February"; break;
	        case 3:  monthName = "March"; break;
	        case 4:  monthName = "April"; break;
	        case 5:  monthName = "May"; break;
	        case 6:  monthName = "June"; break;
	        case 7:  monthName = "July"; break;
	        case 8:  monthName = "August"; break;
	        case 9:  monthName = "September"; break;
	        case 10: monthName = "October"; break;
	        case 11: monthName = "November"; break;
	        case 12: monthName = "December"; break;
	        default: monthName = "Invalid month"; break;
	    }

	    System.out.println(monthName);
	}

public static void problemNo9(Scanner sc) {
	

	    int positiveCount = 0;
	    int negativeCount = 0;

	    System.out.print("Input the first number: ");
	    int n1 = sc.nextInt();
	    System.out.print("Input the second number: ");
	    int n2 = sc.nextInt();
	    System.out.print("Input the third number: ");
	    int n3 = sc.nextInt();
	    System.out.print("Input the fourth number: ");
	    int n4 = sc.nextInt();
	    System.out.print("Input the fifth number: ");
	    int n5 = sc.nextInt();

	    int[] numbers = {n1, n2, n3, n4, n5};

	    for (int n : numbers) {
	        if (n > 0) {
	            positiveCount++;
	        } else if (n < 0) {
	            negativeCount++;
	        }
	    }

	    System.out.println("Number of positive numbers: " + positiveCount);
	    System.out.println("Number of negative numbers: " + negativeCount);
	}
public static void problemNo10(Scanner sc) {
	    
	    final String correctPassword = "1234";
	    String input;

	    while (true) {
	        System.out.print("Input the password: ");
	        input = sc.nextLine();

	        if (input.equals(correctPassword)) {
	            System.out.println("Correct password");
	            break;
	        } else {
	            System.out.println("Incorrect password");
	        }
	    }
    }
   public static void problemNo11( Scanner sc) {
    
    System.out.println("Input the Coordinate(x,y):");
    System.out.print("x: ");
    double x = sc.nextDouble();
    System.out.print("y: ");
    double y = sc.nextDouble();

    if (x > 0 && y > 0) {
        System.out.println("Quadrant-I(+,+)");
    } else if (x < 0 && y > 0) {
        System.out.println("Quadrant-II(-,+)");
    } else if (x < 0 && y < 0) {
        System.out.println("Quadrant-III(-,-)");
    } else if (x > 0 && y < 0) {
        System.out.println("Quadrant-IV(+,-)");
    } else if (x == 0 && y != 0) {
        System.out.println("Lies on Y-axis");
    } else if (y == 0 && x != 0) {
        System.out.println("Lies on X-axis");
    } else {
        System.out.println("Origin");
    }
}
public static void problemNo12(Scanner sc) {
    

    System.out.println("Input two numbers:");
    System.out.print("x: ");
    double x = sc.nextDouble();
    System.out.print("y: ");
    double y = sc.nextDouble();

    if (y == 0) {
        System.out.println("Division is not possible");
    } else {
        System.out.println(x / y);
    }
}
public static void problemNo13(Scanner sc) {
    

    System.out.print("Input number of lines: ");
    int n = sc.nextInt();

    int count = 1;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }
}
public static void problemNo14(Scanner sc) {
    

    int sum = 0;
    int count = 0;
    int mark;

    System.out.println("Input Mathematics marks (0 to terminate):");
    while (true) {
        mark = sc.nextInt();
        if (mark <= 0) { // terminate on 0 or negative
            break;
        }
        sum += mark;
        count++;
    }

    double average = (count == 0) ? 0 : (double) sum / count;

    System.out.printf("Average marks in Mathematics: %.2f\n", average);
}
public static void problemNo15(Scanner sc) {

	System.out.print("Input the length of the array: ");
	int n;
	if (sc.hasNextInt()) {
		n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid length. Using default length 15.");
			n = 15;
		}
	} else {
		String bad = sc.next();
		System.out.println("Non-numeric input detected ('" + bad + "'). Using default length 15.");
		n = 15;
	}

	int[] arr = new int[n];

	System.out.println("Input the array elements:");
	for (int i = 0; i < n; i++) {
		System.out.print("Element " + (i + 1) + ": ");
		while (!sc.hasNextInt()) {
			String badElem = sc.next();
			System.out.println("Invalid input '" + badElem + "'. Please enter an integer for element " + (i + 1) + ": ");
		}
		arr[i] = sc.nextInt();
	}

	int min = arr[0];
	int pos = 0;
	for (int i = 1; i < n; i++) {
		if (arr[i] < min) {
			min = arr[i];
			pos = i;
		}
	}

	System.out.println("Smallest Value: " + min);
	System.out.println("Position of the element: " + pos);
}

public static void problemNo16(Scanner sc) {
    

    System.out.print("Input the distance in cm: ");
    double cm = sc.nextDouble();

    double inches = cm / 2.54;

    System.out.printf("Distance of %.2f cms is = %.2f inches\n", cm, inches);
}
public static void problemNo17(Scanner sc) {
    

    System.out.print("Input a number: ");
    int num = sc.nextInt();
    int original = num;
    int reverse = 0;

    while (num != 0) {
        reverse = reverse * 10 + num % 10;
        num /= 10;
    }

    System.out.println("The original number = " + original);
    System.out.println("The reverse of the said number = " + reverse);
}
public static void problemNo18(Scanner sc) {
   

    System.out.print("Input a value (negative): ");
    int num = sc.nextInt();

    int absValue = Math.abs(num);

    System.out.println("Original value = " + num);
    System.out.println("Absolute value = " + absValue);
}
public static void problemNo19(Scanner sc) {
    

    System.out.print("Input the first integer: ");
    int a = sc.nextInt();
    System.out.print("Input the second integer: ");
    int b = sc.nextInt();

    if (b == 0) {
        System.out.println("Division by zero is not possible");
    } else if (a % b == 0) {
        System.out.println(a + " is a multiple of " + b + ".");
    } else {
        System.out.println(a + " is not a multiple of " + b + ".");
    }
}

public static void problemNo20(Scanner sc) {
    

    System.out.println("Input some text:");
    sc.useDelimiter("\n"); // read entire line including spaces
    String text = sc.next();

    String[] words = text.split(" ");
    for (String word : words) {
        System.out.println(word);
    }
}
public static void problemNo21(Scanner sc) {
    

    System.out.print("Input the currency value (floating point with two decimal places): ");
    double amount = sc.nextDouble();

    int notesAmount = (int) amount;
    double coinsAmount = Math.round((amount - notesAmount) * 100.0) / 100.0;

    int n100 = notesAmount / 100;
    int n50  = (notesAmount % 100) / 50;
    int n5   = (notesAmount % 50) / 5;
    int n2   = (notesAmount % 5) / 2;

    double c50 = coinsAmount >= 0.50 ? 1 : 0;
    double c25 = coinsAmount % 0.50 >= 0.25 ? 1 : 0;

    System.out.println("\nCurrency Notes:");
    System.out.println("100 number of Note(s): " + n100);
    System.out.println("50 number of Note(s): " + n50);
    System.out.println("5 number of Note(s): " + n5);
    System.out.println("2 number of Note(s): " + n2);

    System.out.println("\nCurrency Coins:");
    System.out.println(".50 number of Coin(s): " + (int) c50);
    System.out.println(".25 number of Coin(s): " + (int) c25);
}


public static void problemNo22(Scanner sc) {
    

    System.out.print("Input two angles of triangle separated by comma: ");
    String input = sc.nextLine();
    String[] angles = input.split(",");
    int angle1 = Integer.parseInt(angles[0].trim());
    int angle2 = Integer.parseInt(angles[1].trim());

    int angle3 = 180 - (angle1 + angle2);
    System.out.println("Third angle of the triangle: " + angle3);
}
public static void problemNo23(Scanner sc) {
    

    System.out.print("Input an alphabet: ");
    char ch = sc.next().charAt(0);

    if ("AEIOUaeiou".indexOf(ch) != -1) {
        System.out.println("The alphabet is a vowel.");
    } else {
        System.out.println("The alphabet is a consonant.");
    }
}
public static void problemNo24(Scanner sc) {
    

    System.out.print("Input a digit: ");
    int digit = sc.nextInt();
    String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    if (digit >= 0 && digit <= 9) {
        System.out.println(words[digit]);
    } else {
        System.out.println("Invalid digit");
    }
}
public static void problemNo25(Scanner sc) {
    
    int number = (int) (Math.random() * 20) + 1;
    int guess = 0;

    while (guess != number) 
        System.out.print("Guess the number between 1 and 20: ");
        guess = sc.nextInt();
        if (guess < number) {
            System.out.println("Too low!");
			  } else if (guess > number) {
            System.out.println("Too high!");
        } else {
            System.out.println("Correct! The number is " + number);

		}
}
 public static void problemNo26(Scanner sc) {

    String username;

    while (true) {
        System.out.print("Enter a username (at least 8 characters): ");
        username = sc.nextLine();
        if (username.length() >= 8) {
            System.out.println("Valid username entered: " + username);
            break;
        } else {
            System.out.println("Invalid username. Try again.");
        }
    }
}
public static void problemNo27(Scanner sc) {
    

    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();
    long factorial = 1;

    int i = 1;
    while (i <= num) {
        factorial *= i;
        i++;
    }

    System.out.println("Factorial of " + num + " = " + factorial);
}

public static void problemNo28(Scanner sc) {
    

    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();

    int i = 1;
    while (i <= 10) {
        System.out.println(num + " x " + i + " = " + (num * i));
        i++;
    }
}
public static void problemNo29() {
    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}
 public static void problemNo30(Scanner sc) {
    

    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine();

    // Handle leftover newline from previous nextInt() calls in the menu
    if (sentence.trim().isEmpty()) {
        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();
    }

    if (sentence.trim().isEmpty()) {
        System.out.println("No sentence entered.");
        return;
    }

    String[] words = sentence.split("\\s+");
    String longest = "";
    for (String word : words) {
        // remove surrounding punctuation from the word
        String clean = word.replaceAll("[^a-zA-Z0-9']", "");
        if (clean.length() > longest.length()) {
            longest = clean;
        }
    }

    System.out.println("Longest word: " + longest);
    System.out.println("Length: " + longest.length());

}
public static void problemNo31(Scanner sc) {
    

    System.out.print("Input the number of elements to be stored in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Input " + n + " elements in the array:");
    for (int i = 0; i < n; i++) {
        System.out.print("element - " + i + " : ");
        arr[i] = sc.nextInt();
    }

    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) max = arr[i];
        if (arr[i] < min) min = arr[i];
    }

    System.out.println("Maximum element is: " + max);
    System.out.println("Minimum element is: " + min);
}
public static void problemNo32(Scanner sc) {
    

    System.out.print("Input the number of elements to be stored in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Input " + n + " elements in the array:");
    for (int i = 0; i < n; i++) {
        System.out.print("element - " + i + " : ");
        arr[i] = sc.nextInt();
    }

    System.out.println("The Even elements are:");
    for (int num : arr) {
        if (num % 2 == 0) System.out.print(num + " ");
    }
    System.out.println("\nThe Odd elements are:");
    for (int num : arr) {
        if (num % 2 != 0) System.out.print(num + " ");
    }
    System.out.println();
}
public static void problemNo33(Scanner sc) {
    

    System.out.print("Input the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Input " + n + " elements in the array:");
    for (int i = 0; i < n; i++) {
        System.out.print("element - " + i + " : ");
        arr[i] = sc.nextInt();
    }

    // Bubble sort ascending
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    System.out.println("Elements of array in sorted ascending order:");
    for (int num : arr) System.out.print(num + " ");
    System.out.println();
}
public static void problemNo34(Scanner sc) {
    

    System.out.print("Input the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Input " + n + " elements in the array:");
    for (int i = 0; i < n; i++) {
        System.out.print("element - " + i + " : ");
        arr[i] = sc.nextInt();
    }

    // Bubble sort descending
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    System.out.println("Elements of the array in sorted descending order:");
    for (int num : arr) System.out.print(num + " ");
    System.out.println();
}
public static void problemNo35(Scanner sc) {
    

    System.out.print("Input the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Input " + n + " elements in the array:");
    for (int i = 0; i < n; i++) {
        System.out.print("element - " + i + " : ");
        arr[i] = sc.nextInt();
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num < largest) {
            secondLargest = num;
        }
    }

    System.out.println("The Second largest element in the array is: " + secondLargest);
}
public static void problemNo36(Scanner sc) {
    

    System.out.print("Input any number: ");
    int num = sc.nextInt();

    if (isEven(num)) System.out.println("The entered number is even.");
    else System.out.println("The entered number is odd.");
}

public static boolean isEven(int n) {
    return n % 2 == 0;
}

public static void problemNo37(Scanner sc ) {
    
    System.out.print("Input any decimal number: ");
    int num = sc.nextInt();

    System.out.println("The Binary value is: " + toBinary(num));
}

public static String toBinary(int n) {
    if (n == 0) return "0";
    String binary = "";
    while (n > 0) {
        binary = (n % 2) + binary;
        n /= 2;
    }
    return binary;
}
public static void problemNo38(Scanner sc) {
    

    System.out.print("Input year: ");
    int year = sc.nextInt();

    if (year < 1000 || year > 9999) {
        System.out.println("Invalid year");
    } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println("Leap Year");
    } else {
        System.out.println("Not a Leap Year");
    }
}
public static void problemNo39(Scanner sc) {
    

    System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM");
    System.out.print("Input radius: ");
    float r = sc.nextFloat();

    float area = getCircleArea(r);
    System.out.printf("The area is: %.2f\n", area);
}

public static float getCircleArea(float radius) {
    return (float) (Math.PI * radius * radius);
}
public static void problemNo40(Scanner sc) {
    
    System.out.println("WELCOME TO NICOS COMPUTING AREA OF THE SQUARE PROGRAM");
    System.out.print("Input side: ");
    float side = sc.nextFloat();

    float area = getSquareArea(side);
    System.out.println("The area is: " + area);
}

public static float getSquareArea(float side) {
    return side * side;
}
public static void problemNo41(Scanner sc) {
    

    System.out.println("WELCOME TO NICOS COMPUTING AREA OF THE RECTANGLE PROGRAM");
    System.out.print("Input length: ");
    float length = sc.nextFloat();
    System.out.print("Input width: ");
    float width = sc.nextFloat();

    float area = getRectangleArea(length, width);
    System.out.println("The area is: " + area);
}

public static float getRectangleArea(float length, float width) {
    return length * width;
}

public static void problemNo42(Scanner sc) {
    

    System.out.print("Input a five-digit integer: ");
    int num = sc.nextInt();

    if (num < 10000 || num > 99999) {
        System.out.println("ONLY FIVE DIGIT");
        return;
    }

    int original = num;
    int reverse = 0;

    while (num != 0) {
        reverse = reverse * 10 + num % 10;
        num /= 10;
    }

    if (original == reverse) System.out.println("PALINDROME");
    else System.out.println("NOT PALINDROME");
}
public static void problemNo43(Scanner sc) {
    

    System.out.print("Input a four-digit integer: ");
    int num = sc.nextInt();

    if (num < 1000 || num > 9999) {
        System.out.println("NOT A FOUR-DIGIT NUMBER");
        return;
    }

    int d1 = num / 1000;
    int d2 = (num / 100) % 10;
    int d3 = (num / 10) % 10;
    int d4 = num % 10;

    System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);
}
public static void problemNo44(Scanner sc) {
   

    System.out.print("Input gross salary: ");
    double salary = sc.nextDouble();
    double tax;

    if (salary <= 50000) {
        tax = salary * 0.10;
    } else if (salary <= 100000) {
        tax = 5000 + (salary - 50000) * 0.15;
    } else if (salary <= 200000) {
        tax = 15000 + (salary - 100000) * 0.20;
    } else {
        tax = salary * 0.25;
    }

    System.out.printf("Tax due: %.2f\n", tax);
}

public static void problemNo45(Scanner sc) {
    

    System.out.print("Input a number (up to 10 digits): ");
    long num = sc.nextLong();

    if (num < 0 || num > 9999999999L) {
        System.out.println("Invalid number");
        return;
    }

    System.out.println(numberToWords(num));
}

public static String numberToWords(long num) {
    if (num == 0) return "zero";

    String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
    String[] thousands = { "", " thousand ", " million ", " billion " };

    String words = "";
    int index = 0;

    while (num > 0) {
        int part = (int) (num % 1000);
        if (part != 0) {
            String segment = "";
            int h = part / 100;
            int t = part % 100;
            if (h != 0) segment += units[h] + " hundred ";
            if (t < 20) segment += units[t];
            else segment += tens[t / 10] + (t % 10 != 0 ? " " + units[t % 10] : "");
            words = segment + thousands[index] + words;
        }
        num /= 1000;
        index++;
    }

    return words.trim();
}

public static void problemNo46(Scanner sc) {
    
    String line;

    while (true) {
        System.out.print("Enter a line (type 'tiuq' to quit): ");
        line = sc.nextLine();
        if (line.equals("tiuq")) break;

        String reversed = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed += line.charAt(i);
        }
        System.out.println(reversed);
    }
}
public static void problemNo47(Scanner sc) {
    

    System.out.print("Enter a positive integer N: ");
    int N = sc.nextInt();

    int a = 1, b = 1;
    System.out.print("Fibonacci series: ");
    for (int i = 1; i <= N; i++) {
        System.out.print(a + " ");
        int next = a + b;
        a = b;
        b = next;
    }
    System.out.println();
}
public static void problemNo48(Scanner sc) {


    System.out.print("Input amount: ");
    double amount = sc.nextDouble();
    System.out.print("Input number of years: ");
    int years = sc.nextInt();

    if (amount <= 0 || years <= 0) {
        System.out.println("Both amount and years must be positive");
        return;
    }

    for (int i = 0; i < years; i++) {
        amount *= 1.10; // 10% interest
    }

    System.out.printf("Amount after %d years: %.2f\n", years, amount);
}
public static void problemNo49(Scanner sc) {
    
    int[] arr = new int[10];

    int total = 0, totalPositive = 0, totalNegative = 0;
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int negativeCount = 0;
    int between50and100 = 0;

    System.out.println("Input 10 integers:");
    for (int i = 0; i < 10; i++) {
        arr[i] = sc.nextInt();
        total += arr[i];
        if (arr[i] > 0) totalPositive += arr[i];
        if (arr[i] < 0) {
            totalNegative += arr[i];
            negativeCount++;
        }
        if (arr[i] > largest) largest = arr[i];
        if (arr[i] < smallest) smallest = arr[i];
        if (arr[i] >= 50 && arr[i] <= 100) between50and100++;
    }

    System.out.println("Total: " + total);
    System.out.println("Largest: " + largest);
    System.out.println("Smallest: " + smallest);
    System.out.println("Total positive: " + totalPositive);
    System.out.println("Total negative: " + totalNegative);
    System.out.println("Negative numbers count: " + negativeCount);
    System.out.println("Numbers between 50 and 100: " + between50and100);
}
public static void problemNo50(Scanner sc) {
   

    System.out.print("Input destination code (1-4): ");
    int dest = sc.nextInt();
    System.out.print("Input time code (1 for day, 2 for night): ");
    int time = sc.nextInt();
    System.out.print("Input duration in minutes: ");
    int duration = sc.nextInt();

    double ratePerMinute = 0;

    switch (dest) {
        case 1: ratePerMinute = (time == 1) ? 50.0 / 3 : 45.0 / 3; break; // American
        case 2: ratePerMinute = (time == 1) ? 30.0 / 2 : 27.0 / 2; break; // Asian
        case 3: ratePerMinute = (time == 1) ? 40.0 / 3 : 36.0 / 3; break; // African
        case 4: ratePerMinute = (time == 1) ? 35.0 / 2 : 30.0 / 2; break; // European
        default: System.out.println("Invalid destination"); return;
    }

    double total = ratePerMinute * duration;
    System.out.printf("Total charges: %.2f\n", total);
}

public static void problemNo51(Scanner sc) {
    

    System.out.print("Input distance of the trip (in meters): ");
    int distance = sc.nextInt();
    double fare = 20.0; // first 300 meters

    if (distance > 300) {
        int extraDistance = distance - 300;
        fare += Math.ceil(extraDistance / 200.0) * 2.0;
    }

    System.out.printf("Total taxi fare: %.2f\n", fare);
}
public static void problemNo52(Scanner sc) {
    

    System.out.print("Input a code: ");
    String code = sc.nextLine();

    boolean isValid = true;

    if (code.length() > 5) isValid = false;
    if (!code.startsWith("*")) isValid = false;
    if (!Character.isLetter(code.charAt(code.length() - 1))) isValid = false;

    System.out.println(isValid ? "Valid code" : "Invalid code");
}

public static void problemNo53(Scanner sc) {
   
    double[] scores = new double[10];

    System.out.println("Please enter 10 scores:");
    for (int i = 0; i < 10; i++) {
        scores[i] = sc.nextDouble();
    }

    double max = scores[0], min = scores[0], sum = 0;
    for (double score : scores) {
        if (score > max) max = score;
        if (score < min) min = score;
        sum += score;
    }

    double finalScore = (sum - max - min) / 8.0;
    System.out.printf("The final score is: %.2f\n", finalScore);
}
public static void problemNo54(Scanner sc) {
    

    System.out.print("Base: ");
    int base = sc.nextInt();
    System.out.print("Exponent: ");
    int exponent = sc.nextInt();

    long result = 1;
    for (int i = 0; i < exponent; i++) {
        result *= base;
    }

    System.out.println("Output: " + result);
}

public static void problemNo55(Scanner sc) {
    

    System.out.print("Input number (1-99): ");
    int n = Math.abs(sc.nextInt());

    for (int i = 1; i <= n; i++) {
        printLine(i);
    }
}

public static void printLine(int num) {
    for (int i = 0; i < num; i++) {
        System.out.print(num);
    }
    System.out.println();
}
public static void problemNo56(Scanner sc) {

  

    System.out.print("Input a number (0-9999999): ");
    int num = sc.nextInt();
    int bombs = 0;

    int temp = num;
    while (temp > 0) {
        int digit = temp % 10;
        if (digit == 0 || digit == 6 || digit == 7 || digit == 5) bombs += 1;
        else if (digit == 2 || digit == 1) bombs += 2;
        temp /= 10;
    }

    System.out.println("Total BOMBS: " + bombs);
}




}