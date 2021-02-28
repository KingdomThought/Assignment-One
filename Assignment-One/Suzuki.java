import java.io.FileWriter;
import java.io.IOException;

public class Suzuki extends Vehicle implements AssignmentInterface{
	

	int positionTracker = 0;
	int movingInt = 0;
	
	Suzuki(int vehIcleNumber, boolean isRacingCar) {
		this.vehicleName = "Suzuki";
		this.vehecleNumber = vehIcleNumber;
		this.isRacingVehicle = isRacingCar;
	}

	@Override
	public void race() {
		if (isRacingVehicle) {
			while(true) {
				positionTracker = positionTracker + (int)(Math.random() * ((20 - positionTracker) + 1));
				movingInt = movingInt + positionTracker;
				try {
				      FileWriter myWriter = new FileWriter("raceoutput.txt", true);
				      if (movingInt < 100)
				    	  myWriter.append("\nRunning: "+this.vehicleName + " is at position: " + this.movingInt);
				      else if (movingInt >= 100) {
				    	  myWriter.append("\n"+this.vehicleName + " is at position: " + 100 
				    			  + "\nRunning: " + vehicleName + " is the winner!");
					      myWriter.close();
					      System.out.println("Race results are being written for " + vehicleName);
					      System.exit(0);
				      }
				      myWriter.close();
				      System.out.println("Race results are being written for " + vehicleName);
				      Thread.sleep(3*1000);
				    } 
				catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void print() {
		System.out.println("Method call from interface method implementation: \nVehical Object: " 
				+ vehicleName + " " + vehecleNumber);
	}
	

}
