package matrix;

import java.util.*;

public class matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // ������ �� ������, ����� �� �� ����� ���������� �� ������� �� ��������� �
											// ������
		System.out.print("�������� ��������� �� ���������: ");
		int matrixSizeX = s.nextInt(); // ��������� ������ �� ���������, ���� ������� ���� ���������
		int matrixSizeY = s.nextInt(); // ��������� ������ �� ���������, ���� ������� ���� ���������
		int moves = 0;
		int[][] matrix = new int[matrixSizeX][matrixSizeY]; // ���������
		// �������� �� ���������� ��������
		for (int i = 0; i < matrix.length-1; i++) {
			matrixSizeX--;
			moves++;
		}
		for (int j = 0; j < matrix[matrixSizeY].length-1; j++) {
			matrixSizeY--;
			moves++;
		}
		// �������� �� ���������� ��������
		moves -= 2;
		System.out.println("�������� ��������: " + moves); // ���������� �� ���������� ��������
	}

}
