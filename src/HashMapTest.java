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
		
		//keyset() : 키값 전체를 반환한다.
	    
	    
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

		//values() : values전체를 반환한다.
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
//	    	System.out.println("아이디 입력 : ");
//	    	String id = sc.next();
//	    	
//	    	System.out.println("비밀번호 입력 : ");
//	    	String pw = sc.next();
//	    	
//	    	//get(key) -> vaule값 반환
//	    	//get("myid") -> "1234"
//	    	//containsKey() -> 존재유무를 확인(true, false)
//	    	if(!map.containsKey(id)) {
//	    		System.out.println("아이디가 틀렸습니다. 다시 입력해 주세요.");
//	    		continue;
//	    	}else {
//	    		if(!(map.get(id)).equals(pw)) {
//	    			System.out.println("비밀번호가 틀렸습니다. 다시 입력해 주세요.");
//	    		}else {
//	    			System.out.println("로그인 성공");
//	    			break;
//	    		}
//	    	}
//	    
//	    }
	} //main 

}
