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
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	// Lag en ArrayList som tar Flight objekter
	public static ArrayList<Flight> flights = new ArrayList<>();
	
	// Lag en ArrayList som tar Reisende objekter
	public static ArrayList<Reisende> passasjerListe = new ArrayList<>();
	// Lag en ArrayList som tar Grupper som objekter
	public static ArrayList<Gruppe> grupper = new ArrayList<>();
	// Lag en ArrayList som tar Betalinger som objekter
	public static ArrayList<Betalinger> betalinger = new ArrayList<>();

	
	
	
	
	public static void main(String[] args) {

	
		
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
			// Sjekk om bruker har tastet inn et tall
			try {
				valg = input.nextInt();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Du må taste inn en tallverdi fra menyen!");
				// Fjern linjeskift som ligger igjen i inputstream
				input.nextLine();
			}
			

			
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
				Flight nyFlight = PutIn.nyFlight();
				if (nyFlight != null)
				flights.add(nyFlight);
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
