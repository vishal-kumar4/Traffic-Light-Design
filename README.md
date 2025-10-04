# Traffic Light System

## Overview

This project demonstrates a simple Traffic Light System using the State design pattern in Java. The system cycles through Red, Yellow, and Green lights, printing a message for each state transition.

## Files

- `Main.java`: Entry point for the application.
- `TrafficLight.java`: Interface for traffic light states.
- `RedTrafficLight.java`, `YellowTrafficLight.java`, `GreenTrafficLight.java`: Concrete implementations for each light state.
- `TrafficLightManager.java`: Manages the current traffic light state.

## How to Run

1. **Compile all Java files:**
   ```sh
   javac *.java
   ```

2. **Run the main class:**
   ```sh
   java Main
   ```

## Expected Output

```
Traffic light is Red, Stop right there!
Traffic light is Yellow, Get ready to move
Traffic light is Green, you all can move
Traffic light is Red, Stop right there!
```

## Execution Flow

1. The program starts with the Red light.
2. Each call to `changeLight()` transitions to the next state:
   - Red → Yellow
   - Yellow → Green
   - Green → Red
3. After each transition, a message is printed to the console indicating the current state.

## Notes

- You can modify the number of transitions in `Main.java` to see more cycles.
- The system is extensible for additional
