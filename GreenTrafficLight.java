class GreenTrafficLight implements TrafficLight{

	public GreenTrafficLight(){
		System.out.println("Traffic light is Green, you all can move");
	}
	
	@Override
	public void changeLight(TrafficLightManager manager)
	{
		manager.setState(new RedTrafficLight());
	}
}