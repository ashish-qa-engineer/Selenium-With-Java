package Log4j2;
import org.apache.logging.log4j.*;


public class Logger {
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		org.apache.logging.log4j.Logger log = LogManager.getLogger("LoggerDemo");
		System.out.println("This is logger demo");
		
		log.info("for info only");
		log.debug("for debug");
		log.error("error message");
		log.warn("warning message");
	}

}
