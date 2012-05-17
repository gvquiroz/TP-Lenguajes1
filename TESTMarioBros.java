package Tp1brench1;

import junit.framework.Assert;

import org.junit.Test;


public class TESTMarioBros {

		

	public Material[][] nuevaPared;

	@Test
	public void comprobarAnchoDePared(){
		MarioBros miPlomero = new MarioBros();
		miPlomero.iniciarPared(10, 20,5,5);
		
	//	Assert.assertEquals("se espera que el ancho sea de",10,this.nuevaPared.length);
	}



	@Test
	public void comprobarAltoDePared(){
		MarioBros miPlomero = new MarioBros();
		miPlomero.iniciarPared(10, 20,5,5);
		
		// Assert.assertEquals("se espera que el alto sea de",20,this.nuevaPared.length);
	}
		
	@Test (expected=Error.class)
	public void paredDeTama�oNegativa(){
		MarioBros miPlomero = new MarioBros();
		miPlomero.iniciarPared(-10, -20,-6,5);
		
	}
	
	@Test
	public void verElMaterialInicialDeLaNuevaPared(){
		MarioBros miPlomero = new MarioBros();
		miPlomero.iniciarPared(10, 20,6,8);
		
		Assert.assertEquals("el material es",Material.LADRILLO,miPlomero.verificarMaterial(5,5));
		
	}
	
	@Test    (expected=Error.class)
	public void crearDosCa�osHorizontalesContiguos(){
		MarioBros miPlomero = new MarioBros();
		miPlomero.iniciarPared(10, 20,6,7);
		
		miPlomero.agregarCa�oHorizontalAlaPared(5, 7);
		miPlomero.agregarCa�oHorizontalAlaPared(6, 10);
	}
	
	@Test
	public void verificarCa�osHorizontalesIniciales(){
		MarioBros miPlomero = new MarioBros();
		miPlomero.iniciarPared(10, 20,6,8);
		
		Assert.assertEquals("el material es",Material.LADRILLO,miPlomero.verificarMaterial(5,5));
	Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(1,6));
	Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(10,8));
	}
	
	@Test	
	public void agregarCa�osHorizontalesYverificarlos(){
		MarioBros miPlomero = new MarioBros();
		miPlomero.iniciarPared(15, 30,4,25);
		
		miPlomero.agregarCa�oHorizontalAlaPared(3, 8);
		miPlomero.agregarCa�oHorizontalAlaPared(5, 30);
		miPlomero.agregarCa�oHorizontalAlaPared(7, 1);
		miPlomero.agregarCa�oHorizontalAlaPared(11, 2);
		miPlomero.agregarCa�oHorizontalAlaPared(13, 25);
		
		Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(3,8));
	Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(5,30));
	Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(7,1));
	Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(11,2));
	Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(13,25));
	Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(1,4));
	Assert.assertEquals("el material es",Material.CA�O_HORIZONTAL,miPlomero.verificarMaterial(15,25));
	}
	
	@Test
	public void construirCa�eriaYverificarla(){
		MarioBros miPlomero = new MarioBros();
		miPlomero.iniciarPared(15, 30,4,25);
		
		miPlomero.agregarCa�oHorizontalAlaPared(3, 8);
		miPlomero.agregarCa�oHorizontalAlaPared(5, 30);
		miPlomero.agregarCa�oHorizontalAlaPared(7, 1);
		miPlomero.agregarCa�oHorizontalAlaPared(11, 2);
		miPlomero.agregarCa�oHorizontalAlaPared(13, 25);
		
		miPlomero.construirCa�eria(miPlomero.nuevaPared);
		imprimirMatrizEnConsola(miPlomero.nuevaPared);
	}
	
	/**
	 * Imprime la matriz dada en la consola
	 * 00 Es Material.LADRILLO
	 * CH Es Material.Ca�o.Horizontal
	 * CV Es Material.Ca�o.Vertical
	 * DR Es Material.Ca�o.Abajo.Derecha
	 * DL Es Material.Ca�o.Abajo.Izquierda
	 * UR Es Material.Ca�o.Arriba.Derecha
	 * UL Es Material.Ca�o.Arriba.Izquierda
	 * @param paredAImprimir
	 */
	
	private void imprimirMatrizEnConsola(Material[][] paredAImprimir) {
		System.out.println("");
	for(int j =0;j < paredAImprimir[0].length;j++){
		for(int i=0;i < paredAImprimir.length;i++){
			if (paredAImprimir[i][j] == Material.LADRILLO){
				System.out.print("00"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CA�O_HORIZONTAL){
				System.out.print("CH"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CA�O_VERTICAL){
				System.out.print("CV"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CA�O_ABAJO_DERECHA){
				System.out.print("DR"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CA�O_ABAJO_IZQUIERDA){
				System.out.print("DL"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CA�O_ARRIBA_DERECHA){
				System.out.print("UR"+ "\t");
			} else if (paredAImprimir[i][j]== Material.CA�O_ARRIBA_IZQUIERDA){
				System.out.print("UL"+ "\t");
				}
			}
		System.out.println();
		}
	}	
}
