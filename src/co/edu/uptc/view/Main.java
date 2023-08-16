package co.edu.uptc.view;

import javax.swing.SwingUtilities;

import co.edu.uptc.control.MatrixController;
import co.edu.uptc.model.MatrixModel;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MatrixModel model = new MatrixModel();
				MatrixView view = new MatrixView();
				new MatrixController(model, view).view.setVisible(true);
			}
		});
	}
}
