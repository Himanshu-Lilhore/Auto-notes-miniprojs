
class AgeException extends Exception
{
	public String toString()
	{
		return "Age cannot be negative";
	}
}

class VerifyAge
{
	public String verify(int age) throws AgeException
	{
		if(age > 0)
		{
			return "Valid age";
		}
		else
		{
			throw new AgeException();
		}
	}
}

public class MakingException {

	public static void main(String[] args) 
	{
		VerifyAge v = new VerifyAge();
		try
		{
			String result = v.verify(-20);
			System.out.println(result);
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}

}
