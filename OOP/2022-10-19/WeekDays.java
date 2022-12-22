public enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public String toString() {
        switch (this) {
            case MONDAY:
                return "måndag";
            case TUESDAY:
                return "tisdag";
            case WEDNESDAY:
                return "onsdag";
            case THURSDAY:
                return "torsdag";
            case FRIDAY:
                return "fredag";
            case SATURDAY:
                return "lördag";
            case SUNDAY:
                return "söndag";
        }

        return String.format("%s", this);
    }
}
