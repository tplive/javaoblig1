package no.norduni.oblig1;

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