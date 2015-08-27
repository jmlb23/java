class Proba{
	public Proba(){
		System.out.println("clase pai "+System.currentTimeMillis());
	}
}

public class Constructores extends Proba{
	//teñen o propisto de inicializar variables e conter a menor cantidade
	//de loxica posible xa que a sua funcion é so inicializar
	//en java non devolven ningun valor
	//teñen que ter o mesmo nome que a clase
	//se non definimos un explicitamente o compilador pon un por defecto
	//sen argumentos

	int valor;//se non se incializan no constructor
		  //os atributos collen o valor por defecto do tipo decalrado
		
	public Constructores(){
		/**?¿os millis demostran que tamen se chama o super
		   de maneira implicita ainda que chamemos a 
		   outro constructor mediante o this aqui
		   se se chamase dende o outro constructor o super os millis deverian ser os mesmos????
		   definitivamente parece ser que se chama dende o outro constructor xa non imprime duas veces
		   o mellor é unha conclusion prematura pero se hai chamada a outro constructor mediante this
		   parece ser que non hai chamada implicita neste ambito o super
		*/
		//son chamadas a constructores da clase pai ou filla
		//e o ter que ser sempre un dos dous non poden ser os dous a vez
		//nada se executa antes da chamada a super dentro do constructor
		//super();
			//super reprensenta a chamada o constructor da clase pai
			//ou sen parenteses é o que representa a instancia concreta
			//da clase pai
			//se non se chama de maneira explicita chamase
			//por defecto de maneira implicita
			//ten que ser a primeira sentenza no constructor
		//non podemos chamar o propio constructor dentro do constructor da erro de compilacion por chamada recursiva
		this("hola","sdfsfd","sfsdfsfs","sdsdfdsdfsfd","3544564575","holaa","sdsfsfd","sdfafsdfsfs","sdsaaadfdsdfsfd","3a544564575");	//chamada o constructor da propia clase;	//chamada o constructor da propia clase
		
			//se aparece ten que ser a sentenza inmediatamente
			//posterior
			//sen parenteses represente a unha instancia concreta
			//da clase

			//teñen que ser os primeiros estamentos porque
			//java querese asegurar que os recursos de cada instancia estan dispoñibles
			//antes de ser usados
			//ollo porque non podemos usar os dous a vez
			
	}

	public Constructores(String... args){
		super();
		System.out.println("clase filla "+System.currentTimeMillis());
	}
	public static void main(String... args){
		//para instanciar unha clase é dicir para crear a concrecion
		//do patron que é a clase, so necesitamos usar o operador new
		//e chamar un dos constructores declarados na clase
		new Constructores();//o new devolve un punteiro a zona de memoria e o constructor inicializa os atributos e fai as operaciosn necesarias
		//java é unha linguaxe que ten recolecion de basura automatica
		//é dicir que as referecias que non estan asociadas destruense
		//para conservar a instancia podemos gardalo nunha variable
		//Constructores c = new Constructores();
	}
}
