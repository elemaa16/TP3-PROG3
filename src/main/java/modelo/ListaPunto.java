package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaPunto {
	
	
		private static final int limitArray = 100;

		public static List<Punto> getListaPuntos() {
			Random random = new Random();

			double[] listaX = random.doubles(limitArray, -10, 10).toArray();
			double[] listaY = random.doubles(limitArray, -20, 20).toArray();

			List<Punto> listaPuntos = new ArrayList<Punto>();
			for (int i = 0; i < limitArray; i++) {
				listaPuntos.add(new Punto(listaX[i], listaY[i]));
			}
			return listaPuntos;

		}

}
