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
		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:
  turnGunRight(90);
		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar
   
		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
		 ahead(40);
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
		turnRight(75);
	}
	public void	onHitRobot(HitRobotEvent event) {
		// O que ele faz quando topar com um robo
		double w = getBattleFieldWidth();
		turnGunLeft(90);
		fire(1);
		turnLeft(30);
		back(20);
		turnGunRight(90);
	}
	
}
