import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame() {
		
		this.add(new GamePanel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); // fully adjusts the window according to elements for cleaner look
		this.setVisible(true); // shows the window
		this.setLocationRelativeTo(null); // sets the window to center
		
	}

}
