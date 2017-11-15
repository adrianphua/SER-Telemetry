DataObject
{
	float temp
	float rpm
	float chargeCurrentLimit
	float amperage
	float dischargeCurrentLimit
	float stateOfCharge
}

AverageDataObject
{
	DataObject[] array = new DataObject()[100];
	int index
	float temp
	float rpm
	float chargeCurrentLimit
	float amperage
	float dischargeCurrentLimit
	float stateOfCharge

	//make constructors

	void addObject(DataObject dataObject)
	{
		//add the current dataObject to the array of DataObjects
		//increment the index which holds how many DataObjects are
		//in your array
	}

	int getIndex()
	{
		return index;
	}

	private void calculateAverage()
	{
		//loop through the array and get the average of each variable in
		//the dataObject object then set each of the other variables
	}
}

DisplayData
{

}
