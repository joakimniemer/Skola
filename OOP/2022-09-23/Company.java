public class Company {
    private String name;
    private String orgNo;
    private String nameCEO;
    private double totalAssets;
    private double totalDebt;

    public Company(String name, String orgNo, String nameCEO) {
        this.name = name;
        this.orgNo = orgNo;
        this.nameCEO = nameCEO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getNameCEO() {
        return nameCEO;
    }

    public void setNameCEO(String nameCEO) {
        this.nameCEO = nameCEO;
    }

    public double getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(double totalAssets) {
        this.totalAssets = totalAssets;
    }

    public double getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(double totalDebt) {
        this.totalDebt = totalDebt;
    }

    public String toString() {
        return String.format(
                "%s har organisationsnummer %s och dess VD heter %s.\nTotala tillgångar: %f.\nTotala skulder: %f.\n",
                name, orgNo, nameCEO, totalAssets, totalDebt);
    }

}
