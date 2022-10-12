import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

      
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("myid","1234"); // put Objeck key, object vaule 
	    map.put("asdf", "1111");  
	    map.put("asdf", "1234");
	    map.put("asdf", "6666");
		
		//keyset() : Ű�� ��ü�� ��ȯ�Ѵ�.
	    
	    
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("=====================");

		//values() : values��ü�� ��ȯ�Ѵ�.
		Collection<String> values = map.values();
		Iterator<String> itV = values.iterator();
		
		while(itV.hasNext()) {
			String value = itV.next();
			System.out.println(value);
		}
		
		Set<Map.Entry<String,String>>entry = map.entrySet();
		Iterator<Map.Entry<String,String>> itE = entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String,String> ent = itE.next();
			String key = ent.getKey();		
		    String value = ent.getValue();
		    
		    System.out.println("[key] :" + key + ", [value] : " + value);
		}
		System.out.println("=====================");
		for(Map.Entry<String, String> ent : map.entrySet()) {
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key] :" + key + ", [value] : " + value);
		}
		
		
		
//	    System.out.println(map);
//	    
//	    Scanner sc = new Scanner(System.in);
//	    
//	    while(true) {
//	    	System.out.println("���̵� �Է� : ");
//	    	String id = sc.next();
//	    	
//	    	System.out.println("��й�ȣ �Է� : ");
//	    	String pw = sc.next();
//	    	
//	    	//get(key) -> vaule�� ��ȯ
//	    	//get("myid") -> "1234"
//	    	//containsKey() -> ���������� Ȯ��(true, false)
//	    	if(!map.containsKey(id)) {
//	    		System.out.println("���̵� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ּ���.");
//	    		continue;
//	    	}else {
//	    		if(!(map.get(id)).equals(pw)) {
//	    			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ּ���.");
//	    		}else {
//	    			System.out.println("�α��� ����");
//	    			break;
//	    		}
//	    	}
//	    
//	    }
	} //main 

}
