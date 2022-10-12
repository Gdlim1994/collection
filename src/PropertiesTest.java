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
			System.out.println("지정한 파일이 없습니다.");
			System.exit(0); // 프로그램 강제종료할때 사용하는 명령어
		}
		
		String name = prop.getProperty("name"); // \
		String[] data = prop.getProperty("data").split(",");

		int max = 0;
		int min = 0;
		int sum = 0;
		
		
//		이름
//		max data 최댓값
//		min 
//		sum data 더하기
//		평균 data 나누기
		
		//문자열 -> 숫자 : Integer.parseInt(문자열)
		//숫자 -> 문자열 : String.valueOf(숫자)
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
		
		System.out.println("이름 : " + name);
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균값 : " + avg);
		
		}	
	}

