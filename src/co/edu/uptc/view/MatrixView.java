package co.edu.uptc.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MatrixView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextArea matrixArea;
	public JTextArea transposedArea;
    public JButton transposeButton;

    public MatrixView() {
        createView();
        setTitle("Matrix Transposer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
    	JPanel panel = new JPanel();
        JPanel panelData = new JPanel();
        JPanel panelButton = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panelData.setLayout(new GridLayout(2, 2));
        panel.add(panelData);
        panel.add(panelButton);
        
        getContentPane().add(panel);

        JLabel matrixLabel = new JLabel("Matrix:");
        panelData.add(matrixLabel);

        matrixArea = new JTextArea();
        matrixArea.setPreferredSize(new Dimension(150, 100));
        panelData.add(new JScrollPane(matrixArea));

        transposeButton = new JButton("Transpose");
        panelButton.add(transposeButton);

        JLabel transposedLabel = new JLabel("Transposed Matrix:");
        panelData.add(transposedLabel);

        transposedArea = new JTextArea();
        transposedArea.setPreferredSize(new Dimension(150, 100));
        panelData.add(new JScrollPane(transposedArea));
    }

    public void setTransposedMatrix(ArrayList<ArrayList<Integer>> transposedMatrix) {
        StringBuilder sb = new StringBuilder();
        for (ArrayList<Integer> row : transposedMatrix) {
            for (int num : row) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }
        transposedArea.setText(sb.toString());
    }
}
