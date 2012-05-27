package Tp1brench1;

public class Error404 implements Plomero {

	private int filaDelPrimerCaño=0;
	private int columnaDelPrimerCaño=0;
	private int columnaSegundoCaño=0;
	private int filaDelSegundoCaño=0;
	
@Override
	
	public void construirCañeria(Material[][] pared) {
		if (pared.length < 3){
			throw new Error ("La pared ingresada es muy chica, no se puede construir");
		}
		while (this.columnaSegundoCaño != pared.length-1){
			buscandoCaños(pared);
			primerCañoArribaDelSegundoCaño(pared);
			primerCañoDebajoDelSegundoCaño(pared);
			primerCañoAlMismoNivelQueElSegundo(pared);
		}
    	
	}
/**
 * pre: si los caños estan al mismo nivel en filas
 * post: une el primer caño con el segundo con caños horizontales
 */
	private void primerCañoAlMismoNivelQueElSegundo(Material[][] pared) {
		if(this.filaDelPrimerCaño == this.filaDelSegundoCaño){
			for (int i = this.columnaDelPrimerCaño+1; i < this.columnaSegundoCaño;i++){
				pared[i][this.filaDelPrimerCaño] = Material.CAÑO_HORIZONTAL;
			}
		}

	}
/**
 * pre: si el primer caño esta debajo del segundo
 * post: une el priemr caño con el segundo usando Material.CAÑO_ARRIBA_IZQUIERDA y Material.CAÑO_ABAJO_DERECHA,
 *  en el caso que sea necesario unira estos 2 con caños_verticales.
 */
	private void primerCañoDebajoDelSegundoCaño(Material[][] pared) {
		if (this.filaDelPrimerCaño > this.filaDelSegundoCaño){
			pared[this.columnaDelPrimerCaño+1][this.filaDelPrimerCaño] = Material.CAÑO_ARRIBA_IZQUIERDA;
			for (int i = this.filaDelPrimerCaño -1; i > this.filaDelSegundoCaño;i--){
				pared[this.columnaDelPrimerCaño+1][i] = Material.CAÑO_VERTICAL;
			}
			pared[this.columnaDelPrimerCaño+1][this.filaDelSegundoCaño] = Material.CAÑO_ABAJO_DERECHA;
			for (int i = this.columnaDelPrimerCaño+2; i < this.columnaSegundoCaño;i++){
				pared[i][this.filaDelSegundoCaño] = Material.CAÑO_HORIZONTAL;
			}
		}
	}
/**
 * pre: si el primer caño esta arriba del segundo
 * post:une el primer caño con el segundo usando Material.CAÑO_ABAJO_IZQUIERDA y Material.CAÑO_ARRIBA_DERECHA
 * en el caso que sea necesario unira estos 2 con caños_verticales.
 */
	private void primerCañoArribaDelSegundoCaño(Material[][] pared) {
		if (this.filaDelPrimerCaño < this.filaDelSegundoCaño){
			pared[this.columnaDelPrimerCaño+1][this.filaDelPrimerCaño] = Material.CAÑO_ABAJO_IZQUIERDA;
			for (int i = this.filaDelPrimerCaño +1; i < this.filaDelSegundoCaño; i++){
				pared[this.columnaDelPrimerCaño +1][i] = Material.CAÑO_VERTICAL;
			}
			pared[this.columnaDelPrimerCaño+1][this.filaDelSegundoCaño] = Material.CAÑO_ARRIBA_DERECHA;
			for (int i = this.columnaDelPrimerCaño+2; i < this.columnaSegundoCaño; i++){
				pared[i][this.filaDelSegundoCaño] = Material.CAÑO_HORIZONTAL;
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

