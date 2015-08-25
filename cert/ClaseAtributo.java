//package hola; non da erro de compilacion se non temos un directorio co mesmo nome do paquete
//pero para atopalo co classpath como se fai, non se pode o compilador non da erro pero en execucion si que se esixe que a sentenza package teña
//o memo nome que o directorio que conten o ficheiro java


class ClaseAtributo{
			   //recordar que java é unha linguaxe
			   //que basea os paquetes en directorios fisicos
			   //e a os modificadores indican a visibilidade
			   //entre paquetes e clases
				
			   //----------------------------
				//modificadores de visibilidade da clase
				/*
				public a clase é visible dende calquer paquete
				private non é visible
				package ou friend é visible so para clases do
				mesmo paquete
				*/
			  //-----------------------------
	String nome; //unha clase cun atributo co modificador de package
	//os modificadores a nivel de atributo ou atributo indican a dispoñibilidade
	//de uso dos mesmos dende outras clases
	
	
	//temos catro modificadores aplicables a elementos dunha clase
	/*
	public os elementos poden ser accedidos desde calquer clase en calquer paquete
	protected os elementos poden ser accedidos solo desde as clases fillas que conteñen os compoñentes
	package ou friend os elementos que leven este modificador (e dicir que non leven nada explicito) poden ser usados desde as clases dos mesmo paquete
	private os elementos que leven este modificador so poden ser usados na mesma clase
	*/
}
