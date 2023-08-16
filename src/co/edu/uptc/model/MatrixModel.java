package co.edu.uptc.model;

import java.util.ArrayList;

public class MatrixModel {
	ArrayList<ArrayList<Integer>> matrix;

	public MatrixModel() {
		matrix = new ArrayList<>();
	}

	public void setMatrix(ArrayList<ArrayList<Integer>> matrix) {
		this.matrix = matrix;
	}

	public ArrayList<ArrayList<Integer>> getMatrix() {
		return matrix;
	}

	public ArrayList<ArrayList<Integer>> transpose() {
		ArrayList<ArrayList<Integer>> transposedMatrix = new ArrayList<>();
		for (int i = 0; i < matrix.size(); i++) {
			transposedMatrix.add(new ArrayList<>());
			for (ArrayList<Integer> row : matrix) {
				transposedMatrix.get(i).add(row.get(i));
			}
		}
		return transposedMatrix;
	}
}
