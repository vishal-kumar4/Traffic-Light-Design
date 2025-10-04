class RedTrafficLight implements TrafficLight{

	public RedTrafficLight(){
		System.out.println("Traffic light is Red, Stop right there!");
	}
	
	@Override
	public void changeLight(TrafficLightManager manager)
	{
		manager.setState(new YellowTrafficLight());
	}
}