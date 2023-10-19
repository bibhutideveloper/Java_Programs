public class Demo {
    public static void main(String[] args) {
    	try {
    		int result = 10/0;
    	}catch(Exception e){
    		System.out.println("Caught exception: "+e.getMessage());
    	}catch(ArithmeticException e) {
    		System.out.println("Arithmetic exception: "+e.getMessage());
    	}
    }
}
