import java.util.ArrayList;

public class DataAverage {

	ArrayList<Data> dataObjects;
	//Battery temperature
	private double avgTemp;
	//Axel rotation, related to speed
	private double avgRpm;
	//TODO: from BMS, max charge?
	private double avgChargeCurrentLimit;
	//Current from battery
	private double avgAmperage;
	//TODO: max current?
	private double avgDischargeCurrentLimit;
	//TODO: battery charge
	private double avgStateOfCharge;
	
	public DataAverage()
	{
		dataObjects = new ArrayList<Data>();
		avgTemp = 0;
		avgRpm = 0;
		avgChargeCurrentLimit = 0;
		avgAmperage = 0;
		avgDischargeCurrentLimit = 0;
		avgStateOfCharge = 0;
	}
	
	public void calcAvgValues()
	{
		double tempTemp = 0;
		double tempRpm = 0;
		double tempChargeCurrentLimit = 0;
		double tempAmperage = 0;
		double tempDischargeCurrentLimit = 0;
		double tempStateOfCharge = 0;
		
		for(int i = 0; i < 100; i++)
		{
			tempTemp += dataObjects.get(i).getTemp();
			tempRpm += dataObjects.get(i).getRpm();
			tempChargeCurrentLimit += dataObjects.get(i).getChargeCurrentLimit();
			tempAmperage += dataObjects.get(i).getAmperage();
			tempDischargeCurrentLimit += dataObjects.get(i).getDischargeCurrentLimit();
			tempStateOfCharge += dataObjects.get(i).getStateOfCharge();			
		}
		
		avgTemp = tempTemp / 100.0;
		avgRpm = tempRpm / 100.0;
		avgChargeCurrentLimit = tempChargeCurrentLimit / 100.0;
		avgAmperage = tempAmperage / 100.0;
		avgDischargeCurrentLimit = tempDischargeCurrentLimit / 100.0;
		avgStateOfCharge = tempStateOfCharge / 100.0;
	}
	
	
}

