import java.util.Iterator;
import java.util.TreeSet; 

public class ArratListTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList(20);
//		list.add("1");
//		list.add("1");
//		list.add(new Integer(1));
//		list.add(1);
//		list.add("2");
//		list.add(2);
//		
//		list.add("1"); // String -> Object
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5"); // list.add(new String(5); �� �ؾ��ϳ� �� �ʿ� ����
//		
//		list.get(0);
//		
//		String str = (String)list.get(0);
//		System.out.println(str);
//		int sum = 0;
//		
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);
//			int num = Integer.parseInt(str);
//			sum += num;
//		}
//		
//		System.out.println("sum = " + sum);
//		
//		for(int i = 0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		list.remove(3);
//		for(int i = 0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		Stack st = new Stack();
//		
//		st.push("1");
//		st.push("2");
//		st.push("3");
//		
//		
//		try {
//		System.out.println((String)st.pop()); //pop 3���� ǥ�� // 
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());
//		}catch(EmptyStackException e) {
//			System.out.println("Stack�� ����ֽ��ϴ�.");
//		}
//		while(!st.empty()) {
//			System.out.println(System.out.println((String)st.pop()));
//		}
			
		
//		ArrayList list = new ArrayList(); 
//		
//		list.add("1");
//		list.add("1");
//		list.add(new Integer(1));
//		list.add(3.14);
//		
//		list.add("1"); // String -> Object
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5"); // list.add(new String(5); �� �ؾ��ϳ� �� �ʿ� ����
		
		//iterator (�ݺ��� ����)
		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) { // ������ �������� Ȯ��
//			String str = (String)it.next(); // ���� ������ ���� ����
//			System.out.println(str);
//		}
		//���׸� : �÷��� ��ü�� ������ Ÿ���� ���� �Ѵ�. <>
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0);
//		
//			
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) { // ������ �������� Ȯ��
//			String str = (String)it.next(); // ���� ������ ���� ����
//			System.out.println(str);
//		}
		
		//set
		
//		HashSet set = new HashSet(); // �ߺ��� ���ġ �ʴ´�.
//
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add(new Integer(1));
//		
//		System.out.println(set); 
//		for(Object obj : set ) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
//		
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add("5");
//		
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
//		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int[5][5];
//		
//		for(int i = 0; set.size() < 25 ; i++) {
//			set.add((int)(Math.random() * 50) +1);
//		}
////		System.out.println(set);
//		
//		ArrayList list = new ArrayList(set);
//		Collections.shuffle(list);
//		
//		Iterator<Integer> it = list.iterator();
//		for(int i = 0; i<bingo.length;i++) {
//			for(int j = 0; j<bingo[i].length;j++) {
//				bingo[i][j] = it.next();
//			}
//		}
//		
//		for(int i = 0; i<bingo.length;i++) {
//			for(int j = 0; j<bingo[i].length;j++) {
//			System.out.print(bingo[i][j] + " ");
//		}
//			System.out.println();
//		}
		
		//TreeSet : �ݵ�� ������ ���Ǵ� �ش� Ŭ���� �ȿ��� ���� ������ �������̵� �Ǿ��־�� �Ѵ�.
		//Implements Comparable (Integer, String ......)
//		
//		TreeSet<Integer> set = new TreeSet<Integer>(); // ���� ���ĵǾ����� ����
//		set.add(new Integer(2));
//		set.add(5);
//		set.add(4);
//		set.add(1);
//		set.add(3);
//		
//		System.out.println(set);
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			Integer intg = (Integer)it.next();
//			System.out.println(intg);
//		}
		TreeSet<Students> set = new TreeSet <Students>(); // ���� ���ĵǾ�����.
		
		Students s1 = new Students("kim",1,1,10,20,30);
		Students s2 = new Students("lim",2,5,15,25,35);
		Students s3 = new Students("pim",3,9,10,30,50);
		Students s4 = new Students("tim",4,6,20,40,10);
		Students s5 = new Students("fim",5,7,10,10,10);
		
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator<Students> it = set.iterator();
		
		while(it.hasNext()) {
			Students s =(Students)it.next();
		    System.out.println(s.toString());
		
		
		}
	}



}
