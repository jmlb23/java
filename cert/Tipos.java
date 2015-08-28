public class Tipos{
	public static void main(String... args){
		
		//temos 8 tipos de valores primitivos en java
		//8bits
		byte bt = 1; //valor por defecto o literal 0 
		//16bits
		short sh = 2; //idem
		//32bits
		int enteiro = 45; //idem
		//ocupa 64 bits
		long longer = 23; //idem o long deberia ser tamen indicado explicitament con L
		//32bits
		float ft= 3.2f; //0.0 temos que indicalo xa que por defecto os numeros decimais son double e seria un downcast que ten que indicado explicitamente
		//64bits
		double db= 3.4; //idem
		//16bits unicode
		char c= 'a'; // '\u0000'
		boolean b= true; //false

		//podemos usar como en php a notacion literal de binario hexadecimal ou octal para calquera dos catro valores primitivos enteiros
		
		int bin = 0b101010101;//0b precedendo o numero
		int oct = 017; //0 precedendo o numero
		int hex = 0xffff; //0x precendendo o numero

		//en java 7 por motivos de lexivilidade introducese a posibilidade de partir numeros literais con guion baixo
		int g = 1_000_000;
		//non poden estar o comezo nin a fin do numero int w = _1000000_ ;
		//nos numeros decimais non poden estar antes nin despois do punto aparte das mesmas regras que para os enteiros
		//double d_erro = 34_._45;
		double cor = 3_400.3_4545;
		
		//cada un destes tipos de datos primitivos ten o que se lle chama unha clase wrapper unha clase envolvente que engade metodos e atributos
		//para aumentar a sua funcionalidade e as vantaxes xa coñecidas da oop
		//temos a ventaxa de que non temos porque usar new para crear un destes tipos xa que permiten o autoboxin e autounboxin apartir de java 5
		
		Double dObxeto = 3.2;
		double dPrim = dObxeto;
		//podemos crealo mediate new ou asignan o literal tal cal
		Double o = new Double(3.5);
	}
}
