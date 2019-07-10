package aaa;

public class Avc {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		  for (int i = 0; i < 5; i++) {//在这里设置了loop 作为指定的跳转点
		        for (int j = 0; j < 2; j++) {
		        	if (true) {
		        		System.out.println("走到这里就跳到最外层，然后继续往下执行"+j);
		                break;
		        		///continue;
					}
		               
		        }
		        System.out.println("按照程序，到最里层的循环之后，执行一边就跳出了三层循环，到了这里111");
		    }
		    System.out.println("按照程序，到最里层的循环之后，执行一边就跳出了三层循环，到了这里");
	}

		
		
}
