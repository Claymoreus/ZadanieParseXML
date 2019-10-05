import java.util.LinkedList;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestWait {
    public static void main (String[] args){

        Warrior war001 = new Warrior(1, "Thor");
        Warrior war002 = new Warrior(2, "Loki");
        Warrior war003 = new Warrior(3, "Zeus");
        Warrior war004 = new Warrior(4, "Ares");
        Warrior war005 = new Warrior(5, "Penny");

        Queue<Warrior> warriorQueue  = new ArrayBlockingQueue<Warrior>(3);
        warriorQueue.add(war003);
        warriorQueue.add(war001);
        warriorQueue.add(war004);
        System.out.println(warriorQueue.offer(war002));
        System.out.println(warriorQueue.offer(war005));
        System.out.println("******************");
        if (!warriorQueue.offer(war002)) {
            System.out.println("Queue FULL, auto remove active");
            warriorQueue.remove();
            warriorQueue.offer(war002);
        } else {
            System.out.println("Add sucsessfull");
        }
        //warriorQueue.peek(war003);
        //warriorQueue.peek(war003);
        //warriorQueue.remove();
        System.out.println(warriorQueue);
        //warriorQueue.remove();

    }

}
class Warrior {
    private int id;
    private String name;

    public Warrior(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return id == warrior.id &&
                Objects.equals(name, warrior.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}