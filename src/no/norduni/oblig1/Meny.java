package no.norduni.oblig1;

class Meny {
	private static String AppNavn = "-------- Flight Booking -------";
	private static String footer = "--- Booking system (c) 2016 ---";

	public static void visMeny(int niveau) {
		// Constructor som viser menyene p�åførste nivå
		switch (niveau) {
		case 0:
			System.out.println(AppNavn);
			System.out.println("------ Toppmeny ------");
			System.out.println("1. Vis informasjon");
			System.out.println("2. Legg inn ny informasjon");
			System.out.println("3. Avslutt menyen");

			System.out.println(footer);
			break;
		case 1:
			System.out.println(AppNavn);
			System.out.println("------ Vis Informasjon ------");
			System.out.println("1. Vis flighter");
			System.out.println("2. Vis reisende med betalinger");
			System.out.println("3. Vis grupper");
			System.out.println("4. Avslutt menyen");

			System.out.println(footer);
			break;
		case 2:
			System.out.println(AppNavn);
			System.out.println("------ Legg inn ny informasjon ------");
			System.out.println("1. Legg inn ny flight");
			System.out.println("2. Legg inn ny reisende");
			System.out.println("3. Legg inn ny gruppe");
			System.out.println("4. Legg inn ny betaling");
			System.out.println("5. Avslutt menyen");

			System.out.println(footer);
			break;
		}
	}
}