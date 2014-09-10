package testNG;

public class Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@test (groups = "smoke")
		public void Test1(){
			System.out.println("iam in test 1");
		}
		{
			
		}

	}

}
