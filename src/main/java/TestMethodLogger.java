import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.String.format;

public class TestMethodLogger extends TestWatcher {

   final static String SEP = "----------------------------------------------------------------------------------";

   @Override
   protected void starting(Description description) {
      Logger log = LoggerFactory.getLogger(description.getClassName());
      log.info(SEP);
      log.info(format("Running: %s", description.getMethodName()));
      log.info(SEP);
   }

   @Override
   protected void succeeded(Description description) {
      Logger log = LoggerFactory.getLogger(description.getClassName());
      log.info(SEP);
      log.info(format("Finished: %s", description.getMethodName()));
      log.info(SEP);
   }

   @Override
   protected void failed(Throwable e, Description description) {
      Logger log = LoggerFactory.getLogger(description.getClassName());
      log.error(SEP);
      log.error(format("Error: %s", description.getMethodName()));
      log.error(SEP);
   }
}

