public class TaxIncomecount
{
	public static void main(String[] args) 
	{
		int income = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		final double tax = (income * (rate/100));
		System.out.println("Calculation of Tax for a Taxable income "+income+" and rate "+rate+" is : "+tax);
	}
}
