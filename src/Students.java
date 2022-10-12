import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor


public class Students implements Comparable {

	String name;
	int ban;
	int no;
	int kor,eng,math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTotal() / 3.0f; //float를 쓸때 뒤에 f를 붙여주어야함.
	}
	
	
	
	@Override
	public int compareTo(Object o) {

        if(o instanceof Students) {
        	Students tmp = (Students)o;
//        	return this.ban - tmp.ban; // 0 :같은 값 양수 : 앞의 값이 큼 음수 : 뒤의 값이 큼  //오름차순
        	return tmp.ban - this.ban; //내림차순
        }
		
		return -1; // -1을 넣어주어야 하는 이유?
	}

}
