public class Pair<T1 extends Comparable<T1>> implements Comparable<Pair<T1>> {

    private T1 value1;
    private T1 value2;

    public Pair(T1 v1, T1 v2) {
        this.value1 = v1;
        this.value2 = v2;
    }

    public T1 getValue1() {
        return value1;
    }

    public T1 getValue2() {
        return value2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value1 == null) ? 0 : value1.hashCode());
        result = prime * result + ((value2 == null) ? 0 : value2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair<?> other = (Pair<?>) obj;
        if (value1 == null) {
            if (other.value1 != null)
                return false;
        } else if (!value1.equals(other.value1))
            return false;
        if (value2 == null) {
            if (other.value2 != null)
                return false;
        } else if (!value2.equals(other.value2))
            return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T1> o) {
        int res = value1.compareTo(o.value1);
        if (res == 0){
            res = value2.compareTo(o.value2);
        }
        return res;
    }

    @Override
    public String toString() {
        return "value1 = " + value1 + ", value2 = " + value2 + "";
    }

    

}