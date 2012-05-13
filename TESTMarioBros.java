import junit.framework.Assert;
import grupoN.Material;

import org.junit.Test;


public class TESTMarioBros {
	@Test
	public void probandoPrimerCañoArribaDelSegundo(){
		MarioBros miPlomero = new MarioBros();
		Material[][] miPared = paredConPrimerCañoArribaDelSegundo(5,4);
		miPlomero.construirCañeria(miPared);
		Assert.assertEquals("fila del primer caño",0, miPlomero.filaDelPrimerCaño);
		Assert.assertEquals("columna del primer caño",0, miPlomero.columnaDelPrimerCaño);
		Assert.assertEquals("fila del segundo caño",3, miPlomero.filaDelSegundoCaño);
		Assert.assertEquals("columna del segundo caño",4, miPlomero.columnaSegundoCaño);

		Assert.assertEquals("probando ladrillo en 2,2",Material.LADRILLO, miPlomero.nuevaPared[2][2] );
		Assert.assertEquals("probando caño vertical en 1,2",Material.CAÑO_VERTICAL, miPlomero.nuevaPared[1][2] );
		Assert.assertEquals("probando arriba derecha en 1,3",Material.CAÑO_ARRIBA_DERECHA, miPlomero.nuevaPared[1][3] );
		Assert.assertEquals("probando horizontal 2,3",Material.CAÑO_HORIZONTAL, miPlomero.nuevaPared[2][3] );
		Assert.assertEquals("probando horizontal en 3,3",Material.CAÑO_HORIZONTAL, miPlomero.nuevaPared[3][3] );
		Assert.assertEquals("probando horizontal 4,3",Material.CAÑO_HORIZONTAL, miPlomero.nuevaPared[4][3] );
	}
	@Test
	public void probandoPrimerCañoAbajoDelSegundo(){
		MarioBros miPlomero2 = new MarioBros();
		Material[][] miPared = paredConPrimerCañoAbajoDelSegundo(5,4);
		miPlomero2.construirCañeria(miPared);
		Assert.assertEquals("fila del primer caño",3, miPlomero2.filaDelPrimerCaño);
		Assert.assertEquals("columna del primer caño",0, miPlomero2.columnaDelPrimerCaño);
		Assert.assertEquals("fila del segundo caño",0, miPlomero2.filaDelSegundoCaño);
		Assert.assertEquals("columna del segundo caño",4, miPlomero2.columnaSegundoCaño);
		

		Assert.assertEquals("probando Arriba izc en 1,3",Material.CAÑO_ARRIBA_IZQUIERDA, miPlomero2.nuevaPared[1][3] );
		Assert.assertEquals("probando Vertical en 1,2",Material.CAÑO_VERTICAL, miPlomero2.nuevaPared[1][2] );
		Assert.assertEquals("probando Vertical en 1,1",Material.CAÑO_VERTICAL, miPlomero2.nuevaPared[1][1] );
		Assert.assertEquals("probando Abajo derecha en 1,0",Material.CAÑO_ABAJO_DERECHA, miPlomero2.nuevaPared[1][0] );
		Assert.assertEquals("probando Horizontal en 2,0",Material.CAÑO_HORIZONTAL, miPlomero2.nuevaPared[2][0] );
		Assert.assertEquals("probando Horizontal en 3,0",Material.CAÑO_HORIZONTAL, miPlomero2.nuevaPared[3][0] );

	}
	@Test
	public void probandoPrimerCañoAlMismoNivelQueElSegundo(){
		MarioBros miPlomero3 = new MarioBros();
		Material[][] miPared = paredConPrimerCañoAIgualNivelQueElSegundo(5, 4);
		miPlomero3.construirCañeria(miPared);
		Assert.assertEquals("fila del primer caño",3, miPlomero3.filaDelPrimerCaño);
		Assert.assertEquals("columna del primer caño",0, miPlomero3.columnaDelPrimerCaño);
		Assert.assertEquals("fila del segundo caño",3, miPlomero3.filaDelSegundoCaño);
		Assert.assertEquals("columna del segundo caño",4, miPlomero3.columnaSegundoCaño);
		
		Assert.assertEquals("probando Horizontal en 1,3",Material.CAÑO_HORIZONTAL, miPlomero3.nuevaPared[1][3] );
		Assert.assertEquals("probando Horizontal en 2,3",Material.CAÑO_HORIZONTAL, miPlomero3.nuevaPared[2][3] );
		Assert.assertEquals("probando Horizontal en 3,3",Material.CAÑO_HORIZONTAL, miPlomero3.nuevaPared[3][3] );
		Assert.assertEquals("probando Horizontal en 4,3",Material.CAÑO_HORIZONTAL, miPlomero3.nuevaPared[4][3] );

	}
	@Test
	public void probandoAlgoritmoConCañoHorizontalEnElMedio(){
		MarioBros miPlomero4 = new MarioBros();
		Material[][] miPared = probandoWhileCAMBIARRRRRR(7, 4);
		miPlomero4.construirCañeria(miPared);
		
		Assert.assertEquals("probando Arriba izc en 1,3",Material.CAÑO_ARRIBA_IZQUIERDA, miPlomero4.nuevaPared[1][3] );
		Assert.assertEquals("probando Vertical en 1,2",Material.CAÑO_VERTICAL, miPlomero4.nuevaPared[1][2] );
		Assert.assertEquals("probando Abajo derecha en 1,1",Material.CAÑO_ABAJO_DERECHA, miPlomero4.nuevaPared[1][1] );
		Assert.assertEquals("probando Horizontal en 2,1",Material.CAÑO_HORIZONTAL, miPlomero4.nuevaPared[2][1] );
		Assert.assertEquals("probando Arriba izquierda en 3,1",Material.CAÑO_ARRIBA_IZQUIERDA, miPlomero4.nuevaPared[3][1] );
		Assert.assertEquals("probando Abajo derecha en 3,0",Material.CAÑO_ABAJO_DERECHA, miPlomero4.nuevaPared[3][0] );
		Assert.assertEquals("probando Horizontal en 4,0",Material.CAÑO_HORIZONTAL, miPlomero4.nuevaPared[4][0] );
		Assert.assertEquals("probando Horizontal en 5,0",Material.CAÑO_HORIZONTAL, miPlomero4.nuevaPared[5][0] );
		Assert.assertEquals("probando Horizontal en 6,0",Material.CAÑO_HORIZONTAL, miPlomero4.nuevaPared[6][0] );
		
	}
	/**
	 * 
	 * @param ancho: filas
	 * @param largo: columnas
	 * @return
	 * Crea una pared con Un caño_horizontal arriba a la izc y abajo a la derecha.
	 */
	private Material[][] paredConPrimerCañoArribaDelSegundo(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][0] = Material.CAÑO_HORIZONTAL;
		miPared[miPared.length-1][miPared[0].length-1] = Material.CAÑO_HORIZONTAL;
		for (int i = 0; i < miPared.length; i++){
			for (int j = 0; j < miPared[i].length; j++){
				if (miPared[i][j] != Material.CAÑO_HORIZONTAL){
					miPared[i][j] = Material.LADRILLO;
				}
			}
		}
		return miPared;
	}
	/**
	 * 
	 * @param ancho
	 * @param alto
	 * @return
	 * Crea una pared con caño_horizontal en la primera columna y ultima fila,
	 * 							   y otro en la ultima columna y ultima fila
	 */
	private Material[][] paredConPrimerCañoAIgualNivelQueElSegundo(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][miPared[0].length - 1] = Material.CAÑO_HORIZONTAL;
		miPared[miPared.length-1][miPared[0].length-1] = Material.CAÑO_HORIZONTAL;
		for (int i = 0; i < miPared.length; i++){
			for (int j = 0; j < miPared[i].length; j++){
				if (miPared[i][j] != Material.CAÑO_HORIZONTAL){
					miPared[i][j] = Material.LADRILLO;
				}
			}
		}
		return miPared;
	}
	/**
	 * 
	 * @param ancho
	 * @param alto
	 * @return
	 * crea una pared con caño_horizontal en la primera columna ultima fila y otro en la ultima columna primera fila;
	 */
	private Material[][] paredConPrimerCañoAbajoDelSegundo(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][miPared[0].length - 1] = Material.CAÑO_HORIZONTAL;
		miPared[miPared.length-1][0] = Material.CAÑO_HORIZONTAL;
		for (int i = 0; i < miPared.length; i++){
			for (int j = 0; j < miPared[i].length; j++){
				if (miPared[i][j] != Material.CAÑO_HORIZONTAL){
					miPared[i][j] = Material.LADRILLO;
				}
			}
		}
		return miPared;
	}
	private Material[][] probandoWhileCAMBIARRRRRR(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][miPared[0].length - 1] = Material.CAÑO_HORIZONTAL;
		miPared[miPared.length-1][0] = Material.CAÑO_HORIZONTAL;
		miPared[2][1] = Material.CAÑO_HORIZONTAL;
		for (int i = 0; i < miPared.length; i++){
			for (int j = 0; j < miPared[i].length; j++){
				if (miPared[i][j] != Material.CAÑO_HORIZONTAL){
					miPared[i][j] = Material.LADRILLO;
				}
			}
		}
		return miPared;
	}
}
