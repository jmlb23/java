
//en java as clases organizanse en paquetes
//os paquetes son directorios que conteñen clases que teñen certa relacion
//entre si
//para facer uso destes paquetes no noso programa facemos uso da sentenza
//import o import non é como o include de c que mete unha copia literal
//o import dille o compilador unha ruta onde buscar en que paquete

//por defecto en java importase java.lang sempre

//temos dous tipos de imports os absolutos
//ou os imports relativos

//(3)
//ollo porque os imports que especifican o nome da clase
//teñen preferencia sobre os que teñen comodins
//no caso de conflicto
import java.util.*;
import java.sql.Date;

import java.util.*; //dicimos que do paquete java.util busque todo
import java.util.Scanner;//dicimos que do paquete java.util busque Scanner
			//e collera o .class compilado

/*//da erro
non se pode importar duas clases co mesmo nome de forma explicita
non podemos temos que importar unha e despois fully qualified name na outra
import java.util.Date;
import java.sql.Date;
*/
//(2)
//neste caso como sabe java cal queremos usar en cada caso
//import java.util.*;
//import java.sql.*;

//coidado porque java non importa subpaquetes(1)
import java.lang.ref.ReferenceQueue;
public class ImpPaq{

	public static void main(String... args){
		//se facemos uso dunha clase en java sen importala
		//danos erro porque o compilador mira por defecto
		//para buscar a clase
		//en java.lang no arquivo actual e no paquete actual
		//para que funcione temos que importar o paquete onde esta a clase co ficheiro
		Scanner s = new Scanner(System.in);
		//tamen en vez de importar podemos usar o full qualified name
		//paquete+clase da utilidade a usar
		java.util.Scanner sFull = new java.util.Scanner(System.in);
		//util cando importamos duas clases iguais
		
		//(2) como java non sabe en cada caso cal queremos usar temos que usar o full qualified name
		//java.util.Date x;
		//java.sql.Date y;
		//(1)
		ReferenceQueue rq = new ReferenceQueue();
	

		//(3)
		Date d= new Date(4L);
		System.out.println(d instanceof java.sql.Date);
	}	
}
