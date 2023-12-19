package objects;

public class MethodOverLoading2 {

	public static void main(String[] args) {
		float result = caliculator2.sum2(10, 20);
	       System.out.println(result);
		}
	}
	
	class caliculator2
	{
		static float sum2(float a , float b) {
			System.out.println("sum1");
			float c = a+b;
			return c;
		}
		
		static double sum2(int i , int j,int c)
		{
			System.out.println("sum2");
			double k = i+j;
			return k;

}
}


