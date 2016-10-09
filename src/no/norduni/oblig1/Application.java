package no.norduni.oblig1;

/*
 * Oppgaven er gjort i gruppe. Gruppen har bestått av Eline Westerberg og Thomas Qvidahl.
 * Vi har par-programmert på samme PC, side om side, og over Teamviewer.
 * I tillegg har vil publisert prosjektet på GitHub, for å forenkle framtidig samarbeid.
 * https://github.com/tplive/javaoblig1
 * Oppgaven er løst ut i fra spesifikasjon, der hvor spesifikasjonen har vært utydelig
 * eller ufullstendig har vi forsøkt å lage løsningen ut i fra det som står i oppgaveteksten.
*/
import java.util.ArrayList;
import java.util.Scanner;

class Reisende {
	// Private variabler
	private String navn;
	private String kjønn;
	private int alder;
	private int passNo;
	private int gruppeKode;

	// Constructor metode
	public Reisende(String navn, String kjønn, int alder, int passNo, int gruppeKode) {
		this.navn = navn;
		this.kjønn = kjønn;
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

	public String getKjønn() {
		return kjønn;
	}

	public void setKjønn(String kjønn) {
		if (kjønn == "M" || kjønn == "K") {
			this.kjønn = kjønn;
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

	public Gruppe(int kode, String flightNo) {
		this.gruppeKode = kode;
		this.flightNo = flightNo;
	}

	public void getInfo() {
		System.out.printf("Gruppekode: %s :: Flight: %s", this.gruppeKode, this.flightNo);
		System.out.println();
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

class Betalinger {
	
public Betalinger(int passNr, int betalingsMåte, double sum) 	{
	this.personPassNo = passNr;
	this.betalingsMåte = betalingsMåte;
	this.sum = sum;
}
	
	public int getPersonPassNo() {
		return personPassNo;
	}

	public void setPersonPassNo(int personPassNo) {
		this.personPassNo = personPassNo;
	}

	public int getBetalingsMåte() {
		return betalingsMåte;
	}

	public void setBetalingsMåte(int betalingsMåte) {
		// Betalingsmåter er:
		// 0 = cash kontant
		// 1 = kredittkort
		// 2 = reservert for fremtidig bruk
		this.betalingsMåte = betalingsMåte;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	private int personPassNo;
	private int betalingsMåte;
	private double sum;
}

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

class PutIn {
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

public class Application {

	public static void main(String[] args) {

		// Lag en ArrayList som tar Flight objekter
		ArrayList<Flight> flights = new ArrayList<>();
		// Lag en ArrayList som tar Reisende objekter
		ArrayList<Reisende> passasjerListe = new ArrayList<>();
		// Lag en ArrayList som tar Grupper som objekter
		ArrayList<Gruppe> grupper = new ArrayList<>();
		// Lag en ArrayList som tar Betalinger som objekter
		ArrayList<Betalinger> betalinger = new ArrayList<>();
	
		
		// Lage litt testdata
		flights.add(new Flight("Sample flight 2", "OSL", "VRN", "13/09/2016", 235, 150));
		flights.add(new Flight("Sample flight 3", "bnN", "MQN", "12/09/2016", 45, 50));
		flights.add(new Flight("Sample flight 4", "ATH", "DUB", "14/09/2016", 335, 250));
		flights.add(new Flight("Sample flight 5", "mqn", "oslo", "17/09/2016", 85, 50));

		passasjerListe.add(new Reisende("Thomas Qvidahl", "M", 40, 12345678, 1));
		passasjerListe.add(new Reisende("Eline Westerberg", "K", 28, 12345679, 1));
		passasjerListe.add(new Reisende("Bob Kåre", "M", 25, 12345676, 2));
		passasjerListe.add(new Reisende("Jens Bens", "M", 89, 12451245, 2));

		grupper.add(new Gruppe(1, "Sample flight 2"));
		grupper.add(new Gruppe(2, "Sample flight 3"));
		grupper.add(new Gruppe(3, "Sample flight 4"));
		
		betalinger.add(new Betalinger(12345678, 1, 1501));
		betalinger.add(new Betalinger(12345679, 0, 2500));
		betalinger.add(new Betalinger(12345676, 0, 2500));
		betalinger.add(new Betalinger(12451245, 1, 1599));
		

		// Menysystemet
		int valg = 0;
		int meny = 0;
		Scanner input = new Scanner(System.in);

		// ONE loop, to rule them all
		while (meny >= 0) {

			// Vis aktiv meny; 0, 1, eller 2
			Meny.visMeny(meny);

			System.out.print("Tast inn ditt valg: ");
			valg = input.nextInt();
			
			// Hvis vi er inne i menyene 1 eller 2, skal valgene våre
			// valg + 10 eller 20
			if (meny == 1)
				valg = valg + 10;
			if (meny == 2)
				valg = valg + 20;

			switch (valg) {
			case 1: // Valg 1 er å gå til meny 1
				meny = valg;
				break;
			case 2: // Valg 2 er å gå til meny 2
				meny = valg;
				break;
			case 3: // Valg 3 er å avslutte programmet
				meny = -1; // Dette avslutter loopen
				break;
			case 11: // valg 1 på meny 1 er å vise flighter

				// Looper gjennom ArrayListen flights, og kaller metode for å få
				// ut flightinfo

				for (Flight flight : flights) {
					flight.getInfo();
					System.out.println();
				}
				break;
			case 12: // valg 2 på meny 1 er å vise reisende med betaling
				for (Reisende reisende : passasjerListe) {
					System.out.println(reisende.getNavn());
				for (Betalinger betalingen : betalinger) {
					if (betalingen.getPersonPassNo() == reisende.getPassNo()) {
						System.out.println("Betaling: " + betalingen.getSum());
					}
					
				}
					
		
				}
				break;
			case 13: // valg 3 på meny 1 er å vise grupper med reisende
				for (Gruppe gruppen : grupper) {
					gruppen.getInfo();
					for (Reisende passasjer : passasjerListe) {
						if (gruppen.getGruppeKode() == passasjer.getGruppeKode()) {
							System.out.printf("%s", passasjer.getNavn());
							System.out.println();
						}
					}
				}
				break;
			case 14: // valg 4 på meny 1 er å gå til hovedmeny
				meny = 0;
				break;
			case 21: // valg 1 på meny 2 er å legge til flight
				flights.add(PutIn.nyFlight());
				break;
			case 22: // valg 2 på meny 2 er å legge til reisende
				passasjerListe.add(PutIn.nyReisende());
				break;
			case 23: // valg 3 på meny 2 er å legge til gruppe
				grupper.add(PutIn.nyGruppe());
				break;
			case 24: // valg 4 på meny 2 er å legge inn betalinger
				betalinger.add(PutIn.nyBetaling());
				break;
			case 25: // valg 5 på meny 2 er å gå tilbake til hovedmeny
				meny = 0;
				break;
			default:
				System.out.println("Feil valg");// Alt annet returnerer
												// feilmelding
				break;
			}
		}
		//clean up
		input.close();
	}
}
