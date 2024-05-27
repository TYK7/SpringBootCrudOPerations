//write a program to print small letter alphabets from a to z and print in same line
class SmallCharecter 
{
	public static void main(String[] args) 
	{ int a=1;
		for(char ch='a';ch<='z';ch++)
		{
			{
			System.out.print(" "+ch+"-"+a++);
			}
		}
		System.out.println(" ");
	}
}
 