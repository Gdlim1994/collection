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
		return getTotal() / 3.0f; //float�� ���� �ڿ� f�� �ٿ��־����.
	}
	
	
	
	@Override
	public int compareTo(Object o) {

        if(o instanceof Students) {
        	Students tmp = (Students)o;
//        	return this.ban - tmp.ban; // 0 :���� �� ��� : ���� ���� ŭ ���� : ���� ���� ŭ  //��������
        	return tmp.ban - this.ban; //��������
        }
		
		return -1; // -1�� �־��־�� �ϴ� ����?
	}

}
