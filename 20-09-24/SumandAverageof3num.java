public class SumandAverageof3num
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		int sum = n1+n2+n3;
		double average = sum/3.0;
		
		System.out.println("Sum of "+n1+" , "+n2+" , "+n3+" is : "+sum);
		System.out.println("Average of "+n1+" , "+n2+" , "+n3+" is : "+average);

	}
}
