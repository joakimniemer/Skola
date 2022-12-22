public class OvningFem {
    public static void main(String[] args) {
        Station st = new Station();

        while (true) {

            Observation observation = st.observationRequest();

            System.out.printf("%nObservation %d utfördes kl. %d:%d. Då var temperaturen: %.1f grader Celsius.\n",
                    observation.getId(), observation.getHour(), observation.getMinute(),
                    observation.getTemp());
            System.out.printf("Vinden blåset i %s riktning.\n", observation.windDir());

            try {
                Thread.sleep(55000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}