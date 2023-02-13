package matrix;

import java.util.*;

public class matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // правим си скенер, който ще ни служи единствено за размера на матрицата в
											// случая
		System.out.print("Въведете размерите на матрицата: ");
		int matrixSizeX = s.nextInt(); // въвеждаме размер на матрицата, чрез скенера през конзолата
		int matrixSizeY = s.nextInt(); // въвеждаме размер на матрицата, чрез скенера през конзолата
		int moves = 0;
		int[][] matrix = new int[matrixSizeX][matrixSizeY]; // матрицата
		// ПРОВЕРКА НА ВЪЗМОЖНИТЕ ВАРИАНТИ
		for (int i = 0; i < matrix.length-1; i++) {
			matrixSizeX--;
			moves++;
		}
		for (int j = 0; j < matrix[matrixSizeY].length-1; j++) {
			matrixSizeY--;
			moves++;
		}
		// ПРОВЕРКА НА ВЪЗМОЖНИТЕ ВАРИАНТИ
		moves -= 2;
		System.out.println("Възможни варианти: " + moves); // принтиране на възможните варианти
	}

}
