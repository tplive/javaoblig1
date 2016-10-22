package no.norduni.oblig1;

import java.util.Scanner;

class PutIn {
	public static Flight finnFlightNo(String flightNo) {
		for(Flight flighten : Application.flights) {
			if(flightNo.equals(flighten.getFlightNo())) {
				return flighten;
			}
				
		} 
		return null;
	}
	public static Flight nyFlight() {

		Scanner flightInput = new Scanner(System.in);
		String flightNo;
		String fraFlyplass;
		String tilFlyplass;
		String startTid;
		int reiseTid;
		int antallSeter;

		System.out.print("Tast inn Flightnummer: ");
		flightNo = flightInput.nextLine();
		if (finnFlightNo(flightNo) != null) {
			System.out.println("Flighten finnes fra før! ");
			return null;
		}
		
		System.out.print("Tast inn Fra flyplass: ");
		fraFlyplass = flightInput.nextLine();
		System.out.print("Tast inn Til flyplass: ");
		tilFlyplass = flightInput.nextLine();
		System.out.print("Tast inn Starttid (DD/MM/ÅÅÅÅ): ");
		startTid = flightInput.nextLine();
		System.out.print("Tast inn reisetid i minutter: ");
		reiseTid = flightInput.nextInt();
		System.out.print("Tast inn antall seter: ");
		antallSeter = flightInput.nextInt();
		
		return new Flight(flightNo, fraFlyplass, tilFlyplass, startTid, reiseTid, antallSeter);

	}

	public static Reisende nyReisende() {

		Scanner reisendeInput = new Scanner(System.in);
		String navn;
		String kjønn;
		int alder;
		int passNo;
		int gruppeKode;

		System.out.print("Tast inn navn: ");
		navn = reisendeInput.nextLine();
		System.out.print("Tast inn kjønn (M / K): ");
		kjønn = reisendeInput.nextLine();
		System.out.print("Tast inn alder: ");
		alder = reisendeInput.nextInt();
		System.out.print("Tast inn passnummer XXXXXXXXX: ");
		passNo = reisendeInput.nextInt();
		System.out.print("Tast inn gruppekode: ");
		gruppeKode = reisendeInput.nextInt();
		

		return new Reisende(navn, kjønn, alder, passNo, gruppeKode);

	}

	public static Gruppe nyGruppe() {

		Scanner gruppeInput = new Scanner(System.in);

		int gruppeKode;
		String flightNo;

		System.out.println("Tast inn gruppekode (heltall): ");
		gruppeKode = gruppeInput.nextInt();
		System.out.println("Tast inn flightnummer: ");
		flightNo = gruppeInput.nextLine();
	

		return new Gruppe(gruppeKode, flightNo);
	}

	public static Betalinger nyBetaling() {
		
		Scanner betalingInput = new Scanner(System.in);

		
		System.out.println("Tast inn passnummer: ");
		int passNo = betalingInput.nextInt();
		System.out.println("Tast inn betalingsmåte, 0 = kontant 1 = kredittkort: ");
		int betalingsMåte = betalingInput.nextInt();
		System.out.println("Tast inn beløp: ");
		double sum = betalingInput.nextDouble();
		
		
		return new Betalinger(passNo, betalingsMåte, sum);
	
	
	}
}