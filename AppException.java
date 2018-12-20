interface ITranscation
{
	void withdraw(String Acc,String pin,int amt);
	
}
class SBI implements ITranscation
{
	public void withdraw(String Acc,String pin,int amt)
	{
		System.out.println("Amount in ATM");
	}
}
class AppException extends SBI
{
	public static void main(String args[])throws Exception
	{
		ITranscation it=new AppException();
		
		try
		{
			it.withdraw("CNRB000123","2345",100);
			System.out.println("Withdraw Some Amount from atm");
		}
		catch(Exception e)
		{
			throw new Exception("Check ur details");
		}
	}
}