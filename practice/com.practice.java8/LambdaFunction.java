package coding.practice.java8;

public class LambdaFunction {

	interface Start{
		public void show(int x,int y);
	}
	
	public static void main(String[] args) {
		Start s1 = (x,y)->{
			System.out.println(x*y);
		}; 
		s1.show(10, 5);
	}
	
}
