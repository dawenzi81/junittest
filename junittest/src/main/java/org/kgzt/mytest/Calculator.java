/**
 * 
 */
package org.kgzt.mytest;

/**
 * @author Guo
 *
 */
public class Calculator
{
	private static int result; // ��̬���������ڴ洢���н��
    public void add(int n) {
        result = result + n;
    }
    public void substract(int n) {
        result = result - 1;  //Bug: ��ȷ��Ӧ���� result =result-n
    }
    public int multiply(int n) {
    	 result = result * n; 
    	 return result;
    	//
    }         // �˷�����δд��
    public void divide(int n) {
        result = result / n;
    }
    private void square(int n) {
        result = n * n;
    }
    public void squareRoot(int n) {
        for (; ;) ;            //Bug : ��ѭ��
    }
    public void clear() {     // ���������
        result = 0;
    }
    public int getResult() {
        return result;
    }
}