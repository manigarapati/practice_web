package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class hashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h = new HashMap();
		h.put(1, "lohith");
		h.put(2, "mani");
		h.put(3, "dathatreya");
		h.put(5, "garapati");
		h.put(4, "koushik");
		h.put(5, "ram");
		h.put(6, "garapati");
		h.put("loki", 20);
		System.out.println(h);
		System.out.println(h.get(5));
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());
		System.out.println(h.containsKey(5));
		System.out.println(h.containsValue("ram"));
		
		Map syncmap =  Collections.synchronizedMap(h);
		System.out.println(syncmap);
		System.out.println(Collections.synchronizedMap(h));
		ConcurrentHashMap mapcon = new ConcurrentHashMap();
		mapcon.putAll(h);
		System.out.println(mapcon);
		
	}

}
