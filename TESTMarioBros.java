import junit.framework.Assert;
import grupoN.Material;

import org.junit.Test;


public class TESTMarioBros {
	@Test
	public void probandoPrimerCa�oArribaDelSegundo(){
		MarioBros miPlomero = new MarioBros();
		Material[][] miPared = paredConPrimerCa�oArribaDelSegundo(5,4);
		miPlomero.construirCa�eria(miPared);
		Assert.assertEquals("fila del primer ca�o",0, miPlomero.filaDelPrimerCa�o);
		Assert.assertEquals("columna del primer ca�o",0, miPlomero.columnaDelPrimerCa�o);
		Assert.assertEquals("fila del segundo ca�o",3, miPlomero.filaDelSegundoCa�o);
		Assert.assertEquals("columna del segundo ca�o",4, miPlomero.columnaSegundoCa�o);

		Assert.assertEquals("probando ladrillo en 2,2",Material.LADRILLO, miPlomero.nuevaPared[2][2] );
		Assert.assertEquals("probando ca�o vertical en 1,2",Material.CA�O_VERTICAL, miPlomero.nuevaPared[1][2] );
		Assert.assertEquals("probando arriba derecha en 1,3",Material.CA�O_ARRIBA_DERECHA, miPlomero.nuevaPared[1][3] );
		Assert.assertEquals("probando horizontal 2,3",Material.CA�O_HORIZONTAL, miPlomero.nuevaPared[2][3] );
		Assert.assertEquals("probando horizontal en 3,3",Material.CA�O_HORIZONTAL, miPlomero.nuevaPared[3][3] );
		Assert.assertEquals("probando horizontal 4,3",Material.CA�O_HORIZONTAL, miPlomero.nuevaPared[4][3] );
	}
	@Test
	public void probandoPrimerCa�oAbajoDelSegundo(){
		MarioBros miPlomero2 = new MarioBros();
		Material[][] miPared = paredConPrimerCa�oAbajoDelSegundo(5,4);
		miPlomero2.construirCa�eria(miPared);
		Assert.assertEquals("fila del primer ca�o",3, miPlomero2.filaDelPrimerCa�o);
		Assert.assertEquals("columna del primer ca�o",0, miPlomero2.columnaDelPrimerCa�o);
		Assert.assertEquals("fila del segundo ca�o",0, miPlomero2.filaDelSegundoCa�o);
		Assert.assertEquals("columna del segundo ca�o",4, miPlomero2.columnaSegundoCa�o);
		

		Assert.assertEquals("probando Arriba izc en 1,3",Material.CA�O_ARRIBA_IZQUIERDA, miPlomero2.nuevaPared[1][3] );
		Assert.assertEquals("probando Vertical en 1,2",Material.CA�O_VERTICAL, miPlomero2.nuevaPared[1][2] );
		Assert.assertEquals("probando Vertical en 1,1",Material.CA�O_VERTICAL, miPlomero2.nuevaPared[1][1] );
		Assert.assertEquals("probando Abajo derecha en 1,0",Material.CA�O_ABAJO_DERECHA, miPlomero2.nuevaPared[1][0] );
		Assert.assertEquals("probando Horizontal en 2,0",Material.CA�O_HORIZONTAL, miPlomero2.nuevaPared[2][0] );
		Assert.assertEquals("probando Horizontal en 3,0",Material.CA�O_HORIZONTAL, miPlomero2.nuevaPared[3][0] );

	}
	@Test
	public void probandoPrimerCa�oAlMismoNivelQueElSegundo(){
		MarioBros miPlomero3 = new MarioBros();
		Material[][] miPared = paredConPrimerCa�oAIgualNivelQueElSegundo(5, 4);
		miPlomero3.construirCa�eria(miPared);
		Assert.assertEquals("fila del primer ca�o",3, miPlomero3.filaDelPrimerCa�o);
		Assert.assertEquals("columna del primer ca�o",0, miPlomero3.columnaDelPrimerCa�o);
		Assert.assertEquals("fila del segundo ca�o",3, miPlomero3.filaDelSegundoCa�o);
		Assert.assertEquals("columna del segundo ca�o",4, miPlomero3.columnaSegundoCa�o);
		
		Assert.assertEquals("probando Horizontal en 1,3",Material.CA�O_HORIZONTAL, miPlomero3.nuevaPared[1][3] );
		Assert.assertEquals("probando Horizontal en 2,3",Material.CA�O_HORIZONTAL, miPlomero3.nuevaPared[2][3] );
		Assert.assertEquals("probando Horizontal en 3,3",Material.CA�O_HORIZONTAL, miPlomero3.nuevaPared[3][3] );
		Assert.assertEquals("probando Horizontal en 4,3",Material.CA�O_HORIZONTAL, miPlomero3.nuevaPared[4][3] );

	}
	@Test
	public void probandoAlgoritmoConCa�oHorizontalEnElMedio(){
		MarioBros miPlomero4 = new MarioBros();
		Material[][] miPared = probandoWhileCAMBIARRRRRR(7, 4);
		miPlomero4.construirCa�eria(miPared);
		
		Assert.assertEquals("probando Arriba izc en 1,3",Material.CA�O_ARRIBA_IZQUIERDA, miPlomero4.nuevaPared[1][3] );
		Assert.assertEquals("probando Vertical en 1,2",Material.CA�O_VERTICAL, miPlomero4.nuevaPared[1][2] );
		Assert.assertEquals("probando Abajo derecha en 1,1",Material.CA�O_ABAJO_DERECHA, miPlomero4.nuevaPared[1][1] );
		Assert.assertEquals("probando Horizontal en 2,1",Material.CA�O_HORIZONTAL, miPlomero4.nuevaPared[2][1] );
		Assert.assertEquals("probando Arriba izquierda en 3,1",Material.CA�O_ARRIBA_IZQUIERDA, miPlomero4.nuevaPared[3][1] );
		Assert.assertEquals("probando Abajo derecha en 3,0",Material.CA�O_ABAJO_DERECHA, miPlomero4.nuevaPared[3][0] );
		Assert.assertEquals("probando Horizontal en 4,0",Material.CA�O_HORIZONTAL, miPlomero4.nuevaPared[4][0] );
		Assert.assertEquals("probando Horizontal en 5,0",Material.CA�O_HORIZONTAL, miPlomero4.nuevaPared[5][0] );
		Assert.assertEquals("probando Horizontal en 6,0",Material.CA�O_HORIZONTAL, miPlomero4.nuevaPared[6][0] );
		
	}
	/**
	 * 
	 * @param ancho: filas
	 * @param largo: columnas
	 * @return
	 * Crea una pared con Un ca�o_horizontal arriba a la izc y abajo a la derecha.
	 */
	private Material[][] paredConPrimerCa�oArribaDelSegundo(int ancho, int alto) {
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
	/**
	 * 
	 * @param ancho
	 * @param alto
	 * @return
	 * Crea una pared con ca�o_horizontal en la primera columna y ultima fila,
	 * 							   y otro en la ultima columna y ultima fila
	 */
	private Material[][] paredConPrimerCa�oAIgualNivelQueElSegundo(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][miPared[0].length - 1] = Material.CA�O_HORIZONTAL;
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
	/**
	 * 
	 * @param ancho
	 * @param alto
	 * @return
	 * crea una pared con ca�o_horizontal en la primera columna ultima fila y otro en la ultima columna primera fila;
	 */
	private Material[][] paredConPrimerCa�oAbajoDelSegundo(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][miPared[0].length - 1] = Material.CA�O_HORIZONTAL;
		miPared[miPared.length-1][0] = Material.CA�O_HORIZONTAL;
		for (int i = 0; i < miPared.length; i++){
			for (int j = 0; j < miPared[i].length; j++){
				if (miPared[i][j] != Material.CA�O_HORIZONTAL){
					miPared[i][j] = Material.LADRILLO;
				}
			}
		}
		return miPared;
	}
	private Material[][] probandoWhileCAMBIARRRRRR(int ancho, int alto) {
		Material[][] miPared = new Material[ancho][alto];
		miPared[0][miPared[0].length - 1] = Material.CA�O_HORIZONTAL;
		miPared[miPared.length-1][0] = Material.CA�O_HORIZONTAL;
		miPared[2][1] = Material.CA�O_HORIZONTAL;
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
