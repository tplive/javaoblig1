package no.norduni.oblig1;

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