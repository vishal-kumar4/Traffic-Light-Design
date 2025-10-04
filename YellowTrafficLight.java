class YellowTrafficLight implements TrafficLight{

	public YellowTrafficLight(){
		System.out.println("Traffic light is Yellow, Get ready to move");
	}
	
	@Override
	public void changeLight(TrafficLightManager manager)
	{
		manager.setState(new GreenTrafficLight());
	}
}