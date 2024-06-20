import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import math.Fx;
import modelo.Punto;
import modelo.ListaPunto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Punto> listaDeNumeros = ListaPunto.getListaPuntos();
		//acordarme que modifique la cantidad de puntos en la ListaPunto, tiene que ser 100 en vez de 10.
		SolucionPuntoA(listaDeNumeros);
		SolucionPuntoB(listaDeNumeros);
		SolucionPuntoC(listaDeNumeros);
		SolucionPuntoE(listaDeNumeros);
		SolucionPuntoG(listaDeNumeros);
		SolucionPuntoH(listaDeNumeros);
		SolucionPuntoJ(listaDeNumeros);
		
		
		
	}
	
	
	private static String graficarLista(List<Punto> listaPuntos) {    
	    String listaGraficable= "{" + listaPuntos.stream()
	        .map(punto -> punto.toString())
	        .collect(Collectors.joining(",")) + "}";
	    return listaGraficable;
	  }
	
	private static void SolucionPuntoA(List<Punto> lista)
	{
		System.out.println("--- Lista ejercicio A ---\n");
		List<Punto> listaA = lista
		        .stream()
		        .filter(punto -> (punto.getY() < 15) && (punto.getY() > -15))
		        .sorted()
		        .collect(Collectors.toList());
		    System.out.println(graficarLista(listaA));
		    System.out.println("--- < -------------- > ---\n");
	}
	private static void SolucionPuntoB(List<Punto> lista) {
	    System.out.println("--- Lista ejercicio B ---\n");
	    
	    List<Punto> listaB = lista
	        .stream()        
	        .map(punto -> new Punto(punto.getX(), Fx.fx(punto.getX())))
	        .collect(Collectors.toList());
	    System.out.println(graficarLista(listaB));
	    System.out.println("--- < -------------- > ---\n");
	  }
	private static void SolucionPuntoC(List<Punto> lista ){
	    System.out.println("--- Lista ejercicio C ---\n");
	    List<Punto> listaC = lista
	        .stream()
	        .filter(p -> (Fx.fx(p.getX()) - p.getY()) > 0)
	        .filter(p -> (Fx.fx(p.getX()) - p.getY()) < 10)
	        .collect(Collectors.toList());
	    System.out.println(graficarLista(listaC));
	    System.out.println("--- < -------------- > ---\n");
	  }
	private static void SolucionPuntoE(List<Punto> lista) {
		System.out.println("--- Lista ejercicio E ---\n");
		List<Punto> listaE = lista;
		//primero calcule el centroide de X y despues el centroide de Y. Esta parte se que esta bien
		double centroideX = listaE.stream().mapToDouble(Punto::getX).sum() / listaE.size();
		double centroideY = listaE.stream().mapToDouble(Punto::getY).sum() / listaE.size();
		//aca filtro los puntos que esten a 5 unidades del centroide con la formula del profesor. Tengo dudas si esta bien
		listaE.stream().filter(p->Math.sqrt(Math.pow(centroideX-p.getX(),2)+Math.pow(centroideY-p.getY(),2))<=5.0)
		.collect(Collectors.toList());	
		
		//muestro los centroides, esto se puede eliminar si queremos.
		System.out.println("Centroide: X"+String.format("%.1f ",centroideX)+" , Y"+String.format("%.1f ",centroideY));		
		System.out.println(graficarLista(listaE));
	    System.out.println("--- < -------------- > ---\n");
	}
	private static void SolucionPuntoG(List<Punto> lista ){
	    System.out.println("--- Lista ejercicio G ---\n");
	    List<Punto> listaG = lista
	    		.stream().filter(p->(p.getY()-Fx.fx(p.getX()))>=0&&(p.getY()-Fx.fx(p.getX()))<3)
	    		.collect(Collectors.toList());
	      //filtre por la diferencia entre el punto Y y la funcion Fx, que sea mayor o igual a 0 y menor a 3.  
	    		
	    System.out.println(graficarLista(listaG));
	    System.out.println("--- < -------------- > ---\n");
	  }
	private static void SolucionPuntoH(List<Punto> lista ){
	    System.out.println("--- Lista ejercicio H ---\n");
	    List<Punto> listaH = lista
	    		.stream().filter(p->(p.getX()>=0)&&((p.getY()>=0)&&p.getY()<=Fx.fx(p.getX())))	
	    		.collect(Collectors.toList());
	        //a x >= 0; 0 <= y <= F(x)
	    System.out.println(graficarLista(listaH));
	    System.out.println("--- < -------------- > ---\n");
	  }
	private static void SolucionPuntoJ(List<Punto> lista ){
	    System.out.println("--- Lista ejercicio J ---\n");
	    List<Punto> listaJ = lista
	    		.stream().filter(p->((p.getX()>=-4)&&(p.getX()<=4)&&(p.getY()>Fx.fx(p.getX()))))
	    		.collect(Collectors.toList());
	    		
	       //; -4 <= x <=4; Py > F(x) 
	    System.out.println(graficarLista(listaJ));
	    System.out.println("--- < -------------- > ---\n");
	  }

}
