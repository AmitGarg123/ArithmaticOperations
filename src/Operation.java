
public class Operation {
	
	public void sum(int a, int b){
		System.out.println(a + b);
	}
	
	public static void main(String...arg){
		Operation oprObj = new Operation();
		oprObj.sum(3, 5);
	}

}
