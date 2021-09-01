package JunitTestGradle;

public class SumNumbers {

	public int sum(int a , int b) {
		if(a>=10) 
			throw new IllegalArgumentException("value should be less than ten");
		return a+b;
		
	}

}
