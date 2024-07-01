import java.lang.Math;
class RandomOTPGenerate
{	
	public int generatOtp()
	{
		int max = 10000;
		int min = 1;
		int otp = (int)((Math.random())*(min-max)+1)+max;
		return otp;
	}
	public static void main(String[] args) 
	{
	  	StringBuffer otps = new StringBuffer();
	  	RandomOTPGenerate obj = new RandomOTPGenerate();

	  	for (int i=1;i<=25;i++) 
	  	{
			otps.append(obj.generatOtp()+"\n");	  		
  		}	
  		System.out.println(otps);
	}
}