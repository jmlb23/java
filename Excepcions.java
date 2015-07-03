public class Excepcions{
	public static void lanza(int dividendo, int divisor)throws ArithmeticException{
		if(divisor==0){
			throw new ArithmeticException();
		}
	}

	public static String proba(){
		try{
			lanza(2,0);
		}catch(ArithmeticException e){
			System.out.println("ten que ser maior que 0 o divisor");
			return "retornamos no catch";
		}finally{
			System.out.println("estamos no try");
			return "retornamos no finally";
		}
	
	}
	public static void main(String... args){
		System.out.println(proba());
	}
}
