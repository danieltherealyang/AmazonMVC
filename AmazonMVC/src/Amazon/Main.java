package Amazon;

import javax.swing.*;

import Amazon.Components.ProductRegistry;

import java.awt.*;

public class Main {
	public static void main(String[] args) {
		JFrame Frame = new JFrame();
		Model model = new Model();
		View view = new View(model,Frame);
		Controller controller = new Controller(model, view);
		ProductRegistry.fillRegistry();
		view.setVisible(true);
	}
}
