package Tp1brench1;

public class MarioBros implements Plomero {

	
	public Material[][] nuevaPared; 
	public int ancho;
	public int alto;
	public boolean verificadorDePosicionDeAncho[];
	public int filaDelPrimerCa�o=0;
	public int columnaDelPrimerCa�o=0;
	public int columnaSegundoCa�o=0;
	 public int filaDelSegundoCa�o=0;
	
	/**
	 * pre: La pared debe tener como m�nimo de tres espacios de ancho y uno de alto.
	 * post: Inicia la pared con un tama�o de ancho, un tama�o de alto, y un ca�o horizontal ubicado en la 
	 * primer columna y un ca�o horizontal en la columna final.
	 * @param anchoPared Se ingresa el valor de ancho que se le quiere dar a la pared.
	 * @param altoPared  Se ingresa el valor de alto que se le quiere dar a la pared.
	 * @param alturaCa�oHorizontalInicial Es la posici�n de alto en la que se va a ingresar el ca�o horizontal inicial.
	 * @param alturaCa�oHorizontalFinal Es la posici�n de alto en la que se va a ingresar el ca�o horizontal final.
	 */
	 
	 public void iniciarPared(int anchoPared, int altoPared,int alturaCa�oHorizontalInicial,int alturaCa�oHorizontalFinal){

		if (anchoPared<3||altoPared<1){
			Error errorDeTama�oDeLaPared= new Error("La pared debe tener al menos tres espacios de ancho y uno de alto");
			throw errorDeTama�oDeLaPared;
		}
		this.ancho=anchoPared;
		this.alto=altoPared;
		
		this.nuevaPared= new Material[ancho][alto];
		
		
		
		for (int anchoDeLaPared=0; anchoDeLaPared<this.nuevaPared.length; anchoDeLaPared++){
			for(int altoDeLaPared=0; altoDeLaPared<this.nuevaPared[anchoDeLaPared].length;altoDeLaPared++){
				nuevaPared[anchoDeLaPared][altoDeLaPared]=Material.LADRILLO;
				
			}
		}
	this.verificadorDePosicionDeAncho= new boolean[this.nuevaPared.length];
		for (int posicion=0; posicion<this.nuevaPared.length; posicion++){
			this.verificadorDePosicionDeAncho[posicion]= true;
		}
		
		
		
		
		agregarCa�oHorizontalInicial(1,alturaCa�oHorizontalInicial);
		agregarCa�oHorizontalFinal(this.nuevaPared.length,alturaCa�oHorizontalFinal);
	}
	
	 /**
	  * pre: Existe una pared.
	  * post: Es el m�todo que utiliza "iniciarPared" para poner el ca�o horizontal inicial.
	  * @param posicionAncho Es la posici�n de ancho donde se pone el primer ca�o.
	  * @param posicionAlto Es la posici�n de alto donde se pone el primer ca�o.
	  */
	private void agregarCa�oHorizontalInicial(int posicionAncho, int posicionAlto){
		if(posicionAlto<1||posicionAlto>(this.nuevaPared[(posicionAncho)-1].length)+1||posicionAncho<1){
			Error errorDePosicion= new Error("No se puede poner un ca�o horizontal en esa posici�n");
			throw errorDePosicion;
		}
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CA�O_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[posicionAncho]= false;
		
	}
	
	/**
	 * pre: Existe una pared.
	 * post: Es el m�todo que utiliza "iniciarPared" para poner el ca�o horizontal final.
	 * @param posicionAncho Es la posici�n de ancho donde se pone el ca�o final.
	 * @param posicionAlto Es la posici�n de alto donde se pone el ca�o final.
	 */
	private void agregarCa�oHorizontalFinal(int posicionAncho, int posicionAlto){
		if(posicionAlto<1||posicionAlto>(this.nuevaPared[(posicionAncho)-1].length)+1||posicionAncho<1){
			Error errorDePosicion= new Error("No se puede poner un ca�o horizontal en esa posici�n");
			throw errorDePosicion;
		}
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CA�O_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[(posicionAncho)-2]= false;
		
	}
	
	/**
	 * pre: Existe una pared.
	 * post: Se pone un ca�o horizontal en la posici�n indicada.
	 * @param posicionAncho Es la posici�n de ancho donde es pone el ca�o horizontal.
	 * @param posicionAlto Es la posici�n de alto donde es pone el ca�o horizontal.
	 */
		public void agregarCa�oHorizontalAlaPared(int posicionAncho, int posicionAlto){
		
		if(posicionAncho>this.ancho||posicionAlto>this.alto||posicionAncho<1||posicionAlto<1){
			Error posicionInexistente = new Error("No se puede colocar el ca�o fuera de la pared");
			throw posicionInexistente;
		}
		
		if(this.verificadorDePosicionDeAncho[(posicionAncho)-1]==false){
			Error errorDePosicion= new Error("No se puede poner un ca�o horizontal en esa posici�n");
			throw errorDePosicion;
		}
		
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CA�O_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[posicionAncho]= false;
		this.verificadorDePosicionDeAncho[(posicionAncho)-2]= false;
		
		}
	
	/**
	 * pre: Existe una pared.
	 * post: Devuelve el material que hay en la posici�n indicada.
	 * @param posicionAncho Es la posici�n de ancho que se quiere verificar.
	 * @param posicionAlto Es la posici�n de alto que se quiere verificar.
	 * @return Devuelve el material que hay en la posici�n indicada.
	 */
	public Material verificarMaterial(int posicionAncho, int posicionAlto) {
		return nuevaPared[posicionAncho-1][posicionAlto-1];
		
	}

	
@Override
	public void construirCa�eria(Material[][] pared) {
		this.nuevaPared = pared;
		while (this.columnaSegundoCa�o != this.nuevaPared.length-1){
			buscandoCa�os(pared);
			primerCa�oArribaDelSegundoCa�o();
			primerCa�oDebajoDelSegundoCa�o();
			primerCa�oAlMismoNivelQueElSegundo();
		}
    	
	}
/**
 * pre: si los ca�os estan al mismo nivel en filas
 * post: une el primer ca�o con el segundo con ca�os horizontales
 */
	private void primerCa�oAlMismoNivelQueElSegundo() {
		if(this.filaDelPrimerCa�o == this.filaDelSegundoCa�o){
			for (int i = this.columnaDelPrimerCa�o+1; i < this.columnaSegundoCa�o;i++){
				this.nuevaPared[i][this.filaDelPrimerCa�o] = Material.CA�O_HORIZONTAL;
			}
		}

	}
/**
 * pre: si el primer ca�o esta debajo del segundo
 * post: une el priemr ca�o con el segundo usando Material.CA�O_ARRIBA_IZQUIERDA y Material.CA�O_ABAJO_DERECHA,
 *  en el caso que sea necesario unira estos 2 con ca�os_verticales.
 */
	private void primerCa�oDebajoDelSegundoCa�o() {
		if (this.filaDelPrimerCa�o > this.filaDelSegundoCa�o){
			this.nuevaPared[this.columnaDelPrimerCa�o+1][this.filaDelPrimerCa�o] = Material.CA�O_ARRIBA_IZQUIERDA;
			for (int i = this.filaDelPrimerCa�o -1; i > this.filaDelSegundoCa�o;i--){
				this.nuevaPared[this.columnaDelPrimerCa�o+1][i] = Material.CA�O_VERTICAL;
			}
			this.nuevaPared[this.columnaDelPrimerCa�o+1][this.filaDelSegundoCa�o] = Material.CA�O_ABAJO_DERECHA;
			for (int i = this.columnaDelPrimerCa�o+2; i < this.columnaSegundoCa�o;i++){
				this.nuevaPared[i][this.filaDelSegundoCa�o] = Material.CA�O_HORIZONTAL;
			}
		}
	}
/**
 * pre: si el primer ca�o esta arriba del segundo
 * post:une el primer ca�o con el segundo usando Material.CA�O_ABAJO_IZQUIERDA y Material.CA�O_ARRIBA_DERECHA
 * en el caso que sea necesario unira estos 2 con ca�os_verticales.
 */
	private void primerCa�oArribaDelSegundoCa�o() {
		if (this.filaDelPrimerCa�o < this.filaDelSegundoCa�o){
			this.nuevaPared[this.columnaDelPrimerCa�o+1][this.filaDelPrimerCa�o] = Material.CA�O_ABAJO_IZQUIERDA;
			for (int i = this.filaDelPrimerCa�o +1; i < this.filaDelSegundoCa�o; i++){
				this.nuevaPared[this.columnaDelPrimerCa�o +1][i] = Material.CA�O_VERTICAL;
			}
			this.nuevaPared[this.columnaDelPrimerCa�o+1][this.filaDelSegundoCa�o] = Material.CA�O_ARRIBA_DERECHA;
			for (int i = this.columnaDelPrimerCa�o+2; i < this.columnaSegundoCa�o; i++){
				this.nuevaPared[i][this.filaDelSegundoCa�o] = Material.CA�O_HORIZONTAL;
			}
		}	
	}
/**
 * Busca un primer ca�o horizontal empezando desde la columna del ca�o encontrado 
 * (en el caso de que no hubiesen ca�os anteriormente empieza de la columna 0)
 * guarda la fila y la columna del primer ca�o encontrado
 * busca un segundo ca�o horizontal empezando desde la columan posterior al ca�o encontrado
 * guarda la fila y la columna del segundo ca�o encontrado
 * @param pared
 */
	private void buscandoCa�os(Material[][] pared) {
		boolean primerCa�oEncontrado = false;
		for (int i = this.columnaSegundoCa�o;i < pared.length && !primerCa�oEncontrado; i++){
			for(int j = 0;j < pared[i].length; j++){
				if (pared[i][j] == Material.CA�O_HORIZONTAL ){
					this.filaDelPrimerCa�o = j;
					this.columnaDelPrimerCa�o = i;
					primerCa�oEncontrado = true;
    			}
    		}
    	}
		boolean segundoCa�oEncontrado = false;
    	for (int i = this.columnaDelPrimerCa�o + 1; i < pared.length && !segundoCa�oEncontrado; i++){
    		for(int j = 0; j < pared[i].length; j++){
    			if (pared[i][j] == Material.CA�O_HORIZONTAL ){
    				this.filaDelSegundoCa�o = j;
    				this.columnaSegundoCa�o = i;
    				segundoCa�oEncontrado = true;
    			}
    			
    		}
    	}
	}
}


