package Tp1brench1;

import junit.framework.Assert;

import org.junit.Test;


public class TESTError404 {

	@Test
	public void comprobarAnchoDePared(){
		iniciarPared(10, 20,5,5);
	Assert.assertEquals("se espera que el ancho sea de",10,nuevaPared.length);
	} 

	@Test
	public void comprobarAltoDePared(){
		iniciarPared(10, 20,5,5);
		Assert.assertEquals("se espera que el alto sea de",10,nuevaPared.length);
	}
		
	@Test
	public void verElMaterialInicialDeLaNuevaPared(){
		iniciarPared(10, 20,6,8);
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,5));		
	}
	

	@Test
	public void verificarCañosHorizontalesIniciales(){
		iniciarPared(10, 20,6,8);
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,5));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(1,6));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(10,8));
	}
	
	@Test	
	public void agregarCañosHorizontalesYverificarlos(){
		iniciarPared(15, 30,4,25);
		agregarCañoHorizontalAlaPared(3, 8);
		agregarCañoHorizontalAlaPared(5, 30);
		agregarCañoHorizontalAlaPared(7, 1);
		agregarCañoHorizontalAlaPared(11, 2);
		agregarCañoHorizontalAlaPared(13, 25);
		
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(3,8));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(5,30));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(7,1));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(11,2));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(13,25));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(1,4));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(15,25));
		}
	
	@Test (expected = Error.class)
	public void construirCañeriaConParedInvalida(){
		iniciarPared(1, 1,1,1);
		Error404 miPlomero = new Error404();
		miPlomero.construirCañeria(nuevaPared);
	}
	
	@Test
	public void construirCañeriaYverificarla(){
		Error404 miPlomero = new Error404();
		iniciarPared(15, 30,4,25);
		
		agregarCañoHorizontalAlaPared(3, 8);
		agregarCañoHorizontalAlaPared(5, 30);
		agregarCañoHorizontalAlaPared(7, 1);
		agregarCañoHorizontalAlaPared(11, 2);
		agregarCañoHorizontalAlaPared(13, 25);
		
		miPlomero.construirCañeria(nuevaPared);
		imprimirMatrizEnConsola(nuevaPared);

		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,3));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(1,4));
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(1,30));
				
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,3));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(2,5));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(2,6));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(2,7));
		Assert.assertEquals("el material es",Material.CAÑO_ARRIBA_DERECHA,verificarMaterial(2,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(2,30));
		
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,7));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(3,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(3,30));
				
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(4,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(4,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(4,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(4,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(4,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(4,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(4,7));
		Assert.assertEquals("el material es",Material.CAÑO_ABAJO_IZQUIERDA,verificarMaterial(4,8));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,9));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,10));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,11));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,12));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,13));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,14));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,15));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,16));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,17));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,18));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,19));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,20));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,21));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,22));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,23));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,24));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,25));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,26));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,27));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,28));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(4,29));
		Assert.assertEquals("el material es",Material.CAÑO_ARRIBA_DERECHA,verificarMaterial(4,30));
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(5,29));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(5,30));
		
		
		Assert.assertEquals("el material es",Material.CAÑO_ABAJO_DERECHA,verificarMaterial(6,1));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,2));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,3));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,4));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,5));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,6));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,7));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,8));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,9));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,10));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,11));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,12));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,13));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,14));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,15));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,16));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,17));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,18));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,19));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,20));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,21));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,22));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,23));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,24));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,25));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,26));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,27));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,28));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(6,29));
		Assert.assertEquals("el material es",Material.CAÑO_ARRIBA_IZQUIERDA,verificarMaterial(6,30));
		
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(7,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(7,30));
		
		
		
		Assert.assertEquals("el material es",Material.CAÑO_ABAJO_IZQUIERDA,verificarMaterial(8,1));
		Assert.assertEquals("el material es",Material.CAÑO_ARRIBA_DERECHA,verificarMaterial(8,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(8,30));
		
		
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,1));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(9,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(9,30));
				
		
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,1));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(10,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(10,30));
				
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,1));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(11,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,24));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(11,30));
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(12,1));
		Assert.assertEquals("el material es",Material.CAÑO_ABAJO_IZQUIERDA,verificarMaterial(12,2));	
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,4));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,5));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,6));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,7));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,8));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,9));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,10));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,11));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,12));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,13));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,14));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,15));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,16));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,17));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,18));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,19));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,20));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,21));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,22));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,23));
		Assert.assertEquals("el material es",Material.CAÑO_VERTICAL,verificarMaterial(12,24));
		Assert.assertEquals("el material es",Material.CAÑO_ARRIBA_DERECHA,verificarMaterial(12,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(12,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(12,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(12,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(12,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(12,30));
		
		
		
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,24));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(13,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(13,30));
		
		
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,24));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(14,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(14,30));
		
		
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,1));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,2));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,3));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,4));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,5));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,6));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,7));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,8));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,9));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,10));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,11));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,12));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,13));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,14));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,15));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,16));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,17));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,18));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,19));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,20));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,21));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,22));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,23));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,24));
		Assert.assertEquals("el material es",Material.CAÑO_HORIZONTAL,verificarMaterial(15,25));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,26));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,27));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,28));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,29));
		Assert.assertEquals("el material es",Material.LADRILLO,verificarMaterial(15,30));
		
		
			}
	
	/**
	 * Imprime la matriz dada en la consola
	 * 00 Es Material.LADRILLO
	 * CH Es Material.Caño.Horizontal
	 * CV Es Material.Caño.Vertical
	 * DR Es Material.Caño.Abajo.Derecha
	 * DL Es Material.Caño.Abajo.Izquierda
	 * UR Es Material.Caño.Arriba.Derecha
	 * UL Es Material.Caño.Arriba.Izquierda
	 * @param paredAImprimir
	 */
	
	private void imprimirMatrizEnConsola(Material[][] paredAImprimir) {
		System.out.println("");
	for(int j =0;j < paredAImprimir[0].length;j++){
		for(int i=0;i < paredAImprimir.length;i++){
			if (paredAImprimir[i][j] == Material.LADRILLO){
				System.out.print("00"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CAÑO_HORIZONTAL){
				System.out.print("CH"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CAÑO_VERTICAL){
				System.out.print("CV"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CAÑO_ABAJO_DERECHA){
				System.out.print("DR"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CAÑO_ABAJO_IZQUIERDA){
				System.out.print("DL"+ "\t");
			} else if (paredAImprimir[i][j] == Material.CAÑO_ARRIBA_DERECHA){
				System.out.print("UR"+ "\t");
			} else if (paredAImprimir[i][j]== Material.CAÑO_ARRIBA_IZQUIERDA){
				System.out.print("UL"+ "\t");
				}
			}
		System.out.println();
		}
	}	

	private int ancho;
	private int alto;
	private boolean verificadorDePosicionDeAncho[];
	private Material[][] nuevaPared;
	
	/**
	 * pre: La pared debe tener como mínimo de tres espacios de ancho y uno de alto.
	 * post: Inicia la pared con un tamaño de ancho, un tamaño de alto, y un caño horizontal ubicado en la 
	 * primer columna y un caño horizontal en la columna final.
	 * @param anchoPared Se ingresa el valor de ancho que se le quiere dar a la pared.
	 * @param altoPared  Se ingresa el valor de alto que se le quiere dar a la pared.
	 * @param alturaCañoHorizontalInicial Es la posición de alto en la que se va a ingresar el caño horizontal inicial.
	 * @param alturaCañoHorizontalFinal Es la posición de alto en la que se va a ingresar el caño horizontal final.
	 */
	 
	 private void iniciarPared(int anchoPared, int altoPared,int alturaCañoHorizontalInicial,int alturaCañoHorizontalFinal){

		if (anchoPared<3||altoPared<1){
			Error errorDeTamañoDeLaPared= new Error("La pared debe tener al menos tres espacios de ancho y uno de alto");
			throw errorDeTamañoDeLaPared;
		}
		this.ancho=anchoPared;
		this.alto=altoPared;
		
		this.nuevaPared= new Material[ancho][alto];
		
		
		
		for (int anchoDeLaPared=0; anchoDeLaPared<this.nuevaPared.length; anchoDeLaPared++){
			for(int altoDeLaPared=0; altoDeLaPared<this.nuevaPared[anchoDeLaPared].length;altoDeLaPared++){
				nuevaPared[anchoDeLaPared][altoDeLaPared]=Material.LADRILLO;
				
			}
		}
	this.verificadorDePosicionDeAncho= new boolean[this.nuevaPared.length];
		for (int posicion=0; posicion<this.nuevaPared.length; posicion++){
			this.verificadorDePosicionDeAncho[posicion]= true;
		}
		
		
		
		
		agregarCañoHorizontalInicial(1,alturaCañoHorizontalInicial);
		agregarCañoHorizontalFinal(this.nuevaPared.length,alturaCañoHorizontalFinal);
	}
	
	 /**
	  * pre: Existe una pared.
	  * post: Es el método que utiliza "iniciarPared" para poner el caño horizontal inicial.
	  * @param posicionAncho Es la posición de ancho donde se pone el primer caño.
	  * @param posicionAlto Es la posición de alto donde se pone el primer caño.
	  */
	private void agregarCañoHorizontalInicial(int posicionAncho, int posicionAlto){
		if(posicionAlto<1||posicionAlto>(this.nuevaPared[(posicionAncho)-1].length)+1||posicionAncho<1){
			Error errorDePosicion= new Error("No se puede poner un caño horizontal en esa posición");
			throw errorDePosicion;
		}
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CAÑO_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[posicionAncho]= false;
		
	}
	
	/**
	 * pre: Existe una pared.
	 * post: Es el método que utiliza "iniciarPared" para poner el caño horizontal final.
	 * @param posicionAncho Es la posición de ancho donde se pone el caño final.
	 * @param posicionAlto Es la posición de alto donde se pone el caño final.
	 */
	private void agregarCañoHorizontalFinal(int posicionAncho, int posicionAlto){
		if(posicionAlto<1||posicionAlto>(this.nuevaPared[(posicionAncho)-1].length)+1||posicionAncho<1){
			Error errorDePosicion= new Error("No se puede poner un caño horizontal en esa posición");
			throw errorDePosicion;
		}
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CAÑO_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[(posicionAncho)-2]= false;
		
	}
	
	/**
	 * pre: Existe una pared.
	 * post: Se pone un caño horizontal en la posición indicada.
	 * @param posicionAncho Es la posición de ancho donde es pone el caño horizontal.
	 * @param posicionAlto Es la posición de alto donde es pone el caño horizontal.
	 */
		private void agregarCañoHorizontalAlaPared(int posicionAncho, int posicionAlto){
		
		if(posicionAncho>this.ancho||posicionAlto>this.alto||posicionAncho<1||posicionAlto<1){
			Error posicionInexistente = new Error("No se puede colocar el caño fuera de la pared");
			throw posicionInexistente;
		}
		
		if(this.verificadorDePosicionDeAncho[(posicionAncho)-1]==false){
			Error errorDePosicion= new Error("No se puede poner un caño horizontal en esa posición");
			throw errorDePosicion;
		}
		
		this.nuevaPared[(posicionAncho)-1][(posicionAlto)-1]= Material.CAÑO_HORIZONTAL;
		this.verificadorDePosicionDeAncho[(posicionAncho)-1]= false;
		this.verificadorDePosicionDeAncho[posicionAncho]= false;
		this.verificadorDePosicionDeAncho[(posicionAncho)-2]= false;
		
		}
	
	/**
	 * pre: Existe una pared.
	 * post: Devuelve el material que hay en la posición indicada.
	 * @param posicionAncho Es la posición de ancho que se quiere verificar.
	 * @param posicionAlto Es la posición de alto que se quiere verificar.
	 * @return Devuelve el material que hay en la posición indicada.
	 */
	private Material verificarMaterial(int posicionAncho, int posicionAlto) {
		return nuevaPared[posicionAncho-1][posicionAlto-1];
		
	}

}

