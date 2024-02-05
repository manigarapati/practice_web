package collections;

import java.util.Comparator;
import java.util.TreeMap;

public class treemapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> t = new TreeMap<>(new Mycomparator());
		t.put(1, "lohith");
		t.put(3, "mani");
		t.put(2, "dathatreya");
		t.put(5, "garapati");
		t.put(4, "koushik");
		t.put(5, "ram");
		t.put(6, "garapati");
		//t.put("loki", 20);
		System.out.println(t);
	}

}
class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		//return i1.compareTo(i2);
		//return i2.compareTo(i1);
		if(i1<i2) {
			return -1;
		}else if(i1>i2){
			return 1;
		}else {
			return 0;
	}

	
		
	}
}