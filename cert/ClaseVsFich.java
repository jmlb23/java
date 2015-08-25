//temos a posibilidade de definir varias clases no mesmo ficheiro
//cunhas restriccions
//so podemos ter unha clase publica por ficheiro
//podemos ter n clases non publicas no ficheiro
//a clase publica ten que ter o mesmo nome que o doficheiro
//podemos omitir que no ficheiro haxa unha clase publica e podese chamar
//diferente o ficheiro calquera que haxa definida


//esta clase é a unica publica que pode haber neste ficheiro
//ten que ter o mesmo nome que o .java

public class ClaseVsFich{

}

//esta o non ser publica pode ter o nome que queiramos pode haber N
class Punto{}


//o recomendable non é ter varias clases nun mismo ficheiro
//a manteñibilidade e a dependencia fisica(dependencia do ficheiro para cambiar as clases que conteña este) do proxecto veriase comprometida
//o mais recomendable e ter unha clase por ficheiro co mesmo nome que o ficheiro//teña ou non o modificador para facilitar o segemento de erros
