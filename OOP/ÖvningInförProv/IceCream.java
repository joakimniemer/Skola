import java.util.ArrayList;
import java.util.List;

public class IceCream {

    public enum Holder {
        CUP, KIDSCUP, WAFFLE;
    }

    private Holder holder;
    private List<IceCreamScoop> scoops;

    IceCream(Holder holder) {
        this.holder = holder;
        scoops = new ArrayList<>();
    }

    public void addScoop(IceCreamScoop scoop) {
        if (scoops.size() < 5) {
            scoops.add(scoop);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Du har redan 5 kulor");
    }

    public int size() {
        return scoops.size();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((holder == null) ? 0 : holder.hashCode());
        result = prime * result + ((scoops == null) ? 0 : scoops.hashCode());
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
        IceCream other = (IceCream) obj;
        if (holder != other.holder)
            return false;
        if (scoops == null) {
            if (other.scoops != null)
                return false;
        } else if (!scoops.equals(other.scoops))
            return false;
        return true;
    }

    @Override
    public String toString() {

        return String.format("En glass i %s med %d kulor%n%s", this.holder, this.size(), scoops);
    }
}
