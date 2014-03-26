package com.nes.bolu;

public class BoludecesUno {

	public static void main(String[] args) {
		/*
		 * String t = "pepe"; String g = new String("pepe");
		 * System.out.println(t == g);
		 */

		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
