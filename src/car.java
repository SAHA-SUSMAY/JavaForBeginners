import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class car extends Vehicle implements KeyListener {

	public car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x + 20, y, 40, 20);
		frame.fillRect(x, y + 20, 80, 20);
		frame.fillOval(x + 10, y + 40, 20, 20);
		frame.fillOval(x + 50, y + 40, 20, 20);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			vx = -5;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			vx = 5;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			vy = -2;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			vy = 4;
		}
	}

	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			vx = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			vx = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			vy = 0;
		}
	
	if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		vy = 0;
	}
	}

	public void keyTyped(KeyEvent e) {

	}

}
