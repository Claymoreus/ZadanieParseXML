import java.util.*;
import java.util.Map.Entry;
import java.lang.*;

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
		System.out.println(setHash.contains("Altar"));
		
		Set<Integer> numSet = new HashSet<Integer>();
		numSet.add(0);
		numSet.add(1);
		numSet.add(2);
		numSet.add(3);
		numSet.add(4);
		numSet.add(5);
		
		Set<Integer> numSet2 = new HashSet<Integer>();
		numSet2.add(4);
		numSet2.add(5);
		numSet2.add(6);
		numSet2.add(7);
		numSet2.add(8);
		numSet2.add(9);
		
		Set<Integer> union = new HashSet<Integer>(numSet);
		union.addAll(numSet2);
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<Integer>(numSet);
		intersection.retainAll(numSet2);
		System.out.println(intersection);
		
		Set<Integer> differense = new HashSet<Integer>(numSet);
		differense.removeAll(numSet2);
		System.out.println(differense);
		
		Set<Hero> heroBase = new HashSet<>();
		
		Hero hero01 = new Hero(1, "Drago");
		Hero hero02 = new Hero(1, "Drago");
		heroBase.add(hero01);
		heroBase.add(hero02);
		System.out.println(heroBase);
		
		
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
class Hero {
	private int id;
	private String name;
	
	public Hero(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hero{" +
				"id=" + id +
				", name='" + name + '\'' + '}';
	}
	@Override
	public boolean equals(Object o) {
		if (this  == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Hero hero = (Hero) o;
		
		if (id != hero.id) return false;
		return name != null ? name.equals(hero.name) : hero.name == null;
	}
	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
	
}