package com.clickpraise;
import java.util.Scanner;//����java.util.Scanner��
/**
 *ˢ��ϵͳ���û������Լ���Ŀǰ��������
 *���С��100���ޣ�ϵͳ���Զ���ӵ�100�ޣ��������û������˼����ޣ�
 *1.����java.util.Scanner������
 *2.����Scanner����
 *3.���ղ������û������ֵ
 * print()��println()������println�����Ϣ��ỻ�У���print���ỻ��
 * */
public class MyClickPraise {
	public static void main(String[] arg){		
		int endPraise = 100;//�������յ�����
		int count = 0;//��¼���˼���
		
		//����Scanner����input
		Scanner input = new Scanner(System.in);
		System.out.print("����������������");//��ʾ�û�����ԭ��������
		/* print()�����Ϣ�󲻻ỻ�� */
		int myPraise = input.nextInt();//��ȡ�û����������
		
		//��ӡ��ԭ�ȵ�����
		System.out.println("ԭ�ȵ�����Ϊ��" + myPraise + "��");
		
		while(myPraise < endPraise){
			myPraise++;
			count++;
		}
		
		//��ӡ������������
		System.out.println("���Ӻ������Ϊ��" + myPraise + "��");
		//��ӡ�������˼���
		System.out.println("������" + count + "��");
	}
}
