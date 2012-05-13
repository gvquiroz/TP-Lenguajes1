
import grupoN.Plomero;
import grupoN.Material;

	
public class MarioBros implements Plomero {
	
    public int filaDelSegundoCa�o=0;
	public int filaDelPrimerCa�o=0;
	public int columnaDelPrimerCa�o=0;
	public int columnaSegundoCa�o=0;
	public Material[][] nuevaPared;
	@Override
	/**
	 * funcionamiento: si el ultimo ca�o no esta en la ultima columna del array se sigue ejecutando
	 * 
	 */
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


