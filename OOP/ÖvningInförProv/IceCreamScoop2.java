public class IceCreamScoop2 {

    private String flavor;
    private double weight;

    IceCreamScoop2(String flavor, double weight) {
        this.flavor = flavor;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("En skopa med smaken %s och vikten %.2f%n", flavor, weight);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
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
        IceCreamScoop2 other = (IceCreamScoop2) obj;
        if (flavor == null) {
            if (other.flavor != null)
                return false;
        } else if (!flavor.equals(other.flavor))
            return false;
        return true;
    }
 
    



}
