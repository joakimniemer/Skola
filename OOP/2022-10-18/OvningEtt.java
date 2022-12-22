import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OvningEtt {

    static final Logger logger = LoggerFactory.getLogger(OvningEtt.class);

    public static void main(String[] args) {

        int someData = 3;
        logger.debug("Detta är debugginfo");
        logger.info("Detta är bra information");
        logger.warn("Detta är en varning med data: {}", someData);

    }
}
