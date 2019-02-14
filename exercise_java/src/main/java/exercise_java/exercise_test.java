package exercise_java;
import java.sql.Array;
import java.util.Scanner;
import exercise_java.new_class;
public class exercise_test {

	public static void main( String[] args )
    {
		System.out.println(125 % 24 );
		 Scanner input = new Scanner(System.in);
	      System.out.print("Input an integer: ");
	        long n = input.nextLong();
	       System.out.println("The sum of the digits is: " + sumDigits(n));

	    
	 int a;
	  Scanner in = new Scanner(System.in);
	System.out.print("Input number: ");
	 
	 a = in .nextInt();
	  System.out.printf("%d + %d%d  + %d%d%d\n", a, a, a, a, a,a);
	  System.out.format("\nCurrent Date time: %tc%n\n", System.nanoTime());
	int[] num_array = {10, -20, 0, 30, 40, 60, 10};
	    System.out.println((num_array[0] = 10));
	    Scanner asd = new Scanner(System.in);
	    System.out.print("String: ");
		 String line = asd.nextLine();
		 line = line.toLowerCase();
		 System.out.println(line); 

		 Scanner f = new Scanner(System.in);
	     System.out.print(" Sentence: ");
		 String g = f.nextLine();
		 String[] words = g.split("[ ]+");
		 System.out.print(words);
		 System.out.println("sondan bi önceki kelime: "+words[words.length - 2]);
		 exercise();
		 
    }
	
	    public static int sumDigits(long sa) {
	        int sum = 0;
	        while (sa != 0) {
	            sum += sa % 10;
	            sa /= 10;
	        }
	        return sum;
	    }
	    
	    public static void exercise()
	    {
	    	new_class newclass = new new_class();
	   	newclass.classnew();
	    	int d = newclass.getChartLengt();
	    	System.out.println(d);
	    	int[] arr = newclass.Sort();
	    	System.out.println(arr[2]);
	    	System.out.println(System.getenv("USERNAME"));
	    }
    }
    

