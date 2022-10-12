import java.io.*;
import java.util.*;

public class PropertiesTest {

	public static void main(String[] args) {
//		Properties prop = new Properties();
//		
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//		
//		String value = prop.getProperty("myid");
//		System.out.println(value);
//		
//
//		Enumeration e = prop.propertyNames();
//		
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();
//		    String value = prop.getProperty(element);
//		    System.out.println(value);
//		}
		
		Properties prop = new Properties();
		
		try{
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e) {
			System.out.println("������ ������ �����ϴ�.");
			System.exit(0); // ���α׷� ���������Ҷ� ����ϴ� ��ɾ�
		}
		
		String name = prop.getProperty("name"); // \
		String[] data = prop.getProperty("data").split(",");

		int max = 0;
		int min = 0;
		int sum = 0;
		
		
//		�̸�
//		max data �ִ�
//		min 
//		sum data ���ϱ�
//		��� data ������
		
		//���ڿ� -> ���� : Integer.parseInt(���ڿ�)
		//���� -> ���ڿ� : String.valueOf(����)
		for(int i = 0; i < data.length; i++) {
			int value = Integer.parseInt(data[i]);
			
			if(max < value) {
				max = value;
			}
					
			sum += value;
		}
		min = max;
		for(int i = 0; i < data.length; i++) {
			int value = Integer.parseInt(data[i]);
			
			if(min > value) {
				min = value;
			}
		}
		double avg = (double)sum / data.length;
		
		System.out.println("�̸� : " + name);
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּڰ� : " + min);
		System.out.println("���� : " + sum);
		System.out.println("��հ� : " + avg);
		
		}	
	}

