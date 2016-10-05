package no.norduni.oblig1;

class Flight {
	// Private variabler
	private String flightNo;
	private String fraFlyplass;
	private String tilFlyplass;
	private String startTid;
	private int reiseTid;
	private int antallSeter;

	// Constructor
	public Flight(String flightNo, String fraFlyplass, String tilFlyplass, String startTid, int reiseTid,
			int antallSeter) {
		this.flightNo = flightNo;
		this.fraFlyplass = fraFlyplass;
		this.tilFlyplass = tilFlyplass;
		this.startTid = startTid;
		this.reiseTid = reiseTid;
		this.antallSeter = antallSeter;
	}
	
	public void getFlightInfo() {
		System.out.printf("Avreise: %s Flight %s: %s - %s ", this.startTid, this.flightNo, this.fraFlyplass, this.tilFlyplass);
	}
	
	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFraFlyplass() {
		return fraFlyplass;
	}

	public void setFraFlyplass(String fraFlyplass) {
		// Vil bare ha flyplasskoder med tre bokstaver i UPPERCASE
		this.fraFlyplass = fraFlyplass.substring(0, 3).toUpperCase();
	}

	public String getTilFlyplass() {
		return tilFlyplass;
	}

	public void setTilFlyplass(String tilFlyplass) {
		// Vil bare ha flyplasskoder med tre bokstaver i UPPERCASE
		this.tilFlyplass = tilFlyplass.substring(0, 3).toUpperCase();
	}

	public String getStartTid() {
		return startTid;
	}

	public void setStartTid(String startTid) {
		this.startTid = startTid;
	}

	public int getReiseTid() {
		return reiseTid;
	}

	public void setReiseTid(int reiseTidMinutter) {
		this.reiseTid = reiseTidMinutter;
	}

	public int getAntallSeter() {
		return antallSeter;
	}

	public void setAntallSeter(int antallSeter) {
		this.antallSeter = antallSeter;
	}

}