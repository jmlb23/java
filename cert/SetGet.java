public class SetGet{
	private int valor;
	private static char letra;
	String cadea1;
	//nunha clase coma nunha funcion obviamente podemos setear o valor
	//da variable nada mais declarala e pode estar composto por variables
	//anteriormente declaradas
	String cadea2 = cadea1 + "sdfsf";

	public static void main(String... args){
		SetGet sg = new SetGet();
		//sempre que os atributos sexan visibles dende os metodos
		//poderemos facer uso deles
		//private so podemos facer uso deles dentro da propia clase
		//package ou friend podemos facer uso deles nas clases do mesmo package
		//protected poderemos facer uso deles nas clases derivadas
		//public accesible dende calquer lado
		sg.valor = 5;
		SetGet.letra = 'v';
	}
}
