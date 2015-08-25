public class Main{
	//en java un programa ten normalmente un punto de entrada
	//que reprensenta o memtodo main
	//este metodo ten que ter un acceso publico
	//ten que ser un metodo de clase é dicir static
	//e non devolve nada é dicir é void
	//como argumentos recive un array de strings
	//ten esta firma non o chou se non que public
	//permite que a jvm a poida chamar con independencia de paquetes e clases
	//static permite que non sea necesario crear unha instancia da clase
	//o void chamase pero non retorna valor porque a sua funcion e cambiar
	//o estado do obxeto
	//recordar que os obxetos teñen estado representado polos atributos
	//e o comportamento represnetado polo metodos
	//os argumentos que ten o metodo representan os paramentros pasados por
	//liña de comandos que estan dispoñibles neste array de strings
	//podemos meter literais numericos
	//ou strings representados enter comiñas
	public static void main(String... args){
		System.out.println("hola mundo desde o main");
		for(String a : args) System.out.println(a);
	}
}
