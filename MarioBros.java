
import grupoN.Plomero;
import grupoN.Material;

	
public class MarioBros implements Plomero {
	
    public int filaDelSegundoCa�o= 0;
	public int filaDelPrimerCa�o= 0;
	public int columnaDelPrimerCa�o= 0;
	public int columnaSegundoCa�o= 0;
	public Material[][] miPared;
	@Override
    public void construirCa�eria(Material[][] pared) {
		this.miPared = pared;
    	buscandoCa�os(pared);
    	this.miPared[0][1] = Material.CA�O_ABAJO_IZQUIERDA;
    	for (int i = 1; i < this.filaDelSegundoCa�o-1; i++){
    		this.miPared[1][i] = Material.CA�O_VERTICAL;
    	}
    	this.miPared[this.filaDelSegundoCa�o][1] = Material.CA�O_ARRIBA_DERECHA;
    	
    	
	}

	private void buscandoCa�os(Material[][] pared) {
		for (int i = 0;i < pared[i].length; i++){
    		if (pared[0][i] == Material.CA�O_HORIZONTAL ){
    			this.filaDelPrimerCa�o = i;
    			this.columnaDelPrimerCa�o = 0;
    		}
    	}
    	for (int i = 0; i < pared[i].length; i++){
    		if (pared[pared.length-1][i] == Material.CA�O_HORIZONTAL ){
    			this.filaDelSegundoCa�o = i;
    			this.columnaSegundoCa�o = pared.length-1;
    		}
    	}
	}

}


