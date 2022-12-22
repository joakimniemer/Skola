import java.util.Comparator;
import java.util.UUID;

public class InventoryItem implements Comparable<InventoryItem> {

    private String name;
    private UUID partNo;
    private int partSaldo;
    private double price;

    public InventoryItem(String name, int partSaldo, double price) {
        this.name = name;
        this.partNo = UUID.randomUUID();
        this.partSaldo = partSaldo;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public UUID getPartNo() {
        return partNo;
    }

    public int getPartSaldo() {
        return partSaldo;
    }

    public double getPrice() {
        return price;
    }

    public void setPartSaldo(int partSaldo) {
        this.partSaldo = partSaldo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InventoryItem [name=" + name + ", partNo=" + partNo + ", partSaldo=" + partSaldo + ", price=" + price
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((partNo == null) ? 0 : partNo.hashCode());
        result = prime * result + partSaldo;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        InventoryItem other = (InventoryItem) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (partNo == null) {
            if (other.partNo != null)
                return false;
        } else if (!partNo.equals(other.partNo))
            return false;
        if (partSaldo != other.partSaldo)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }

    @Override
    public int compareTo(InventoryItem o) {
        var comp = Comparator.nullsFirst(Comparator.comparing(InventoryItem::getPartNo));
        return comp.compare(this, o);
        // if (partNo == null) {
        //     return o.partNo == null ? 0 : -1;        Detta kan vara ett bättre sätt att skriva det på??
        // }
        // return partNo.compareTo(o.partNo);
    }

}