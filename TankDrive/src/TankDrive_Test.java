import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;

public class TankDrive_Test {
	
	Joystick stk1 = new Joystick(1); //left
	Joystick stk2 = new Joystick(2); //right
	
	Spark spark1 = new Spark(1); //left
	Spark spark2 = new Spark(2); //left
	Spark spark3 = new Spark(3); //right
	Spark spark4 = new Spark(4); //right
	
	double stk1Y = stk1.getY();
	double stk2Y = stk2.getY();
		
	public void driveLeftForward() {
		while (stk1Y > 0) {
			spark1.set(stk1Y/92);
			spark2.set(stk1Y/92);
		}
	}
	public void driveRightForward() {
		while (stk2Y > 0) {
			spark3.set(stk2Y/92);
			spark4.set(stk2Y/92);
		}
	}
	public void driveLeftBackward() {
		while (stk1Y < 0) {
			spark1.set(stk1Y/92 * -1);
			spark2.set(stk1Y/92 * -1);
	}
	
	}

}