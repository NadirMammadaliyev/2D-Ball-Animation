import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyPanell panel;

	MyFrame() {
		panel = new MyPanell();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("2D Animation");
		this.add(panel);
		this.pack();
		this.setResizable(false);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
