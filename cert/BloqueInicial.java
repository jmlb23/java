class Bloque{
	public Bloque(){
		System.out.println("hola dende o constructor do pai");
	}
}

public class BloqueInicial extends Bloque{
	//en java temos a posibilidade de meter nun bloque de codigo(representan
	//as chaves { }) instrucions 
	//podemos atopalos dentro de metodos que son bloques de codigo normales
	//que so agrupan instrucions
	//podemos atopalos no ambito da clase fora de calquer metodo reciven o
	//nome de bloques de instancia
	//e podemos atopalos no ambito da clase fora de metodos precedidos da
	//palabra chave static
	
	//o bloque de instacia executase sempre despois do super
	{
		//digamos que dentro dos bloque de inicializacion e static as regras coas variables
		//son parecidas as que teñen nos metodos non se inicializan por defecto
		String nome2;
		System.out.println("hola dende o bloque de instancia");
		//(1)System.out.println(nome);
		System.out.println(nome2);
		//temos que ter en conta que os bloques de codigo e de inicializacion ou static
		//entra en xogo o concepto do ambito
		//todo o que declaremos dentro deles non estara dispoñible fora deles
		//e todo o declarado fora deles estara dispoñible dentro deles	
	}
	//(1)ollo porque nos bloques de codigo si que importa a orde de chamada a unha variable
	//non podemos referirnos a ela antes de que sexa inicializada
	//String nome;//erro de compilacion
	{
		
		System.out.println("hola dende o bloque de instancia dous");
	}
	//o bloque static executase no momento no que se reserva memoria para
	//os elementos static
	//lembremos que os elementos static so se lle reserva memoria o comezo
	//e nunca mais se volve a reservar xa que é comun a todas a instancias
	//e non necesitamos de instacia para usalo
	//non se executa por orde de aparicion excepto que sexa do mesmo tipo

	static{
		System.out.println("hola dende o bloque static");
	}

	static{
		System.out.println("hola dende o bloque static 2");
	}

	public void hola(){
		adios();
	}
	public void adios(){
		System.out.println("hola");
	}
	//a orde aqui non importa xa que esto é poo non estructurada
	//xa aqui a compilacion non é lineal como en c
	//en linguaxes de programacion estructurada como en c esto seria impensable
	//pero en poo os compoñentes carganse en memoria todos non vai liña a liña o compilador mirando se porque este é un nivel de abstraccion superior
	//exemplo en c++
	/** en c++ por exemplo non estamos obirgados como en java a meter todo nunha clase
	    temos un ambito global en java non, todo esta nunha clase
	    por eso non é o mesmo
	    ademais en java o compilador é o suficientemente "listo" para inferir deducir se mais adiante esta unha clase o metodo definido se facemos uso del/a
	    temen temos que distinguir a dinamica dentro dun metodo e dentro dunha clase en java porque hai certas diferenças
	int main(){

		Clase c;
		return 0;
	}	

	class Clase
	{
		private:
		int v;
		int z;
		int x;
	};
	*/

}

class Main{
	public static void main(String... args){
		BloqueInicial b = new BloqueInicial();
		b.hola();
	}
}
