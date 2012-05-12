import junit.framework.Assert;
import grupoN.Material;

import org.junit.Test;


public class TESTMarioBros {
	@Test
	public void creandoPared(){
		MarioBros miPlomero = new MarioBros();
		Material[][] miPared = paredTest(5,4);
		miPlomero.construirCaņeria(miPared);
		System.out.println("Fila del primer caņo es "+miPlomero.filaDelPrimerCaņo );
		System.out.println("Columna del primer caņo es "+ miPlomero.columnaDelPrimerCaņo );
		System.out.println("Fila del segundo caņo es " + miPlomero.filaDelSegundoCaņo );
		System.out.println("Columna del segundo caņo es " + miPlomero.columnaSegundoCaņo);
		Assert.assertEquals("probando ladrillo en 1,1",Material.LADRILLO, miPlomero.miPared[2][2] );
	}
	/**
	 * 
	 * @param ancho: filas
	 * @param largo: columnas
	 * @return
	 * Crea una pared con Un caņo_horizontal arriba a la izc y abajo a la derecha.
	 */
	private Material[][] paredTest(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][0] = Material.CAŅO_HORIZONTAL;
		miPared[miPared.length-1][miPared[0].length-1] = Material.CAŅO_HORIZONTAL;
		for (int i = 0; i < miPared.length; i++){
			for (int j = 0; j < miPared[i].length; j++){
				if (miPared[i][j] != Material.CAŅO_HORIZONTAL){
					miPared[i][j] = Material.LADRILLO;
				}
			}
		}
		return miPared;
	}
}
