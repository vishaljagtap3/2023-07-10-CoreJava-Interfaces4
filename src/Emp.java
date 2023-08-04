public class Emp implements Comparable{
    private int id;
    private String name;
    private int sal;

    public Emp(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public int compareTo(Object obj) {
        Emp e = (Emp) obj;
        if(this.id > e.id) {
            return 1;
        }
        if(this.id < e.id) {
            return -1;
        }
        return 0;
    }
}
