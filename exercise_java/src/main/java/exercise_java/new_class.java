package exercise_java;

import javax.print.DocFlavor.STRING;

public class new_class {

	public static void main( String[] args )
    {
		classnew ();
		getChartLengt();
    }
	
    
	public static void classnew ()
	{
		String main_string = "lalalalalal";
		   String word = "ahahhahaha";
		   System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
		  // System.out.println(System.getSecurityManager());
	}
	
	
	public static int  getChartLengt()
	{
		 String str1 = "fwerwrwerwerew";    
			int len = str1.length();
			if(len >= 3)
				System.out.println( str1.substring(0, 3));
			else if(len == 1)
				System.out.println( (str1.charAt(0)+"##"));
			else
				System.out.println("###");
			return str1.length();
	}
	
	public int[]  Sort()
	{
		int[] array_nums = {20, 30, 40};
	//	int[] new_Arr = {};
		int[] new_Arr = new int[3];
		for(int i=0 ; i<array_nums.length; i++ )
		{
			int s = array_nums[array_nums.length-1-i];
			 //argsValue[d]=Integer.parseInt(i);
			new_Arr[i]=s;
		}
		return new_Arr;
	}
}
