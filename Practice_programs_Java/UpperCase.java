// write a program to print upper case alphabets with its position 
class UpperCase 
{
	public static void main(String[] args) 
	{
		int A=1;
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+" "+"-"+A++);
		}
	}
}
