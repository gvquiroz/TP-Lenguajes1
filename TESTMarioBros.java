import junit.framework.Assert;
import grupoN.Material;

import org.junit.Test;


public class TESTMarioBros {
	@Test
	public void creandoPared(){
		MarioBros miPlomero = new MarioBros();
		Material[][] miPared = paredTest(5,4);
		miPlomero.construirCa�eria(miPared);
		System.out.println("Fila del primer ca�o es "+miPlomero.filaDelPrimerCa�o );
		System.out.println("Columna del primer ca�o es "+ miPlomero.columnaDelPrimerCa�o );
		System.out.println("Fila del segundo ca�o es " + miPlomero.filaDelSegundoCa�o );
		System.out.println("Columna del segundo ca�o es " + miPlomero.columnaSegundoCa�o);
		Assert.assertEquals("probando ladrillo en 1,1",Material.LADRILLO, miPlomero.miPared[2][2] );
	}
	/**
	 * 
	 * @param ancho: filas
	 * @param largo: columnas
	 * @return
	 * Crea una pared con Un ca�o_horizontal arriba a la izc y abajo a la derecha.
	 */
	private Material[][] paredTest(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][0] = Material.CA�O_HORIZONTAL;
		miPared[miPared.length-1][miPared[0].length-1] = Material.CA�O_HORIZONTAL;
		for (int i = 0; i < miPared.length; i++){
			for (int j = 0; j < miPared[i].length; j++){
				if (miPared[i][j] != Material.CA�O_HORIZONTAL){
					miPared[i][j] = Material.LADRILLO;
				}
			}
		}
		return miPared;
	}
}
