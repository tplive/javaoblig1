package no.norduni.oblig1;

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