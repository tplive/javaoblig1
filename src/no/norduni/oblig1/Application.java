package no.norduni.oblig1;

import java.util.ArrayList;
import java.util.Scanner;

class Reisende {
	// Private variabler
	private String navn;
	private String kj�nn;
	private int alder;
	private int passNo;
	private int gruppeKode;

	// Constructor metode
	public Reisende(String navn, String kj�nn, int alder, int passNo, int gruppeKode) {
		this.navn = navn;
		this.kj�nn = kj�nn;
		this.alder = alder;
		this.passNo = passNo;
		this.gruppeKode = gruppeKode;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getKj�nn() {
		return kj�nn;
	}

	public void setKj�nn(String kj�nn) {
		if (kj�nn == "M" || kj�nn == "K") {
			this.kj�nn = kj�nn;
		}
	}

	public int getAlder() {
		return alder;
	}

	public void setAlder(int alder) {
		this.alder = alder;
	}

	public int getPassNo() {
		return passNo;
	}

	public void setPassNo(int passNo) {
		this.passNo = passNo;
	}

	public int getGruppeKode() {
		return gruppeKode;
	}

	public void setGruppeKode(int gruppeKode) {
		this.gruppeKode = gruppeKode;
	}

}

class Gruppe {
	
	private int gruppeKode;
	private String flightNo;
	
	public Gruppe(int kode, String flightNo){
		this.gruppeKode = kode;
	}
	
	public void getInfo() {
		System.out.printf("Gruppekode: %s :: Flight: %s", this.getGruppeKode(), this.getFlightNo());
	}
	
	public int getGruppeKode() {
		return gruppeKode;
	}

	public void setGruppeKode(int gruppeKode) {
		this.gruppeKode = gruppeKode;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

}

class Betaling {
	public int getPersonPassNo() {
		return personPassNo;
	}

	public void setPersonPassNo(int personPassNo) {
		this.personPassNo = personPassNo;
	}

	public int getBetalingsM�te() {
		return betalingsM�te;
	}

	public void setBetalingsM�te(int betalingsM�te) {
		this.betalingsM�te = betalingsM�te;
	}

	private int personPassNo;
	private int betalingsM�te;
}

class Meny {
	private static String navn = "-------- Flight Booking -------";
	private static String footer = "--- Booking system (c) 2016 ---";

	public static void visToppMeny() {
		System.out.println(navn);
		System.out.println("--Toppmeny--");
		System.out.println("1. Vis informasjon");
		System.out.println("2. Legg inn ny informasjon");
		System.out.println("3. Avslutt menyen");

		System.out.println(footer);

	}

	public static void visMeny1() {
		System.out.println(navn);
		System.out.println("--Vise info--");
		System.out.println("1. Vis flighter");
		System.out.println("2. Vis reisende med betalinger");
		System.out.println("3. Vis grupper");
		System.out.println("4. Avslutt menyen");

		System.out.println(footer);
	}

	public static void visMeny2() {
		System.out.println(navn);
		System.out.println("--Legg inn informasjon--");
		System.out.println("1. Legg inn ny flight");
		System.out.println("2. Legg inn ny reisende");
		System.out.println("3. Legg inn ny gruppe");
		System.out.println("4. Legg inn ny betaling");
		System.out.println("5. Avslutt menyen");

		System.out.println(footer);
	}

}

class PutIn {
	public static Flight nyFlight() {

		Scanner input = new Scanner(System.in);
		String flightNo;
		String fraFlyplass;
		String tilFlyplass;
		String startTid;
		int reiseTid;
		int antallSeter;

		System.out.print("Tast inn Flightnummer: ");
		flightNo = input.nextLine();
		System.out.print("Tast inn Fra flyplass: ");
		fraFlyplass = input.nextLine();
		System.out.print("Tast inn Til flyplass: ");
		tilFlyplass = input.nextLine();
		System.out.print("Tast inn Starttid (DD/MM/����): ");
		startTid = input.nextLine();
		System.out.print("Tast inn reisetid i minutter: ");
		reiseTid = input.nextInt();
		System.out.print("Tast inn antall seter: ");
		antallSeter = input.nextInt();
		//input.close();

		return new Flight(flightNo, fraFlyplass, tilFlyplass, startTid, reiseTid, antallSeter);

	}

	public static Reisende nyReisende() {

		Scanner input = new Scanner(System.in);
		String navn;
		String kj�nn;
		int alder;
		int passNo;
		int gruppeKode;

		System.out.print("Tast inn navn: ");
		navn = input.nextLine();
		System.out.print("Tast inn kj�nn (M / K): ");
		kj�nn = input.nextLine();
		System.out.print("Tast inn alder: ");
		alder = input.nextInt();
		System.out.print("Tast inn passnummer XXXXXXXXX: ");
		passNo = input.nextInt();
		System.out.print("Tast inn gruppekode: ");
		gruppeKode = input.nextInt();
		input.close();

		return new Reisende(navn, kj�nn, alder, passNo, gruppeKode);

	}

}

public class Application {

	public static void main(String[] args) {

		// Lag en ArrayList som tar Flight objekter
		ArrayList<Flight> flights = new ArrayList<>();
		// Lag en ArrayList som tar Reisende objekter
		ArrayList<Reisende> passasjerListe = new ArrayList<>();
		// Lag en ArrayList som tar Grupper som objekter
		ArrayList<Gruppe> grupper = new ArrayList<>();
		// Lag en ArrayList som tar Betalinger som objekter
		
		// Lage litt testdata
		flights.add(new Flight("Sample flight 2", "OSL", "VRN", "13/09/2016", 235, 150));
		flights.add(new Flight("Sample flight 3", "bnN", "MQN", "12/09/2016", 45, 50));
		flights.add(new Flight("Sample flight 4", "ATH", "DUB", "14/09/2016", 335, 250));
		flights.add(new Flight("Sample flight 5", "mqn", "oslo", "17/09/2016", 85, 50));
				
		passasjerListe.add(new Reisende("Thomas Qvidahl", "M", 40, 12345678, 1));
		passasjerListe.add(new Reisende("Eline Westerberg", "K", 28, 12345679, 1));
		passasjerListe.add(new Reisende("Bob K�re", "M", 25, 12345676, 2));
		
		grupper.add(new Gruppe(1, "Sample flight 2"));
		grupper.add(new Gruppe(2, "Sample flight 3"));
		grupper.add(new Gruppe(3, "Sample flight 4"));
		
		// Menysystemet
		int valg = 0;
		Scanner input = new Scanner(System.in);
		
		while (true) {
			Meny.visToppMeny();
			System.out.print("Tast inn ditt valg: ");
			valg = input.nextInt();

			switch (valg) {
			case 1: // Vis meny 1
				while (true) {
					Meny.visMeny1(); // Vis informasjon
					System.out.print("Tast inn ditt valg: ");
					valg = input.nextInt();
					switch (valg) {
					case 1:
						// Kalle metode for � vise flighter
						for (Flight flight : flights) {
							flight.getInfo();
							System.out.println();
						}
						break;
					case 2:
						// Kalle metode for � vise reisende med betaling
						for (Reisende reisende : passasjerListe){
							System.out.println(reisende.getNavn());
						}
						break;
					case 3:
						// Kalle metode for � vise grupper med reisende
						for (Gruppe gruppen : grupper){
							System.out.printf("Gruppe : %2 ", gruppen.getFlightNo());
							for (Reisende passasjer : passasjerListe) {
								if (gruppen.getGruppeKode() == passasjer.getGruppeKode()) {
									System.out.println(passasjer.getNavn());
								}
							}
						}
						break;
					case 4:
						// Avslutte menyen og g� tilbake til toppmeny
						break;
					default:
						System.out.println("Ugyldig valg");
					}
					break;
				}
			case 2: // Vis meny 2
				while (true) {
					Meny.visMeny2(); // Legg inn informasjon
					System.out.print("Tast inn ditt valg: ");
					valg = input.nextInt();
					switch (valg) {
					case 1:
						flights.add(PutIn.nyFlight());
						break;
					case 2:
						passasjerListe.add(PutIn.nyReisende());
						break;
					case 3:
						break;
					}
				}
				// break;
			case 3: // Avslutt menyen
				break;
			default:
				System.out.println("Ugyldig valg");
			}

		}
	}

}
