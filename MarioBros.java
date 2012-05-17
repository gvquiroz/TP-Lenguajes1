package Tp1brench1;

public class MarioBros implements Plomero {

	
	public Material[][] nuevaPared; 
	public int ancho;
	public int alto;
	public boolean verificadorDePosicionDeAncho[];
	public int filaDelPrimerCaño=0;
	public int columnaDelPrimerCaño=0;
	public int columnaSegundoCaño=0;
	 public int filaDelSegundoCaño=0;
	
	/**
	 * pre: La pared debe tener como mínimo de tres espacios de ancho y uno de alto.
	 * post: Inicia la pared con un tamaño de ancho, un tamaño de alto, y un caño horizontal ubicado en la 
	 * primer columna y un caño horizontal en la columna final.
	 * @param anchoPared Se ingresa el valor de ancho que se le quiere dar a la pared.
	 * @param altoPared  Se ingresa el valor de alto que se le quiere dar a la pared.
	 * @param alturaCañoHorizontalInicial Es la posición de alto en la que se va a ingresar el caño horizontal inicial.
	 * @param alturaCañoHorizontalFinal Es la posición de alto en la que se va a ingresar el caño horizontal final.
	 */
	 
	 public void iniciarPared(int anchoPared, int altoPared,int alturaCañoHorizontalInicial,int alturaCañoHorizontalFinal){

		if (anchoPared<3||altoPared<1){
			Error errorDeTamañoDeLaPared= new Error("La pared debe tener al menos tres espacios de ancho y uno de alto");
			throw errorDeTamañoDeLaPared;
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
		
		
		
		
		agregarCañoHorizontalInicial(1,alturaCañoHorizontalInicial);
		agregarCañoHorizontalFinal(this.nuevaPared.length,alturaCañoHorizontalFinal);
	}
	
	 /**
	  * pre: Existe una pared.
	  * post: Es el método que utiliza "iniciarPared" para poner el caño horizontal inicial.
	  * @param posicionAncho Es la posición de ancho donde se pone el primer caño.
	  * @param posicionAlto Es la posición de alto donde se pone el primer caño.
	  */
	private void agregarCañoHorizontalInicial(int posicionAncho, int posicionAlto){
		if(posicionAlto<1||posicionAlto>(this.nuevaPared[(posicionAncho)-1].length)+1||posicionAncho<1){
			Error errorDePosicion= new Error("No se puede poner un caño horizontal en esa posición");
			throw errorDePosicion;
		}
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CAÑO_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[posicionAncho]= false;
		
	}
	
	/**
	 * pre: Existe una pared.
	 * post: Es el método que utiliza "iniciarPared" para poner el caño horizontal final.
	 * @param posicionAncho Es la posición de ancho donde se pone el caño final.
	 * @param posicionAlto Es la posición de alto donde se pone el caño final.
	 */
	private void agregarCañoHorizontalFinal(int posicionAncho, int posicionAlto){
		if(posicionAlto<1||posicionAlto>(this.nuevaPared[(posicionAncho)-1].length)+1||posicionAncho<1){
			Error errorDePosicion= new Error("No se puede poner un caño horizontal en esa posición");
			throw errorDePosicion;
		}
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CAÑO_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[(posicionAncho)-2]= false;
		
	}
	
	/**
	 * pre: Existe una pared.
	 * post: Se pone un caño horizontal en la posición indicada.
	 * @param posicionAncho Es la posición de ancho donde es pone el caño horizontal.
	 * @param posicionAlto Es la posición de alto donde es pone el caño horizontal.
	 */
		public void agregarCañoHorizontalAlaPared(int posicionAncho, int posicionAlto){
		
		if(posicionAncho>this.ancho||posicionAlto>this.alto||posicionAncho<1||posicionAlto<1){
			Error posicionInexistente = new Error("No se puede colocar el caño fuera de la pared");
			throw posicionInexistente;
		}
		
		if(this.verificadorDePosicionDeAncho[(posicionAncho)-1]==false){
			Error errorDePosicion= new Error("No se puede poner un caño horizontal en esa posición");
			throw errorDePosicion;
		}
		
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CAÑO_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[posicionAncho]= false;
		this.verificadorDePosicionDeAncho[(posicionAncho)-2]= false;
		
		}
	
	/**
	 * pre: Existe una pared.
	 * post: Devuelve el material que hay en la posición indicada.
	 * @param posicionAncho Es la posición de ancho que se quiere verificar.
	 * @param posicionAlto Es la posición de alto que se quiere verificar.
	 * @return Devuelve el material que hay en la posición indicada.
	 */
	public Material verificarMaterial(int posicionAncho, int posicionAlto) {
		return nuevaPared[posicionAncho-1][posicionAlto-1];
		
	}

	
@Override
	public void construirCañeria(Material[][] pared) {
		this.nuevaPared = pared;
		while (this.columnaSegundoCaño != this.nuevaPared.length-1){
			buscandoCaños(pared);
			primerCañoArribaDelSegundoCaño();
			primerCañoDebajoDelSegundoCaño();
			primerCañoAlMismoNivelQueElSegundo();
		}
    	
	}
/**
 * pre: si los caños estan al mismo nivel en filas
 * post: une el primer caño con el segundo con caños horizontales
 */
	private void primerCañoAlMismoNivelQueElSegundo() {
		if(this.filaDelPrimerCaño == this.filaDelSegundoCaño){
			for (int i = this.columnaDelPrimerCaño+1; i < this.columnaSegundoCaño;i++){
				this.nuevaPared[i][this.filaDelPrimerCaño] = Material.CAÑO_HORIZONTAL;
			}
		}

	}
/**
 * pre: si el primer caño esta debajo del segundo
 * post: une el priemr caño con el segundo usando Material.CAÑO_ARRIBA_IZQUIERDA y Material.CAÑO_ABAJO_DERECHA,
 *  en el caso que sea necesario unira estos 2 con caños_verticales.
 */
	private void primerCañoDebajoDelSegundoCaño() {
		if (this.filaDelPrimerCaño > this.filaDelSegundoCaño){
			this.nuevaPared[this.columnaDelPrimerCaño+1][this.filaDelPrimerCaño] = Material.CAÑO_ARRIBA_IZQUIERDA;
			for (int i = this.filaDelPrimerCaño -1; i > this.filaDelSegundoCaño;i--){
				this.nuevaPared[this.columnaDelPrimerCaño+1][i] = Material.CAÑO_VERTICAL;
			}
			this.nuevaPared[this.columnaDelPrimerCaño+1][this.filaDelSegundoCaño] = Material.CAÑO_ABAJO_DERECHA;
			for (int i = this.columnaDelPrimerCaño+2; i < this.columnaSegundoCaño;i++){
				this.nuevaPared[i][this.filaDelSegundoCaño] = Material.CAÑO_HORIZONTAL;
			}
		}
	}
/**
 * pre: si el primer caño esta arriba del segundo
 * post:une el primer caño con el segundo usando Material.CAÑO_ABAJO_IZQUIERDA y Material.CAÑO_ARRIBA_DERECHA
 * en el caso que sea necesario unira estos 2 con caños_verticales.
 */
	private void primerCañoArribaDelSegundoCaño() {
		if (this.filaDelPrimerCaño < this.filaDelSegundoCaño){
			this.nuevaPared[this.columnaDelPrimerCaño+1][this.filaDelPrimerCaño] = Material.CAÑO_ABAJO_IZQUIERDA;
			for (int i = this.filaDelPrimerCaño +1; i < this.filaDelSegundoCaño; i++){
				this.nuevaPared[this.columnaDelPrimerCaño +1][i] = Material.CAÑO_VERTICAL;
			}
			this.nuevaPared[this.columnaDelPrimerCaño+1][this.filaDelSegundoCaño] = Material.CAÑO_ARRIBA_DERECHA;
			for (int i = this.columnaDelPrimerCaño+2; i < this.columnaSegundoCaño; i++){
				this.nuevaPared[i][this.filaDelSegundoCaño] = Material.CAÑO_HORIZONTAL;
			}
		}	
	}
/**
 * Busca un primer caño horizontal empezando desde la columna del caño encontrado 
 * (en el caso de que no hubiesen caños anteriormente empieza de la columna 0)
 * guarda la fila y la columna del primer caño encontrado
 * busca un segundo caño horizontal empezando desde la columan posterior al caño encontrado
 * guarda la fila y la columna del segundo caño encontrado
 * @param pared
 */
	private void buscandoCaños(Material[][] pared) {
		boolean primerCañoEncontrado = false;
		for (int i = this.columnaSegundoCaño;i < pared.length && !primerCañoEncontrado; i++){
			for(int j = 0;j < pared[i].length; j++){
				if (pared[i][j] == Material.CAÑO_HORIZONTAL ){
					this.filaDelPrimerCaño = j;
					this.columnaDelPrimerCaño = i;
					primerCañoEncontrado = true;
    			}
    		}
    	}
		boolean segundoCañoEncontrado = false;
    	for (int i = this.columnaDelPrimerCaño + 1; i < pared.length && !segundoCañoEncontrado; i++){
    		for(int j = 0; j < pared[i].length; j++){
    			if (pared[i][j] == Material.CAÑO_HORIZONTAL ){
    				this.filaDelSegundoCaño = j;
    				this.columnaSegundoCaño = i;
    				segundoCañoEncontrado = true;
    			}
    			
    		}
    	}
	}
}


