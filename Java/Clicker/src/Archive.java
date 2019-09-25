import java.util.*;
import java.util.Map.Entry;

public class Archive {

	public static void main(String[] args) {
		/*List<Integer> list = new ArrayList<>();
		for (int i = 0; i<100; i++) {
			list.add(i);
		}
		list.remove(5);
		System.out.println(list);
		
		System.out.println(list.get(2));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Integer x : list) {
			System.out.println(x);
		}
		*/
		List<Integer> listLink = new LinkedList<>();
		listLink.add(5);
		listLink.add(18);
		listLink.add(51528);
		//System.out.println(listLink);
		
		Map<Integer, String> squads = new HashMap<>();
		squads.put(1, "23 solders");
		squads.put(2, "3 Tanks");
		squads.put(3, "10 solders");
		squads.put(4, "7 aircraft");
		//System.out.println(squads);
		//for (Map.Entry<Integer, String> entry : squads.entrySet()) {
		//	System.out.println(entry.getKey() + " : " + entry.getValue());
		//}
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		//testMap(linkedMap);
		//testMap(treeMap);
		//testMap(squads);
		
		
		Set<String> setHash = new HashSet<String>();
		Set<String> setLink = new LinkedHashSet<String>();
		Set<String> setTree = new TreeSet<String>();
		testSet(setHash);
		testSet(setLink);
		testSet(setTree);
		
	}
	public static void testMap (Map<Integer, String> map) {
		map.put(1, "Ololol");
		map.put(15, "Tank");
		map.put(25, "Aircraft");
		map.put(1010, "Beer");
		map.put(567, "nuke");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println(" ");
	
	}
	public static void testSet (Set<String> set) {
		set.add("Panzer");
		set.add("Warrior");
		set.add("Star");
		set.add("Altar");
		set.add("0Star");
		for (String name : set) {
			System.out.println(name);
		}
		System.out.println(" ");
	}

}
