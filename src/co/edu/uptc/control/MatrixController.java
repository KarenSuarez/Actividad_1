package co.edu.uptc.control;

import java.util.ArrayList;

import co.edu.uptc.model.MatrixModel;
import co.edu.uptc.view.MatrixView;

public class MatrixController {
	private MatrixModel model;
	public MatrixView view;

	public MatrixController(MatrixModel model, MatrixView view) {
		this.model = model;
		this.view = view;
		this.view.transposeButton.addActionListener(e -> transposeMatrix());
	}

	private void transposeMatrix() {
		String[] rows = view.matrixArea.getText().split("\n");
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		for (String row : rows) {
			ArrayList<Integer> matrixRow = new ArrayList<>();
			for (String num : row.split(" ")) {
				matrixRow.add(Integer.parseInt(num));
			}
			matrix.add(matrixRow);
		}

		model.setMatrix(matrix);
		ArrayList<ArrayList<Integer>> transposedMatrix = model.transpose();
		view.setTransposedMatrix(transposedMatrix);
	}
}
