
import grupoN.Plomero;
import grupoN.Material;

	
public class MarioBros implements Plomero {
	
    public int filaDelSegundoCaño= 0;
	public int filaDelPrimerCaño= 0;
	public int columnaDelPrimerCaño= 0;
	public int columnaSegundoCaño= 0;
	public Material[][] miPared;
	@Override
    public void construirCañeria(Material[][] pared) {
		this.miPared = pared;
    	buscandoCaños(pared);
    	this.miPared[0][1] = Material.CAÑO_ABAJO_IZQUIERDA;
    	for (int i = 1; i < this.filaDelSegundoCaño-1; i++){
    		this.miPared[1][i] = Material.CAÑO_VERTICAL;
    	}
    	this.miPared[this.filaDelSegundoCaño][1] = Material.CAÑO_ARRIBA_DERECHA;
    	
    	
	}

	private void buscandoCaños(Material[][] pared) {
		for (int i = 0;i < pared[i].length; i++){
    		if (pared[0][i] == Material.CAÑO_HORIZONTAL ){
    			this.filaDelPrimerCaño = i;
    			this.columnaDelPrimerCaño = 0;
    		}
    	}
    	for (int i = 0; i < pared[i].length; i++){
    		if (pared[pared.length-1][i] == Material.CAÑO_HORIZONTAL ){
    			this.filaDelSegundoCaño = i;
    			this.columnaSegundoCaño = pared.length-1;
    		}
    	}
	}

}


