/**
 * ��������� �������:
 * 1. ����� ����������� ��������� ������� ().
 * 2. �������� ����� �������.
 * 3. ��������� ����������� ������� ��������� �������.
 * 4. ������� ������������� ��������� ����������� � �������� �������.
 * 5. ������ �������� ��������� ������� ��������� ���������� ����.
 * 6. ��������� ������ ��������� �����.
 * 7. ����������� ���������� (�� ��������).
 * 8. ����������� ���������� (�� �����������).
 * 9. .
 */
package old_arrsmeths;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrMatrixMeths{
/**
 * 1. ����� ����������� ��������� ������� ().
 * */
	public static String arrPrint(int[][] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			int count = 0;
			for(int j = 0; j <= arr[i].length-1; j++){
				arrstr += arr[i][j] + ", ";
				count++;
				if(count == arr[i].length){
					arrstr += "\n ";
					count = 0;
				}
			}
		}			
		arrstr = "["+arrstr.substring(0, arrstr.length()-4) + 
				arrstr.substring(arrstr.length()-4).replace(",", "]");
		return arrstr;
	}
	public static String arrPrint(String[][] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			int count = 0;
			for(int j = 0; j <= arr[i].length-1; j++){
				arrstr += arr[i][j] + ", ";
				count++;
				if(count == arr[i].length){
					arrstr += "\n ";
					count = 0;
				}
			}
			}
		arrstr = "["+arrstr.substring(0, arrstr.length()-4) + 
				arrstr.substring(arrstr.length()-4).replace(",", "]");
		return arrstr;
	}
/**
 * 2. �������� ����� �������.
 * */
	public static int[][] arrCopy(int[][] arr){
		int[][] arrC = new int[arr.length][arr[0].length];
		for(int i = 0; i <= arr.length-1; i++){
			for(int j = 0; j <= arr[i].length-1; j++){
				arrC[i][j] = arr[i][j];
				}
			}
		return arrC;
	}
	public static String[][] arrCopy(String[][] arr){
		String[][] arrC = new String[arr.length][arr[0].length];
		for(int i = 0; i <= arr.length-1; i++)
			for(int j = 0; j <= arr[i].length-1; j++)
			arrC[i][j] = arr[i][j];
		return arrC;
	}
/**
 * 3. ��������� ����������� ������� ��������� �������.
 * */
	public static int[][] randomValue(int[][] mass){
		for(int i = 0; i <= mass.length-1; i++){
			for(int j = 0; j <= mass[i].length-1; j++){
				if(j%3 == 0)
					mass[i][j] = (int) Math.pow(-21*Math.random(), i);
				else
					mass[i][j] = (int) Math.pow(-21*Math.random(), j);
			}
		}
		return mass;
	}
/**
 * 4. ������� ������������� ��������� ����������� � �������� �������.
 */
	public static int[] amountNegSignValue(int[][] A){
		int row = A.length;
		int col = A[0].length;
		int[] B = new int[col];
				for(int j = 0; j < col; j++){
					int k = 0;
					for(int i = 0; i < row; i++){
						if(A[i][j] < 0){
							k++;
						}
						B[j] = k;
					}
				}
		return B;
	}
/**
 * 5. ������ �������� ��������� ������� ��������� ���������� ����.
 * */
	public static int[][] initValue(int[][] mass){
		for(int i = 0; i <= mass.length-1; i++){
			for(int j = 0; j <= mass[i].length-1; j++){
//				System.out.print("������� A["+i+"]["+j+"] �������: "); 
//				A[i][j] = in.nextInt();
//				System.out.println();
				mass[i][j] = Integer.parseInt(JOptionPane.showInputDialog("������� A["+i+"]["+j+"] �������:"));
			}
		}
		return mass;
	}
/**
 * 6. ��������� ������ ��������� �����.
 * */
	public static int[][] initValForm(int[][] arr){
		try{
			new InitMatrixForm(arr).setVisible(true);
		}catch(NumberFormatException exc){
			JOptionPane.showMessageDialog(null, "\n"+exc);
		}
		return arr;
	}
/**
 * 7. ����������� ���������� (�� ��������).
 * */
	public static void sortMatrOfMaxToMin(int[][] arr, int[] vect){
//		int[] vect = new int[arr.length];
		//���������� �� ��������
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(vect[i] < vect[i+1]){
					int x = vect[i];
					vect[i] = vect[i+1];
					vect[i+1] = x;
					for(int j = 0; j <= arr.length-1; j++){
						x = arr[i][j];
						arr[i][j] = arr[i+1][j];
						arr[i+1][j] = x;
					}
				}
			}
		}
//		return "������������� �� ��������:\n"+arrPrint(arr)+"\n������ ����: "+ Arrays.toString(vect);
	}
/**
 * 8. ����������� ���������� (�� �����������).
 * */
	public static void sortMatrOfMinToMax(int[][] arr, int[] vect){
//		int[] vect = new int[arr.length];
		//���������� �� ��������
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(vect[i] > vect[i+1]){
					int x = vect[i];
					vect[i] = vect[i+1];
					vect[i+1] = x;
					for(int j = 0; j <= arr.length-1; j++){
						x = arr[i][j];
						arr[i][j] = arr[i+1][j];
						arr[i+1][j] = x;
					}
				}
			}
		}
//		return "������������� �� �����������:\n"+arrPrint(arr)+"\n������ ����: "+ Arrays.toString(vect);
	}
/**
 * 9. .
 * */
	public static String summOfRows(int[][] arr, int[] vect){
		//���������� ������� ����
//		int[] vect = new int[arr.length];
			for(int i = 0; i <= arr.length-1; i++){
				int summ = 0;
				for(int j = 0; j <= arr.length-1; j++){
					summ += arr[i][j];
				}
				vect[i] = summ;
			}
			return Arrays.toString(vect);
	}
}