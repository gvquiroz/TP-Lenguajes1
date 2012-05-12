
import grupoN.Plomero;
import grupoN.Material;

	
public class MarioBros implements Plomero {
	
    public int filaDelSegundoCaņo= 0;
	public int filaDelPrimerCaņo= 0;
	public int columnaDelPrimerCaņo= 0;
	public int columnaSegundoCaņo= 0;
	public Material[][] miPared;
	@Override
    public void construirCaņeria(Material[][] pared) {
		this.miPared = pared;
    	buscandoCaņos(pared);
    	this.miPared[0][1] = Material.CAŅO_ABAJO_IZQUIERDA;
    	for (int i = 1; i < this.filaDelSegundoCaņo-1; i++){
    		this.miPared[1][i] = Material.CAŅO_VERTICAL;
    	}
    	this.miPared[this.filaDelSegundoCaņo][1] = Material.CAŅO_ARRIBA_DERECHA;
    	
    	
	}

	private void buscandoCaņos(Material[][] pared) {
		for (int i = 0;i < pared[i].length; i++){
    		if (pared[0][i] == Material.CAŅO_HORIZONTAL ){
    			this.filaDelPrimerCaņo = i;
    			this.columnaDelPrimerCaņo = 0;
    		}
    	}
    	for (int i = 0; i < pared[i].length; i++){
    		if (pared[pared.length-1][i] == Material.CAŅO_HORIZONTAL ){
    			this.filaDelSegundoCaņo = i;
    			this.columnaSegundoCaņo = pared.length-1;
    		}
    	}
	}

}


