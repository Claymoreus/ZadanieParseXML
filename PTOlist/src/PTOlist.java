import java.util.*;

public class PTOlist {

    public static void main(String[] args) {
        timerSecStart();

        List<String> officeWorkers = new ArrayList<>();
        officeWorkers.add("Max");
        officeWorkers.add("Sergei");
        officeWorkers.add("Viktoria");
        officeWorkers.add("Eugenia");
        officeWorkers.add("Alex");
        /*Collections.sort(enginers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else  {
                    return 0;
                }
            }
        });*/

        System.out.println(officeWorkers);

        List <Person> workers = new ArrayList<>();
        workers.add(new Person(0, "Alex", "MainEngineer", 90));
        workers.add(new Person(1, "Dmitri", "ProjectLider", 80));
        workers.add(new Person(2, "Sergei", "ProjectManager", 70));
        workers.add(new Person(3, "Oleg", "Geodesist", 55));
        workers.add(new Person(4, "Ivan", "EngineerPTO", 50));
        workers.add(new Person(5, "Max", "Driver", 40));

        /*Set <Person> peopleSet = new TreeSet<>();
        addNewWorker(peopleSet);
        private static void addNewWorker(Collection collection) {
            collection.add(new Person(13, "Den", "Debil", 20));
        }*/
        /*Collections.sort(workers, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else   {
                    return 0;
                }
            }
        });*/
        timerSecStop();

        System.out.println(workers.get(0));


        Collections.sort(officeWorkers, new sortByNameLenght());
        System.out.println(officeWorkers);
    }


    public static void timerSecStart() {
        long startTimer = System.currentTimeMillis();
        return;
    }
    public static void timerSecStop() {
        long stopTimer = System.currentTimeMillis();
        return;
    }
}
class Person implements Comparable <Person>{
    private int id;
    private String name;
    private String rank;
    private int score;

    public Person(int id, String name, String rank, int score) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                score == person.score &&
                Objects.equals(name, person.name) &&
                Objects.equals(rank, person.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rank, score);
    }

    @Override
    public int compareTo(Person o) { //sort by ID
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else   {
            return 0;
        }
    }
}
class sortByNameLenght implements Comparator<String> {  //sort by length

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else
        return 0;
    }
}

/*class  timerSecStart {
    public timerSecStart() {
        long startTimer = System.currentTimeMillis();
        return;
    }

}
class  timerSecStop {
    public timerSecStop() {
        long stopTimer = System.currentTimeMillis();
        return;
    }
}*/
