package Amazon;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		JFrame Frame = new JFrame();
		Model model = new Model();
		View view = new View(model,Frame);
		Controller controller = new Controller(model, view);

		view.setVisible(true);
	}
}
