class TrafficLightManager{
	private TrafficLight trafficLight;
	
	// public static TrafficLight getInstance(){
	// 	if(trafficLight == null)
	// 	{
	// 		trafficLight = new RedTrafficLight();
	// 	}
	// 	return trafficLight;
	// }

    // constructor
    public TrafficLightManager(){
        trafficLight = new RedTrafficLight();
    }

	
	
	//getter
	public TrafficLight getTrafficLight(){
		return trafficLight;
	}
	
	// setter 
	public void setState(TrafficLight trafficLight){
		this.trafficLight = trafficLight;
	}
}