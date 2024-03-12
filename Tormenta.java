package Tormenta;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Tormenta - a robot by (your name here)
 */
public class Tormenta extends Robot
{
	/**
	 * run: Tormenta's default behavior
	 */
	
	public void run() {
		// Initialization of the robot should be put here
		double w = getBattleFieldWidth();
		turnGunRight(90);
		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(w/3);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		// back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(100);
	}
	public void	onHitRobot(HitRobotEvent event) {
		// O que ele faz quando topar com um robo
		double w = getBattleFieldWidth();
		double face_ori = getHeading();
		double gun_ori = getGunHeading();
		while (face_ori != gun_ori) {
			turnGunRight(1);
		}
		back(w/2);
	}
	
}
