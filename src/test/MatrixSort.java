package test;
import static old_arrsmeths.ArrMatrixMeths.*;

import  java.util.*;
public class MatrixSort {
private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("������� ���������� ���������: ");
		int m = in.nextInt();
		int[][] arr = new int[m][m];
		int[] vect = new int[arr.length];

		//�������������
		arr = randomValue(arr);
//		arr = initValue(arr);
		System.out.println("�������� �������:\n"+arrPrint(arr));
		
		//���������� �������
		System.out.println("������ ���� �������� �������: "+summOfRows(arr,vect));
		
		sortMatrOfMaxToMin(arr,vect);
		System.out.println("������������� �� ��������:\n"+arrPrint(arr));
		System.out.println(Arrays.toString(vect));
		sortMatrOfMinToMax(arr,vect);
		System.out.println("������������� �� �����������:\n"+arrPrint(arr));
		System.out.println(Arrays.toString(vect));
	}
}
