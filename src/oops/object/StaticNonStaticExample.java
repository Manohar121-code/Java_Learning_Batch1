package oops.object;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StaticNonStaticExample {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(8787);
		e.setName("sachin");
		e.setSalary(76767);
		
		Employee e1 = new Employee(10, "java", 18786);
		Employee e2 = new Employee(20, "python", 12454);
		
		long salary = e1.getSalary();
		System.out.println(salary);
		
		long salary2 = e2.getSalary();
		System.out.println(salary2);
		
		System.out.println("------------------------");
		
		e1.setXyz(100);
		System.out.println("e1 xyz - "+e1.getXyz());
		System.out.println("e2 xyz - "+e2.getXyz());
		
		e2.setXyz(7878);
		System.out.println("e1 xyz - "+e1.getXyz());
		System.out.println("e2 xyz - "+e2.getXyz());
		
		checkMapVal();
	}

	private static void checkMapVal() {
		ThreadLocal<Long> e1 = new ThreadLocal<>();
		e1.set((long) 100); 
		Map<ThreadLocal<Long>, ThreadLocal<Long>> map = new HashMap<>();
		map.put(e1, e1);
		printMap(map);
		e1.set((long) 200);
		printMap(map);
	}

	private static void printMap(Map<ThreadLocal<Long>, ThreadLocal<Long>> map) {
		Set<ThreadLocal<Long>> keySet = map.keySet();
		for (ThreadLocal<Long> key : keySet) {
			ThreadLocal<Long> val = map.get(key);
			System.out.println(key.get()+" - "+val.get());
		}
	}
}
