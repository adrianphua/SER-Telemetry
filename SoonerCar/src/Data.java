
public class Data {
	
	//Battery temperature
	private double temp;
	//Axel rotation, related to speed
	private double rpm;
	//TODO: from BMS, max charge?
	private double chargeCurrentLimit;
	//Current from battery
	private double amperage;
	//TODO: max current?
	private double dischargeCurrentLimit;
	//TODO: battery charge
	private double stateOfCharge;
	
	//constructor
	public Data(double temp, double rpm, double chargeCurrentLimit, double amperage, double dischargeCurrentLimit,
			double stateOfCharge) 
	{
		super();
		this.temp = temp;
		this.rpm = rpm;
		this.chargeCurrentLimit = chargeCurrentLimit;
		this.amperage = amperage;
		this.dischargeCurrentLimit = dischargeCurrentLimit;
		this.stateOfCharge = stateOfCharge;
	}

	public double getTemp() {
		return temp;
	}

	public double getRpm() {
		return rpm;
	}

	public double getChargeCurrentLimit() {
		return chargeCurrentLimit;
	}

	public double getAmperage() {
		return amperage;
	}

	public double getDischargeCurrentLimit() {
		return dischargeCurrentLimit;
	}

	public double getStateOfCharge() {
		return stateOfCharge;
	}
	
	

}
