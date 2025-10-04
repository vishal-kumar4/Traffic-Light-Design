class Main{
	public static void main(String args[]){
		TrafficLightManager manager = new TrafficLightManager();


		TrafficLight trafficLight = manager.getTrafficLight();
        
		
		trafficLight.changeLight(manager);
        trafficLight = manager.getTrafficLight();

        trafficLight.changeLight(manager);
        trafficLight = manager.getTrafficLight();

        trafficLight.changeLight(manager);
	}
}