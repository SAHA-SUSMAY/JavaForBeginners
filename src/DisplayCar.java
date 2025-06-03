
public class DisplayCar extends MyFrame {
	public void run() {
		car car1 = new car(10, 50, 10, 0);
		car car2 = new car(300, 150, -10, 0);
		car car3 = new car(400, 200, -15, 0);
		car car4 = new car(500, 300, -20, 0);
		for (int i = 0; i < 30; i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car3.draw(this);
			car4.draw(this);
			car1.move();
			car2.move();
			car3.move();
			car4.move();

			sleep(0.1);
		}

	}

}
