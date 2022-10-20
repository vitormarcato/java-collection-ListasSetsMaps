package br.com.alura.arrayslist;

import java.util.Set;
import java.util.TreeSet;

public class TestaRecibo {

	public static void main(String[] args) {

		Set<Recibo> recibos = new TreeSet<>();

		Recibo rec1 = new Recibo(0001, "distribuidora", 220.00);
		Recibo rec2 = new Recibo(0002, "ltda", 120.00);
		Recibo rec3 = new Recibo(0003, "Anonima", 2500.00);

		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);

		recibos.forEach(recibo -> {
		    System.out.println(recibo);
		});
	}

}
