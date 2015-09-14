//para as clases so podemos aplicar public ou nada que é package
//indican a visibilidade entre clases 
//package so son vibles entre as clases que peretencen o mesmo paquete
//public visible dende calquer clase en calquer paquete

public abstract class Aceso{
	//temos 2 tipos de modificadores
	//ambito
	public String s;//metodos e atributos accesible dende calquer clase seguindo o modificador da clase
	protected String s1; //metodos e atributos acesibles so dende as clases que extendan esta
	
	private String s2;//acesible dende metodos e atributos da propria clase en metodos
	
	String s3; //metodos e atributos accesible so dende clases do mesmo paquete
	
	//non-ambito
	//strictfp //pode ser aplicado so a clases e metodos fai que siga as regras do standar do fp e non dependa da plataforma
	//final pode ser aplicado a metodos clases que non poden ser sobreescritose extendidos e atributos que non poden ser modificados
	//abstract que pode preceder a unha clase ou metodo nunha clase indica que algun metodo non ten implementacion ou queremos indicar que non pode ser
	//instanciada (é dicir unha clase abstracta non ten porque conter metodos absctractos)
	//e nun metodo indica tamen que non esta implementado se existe un metodo abstracto na clase ten que se declarada como abstract
	public static void main(String... args){
		//dentro dun metodo non podemos preceder unha variable
		//dun modificador
		//xa que ten o do metodo	
	}
}
