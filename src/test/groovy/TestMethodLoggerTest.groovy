import org.junit.Rule
import org.junit.rules.TestRule
import spock.lang.Specification

class TestMethodLoggerTest extends Specification {

   @Rule
   TestRule logMethod = new TestMethodLogger()

   def "should log method"() {
      given:

      expect:
      println 'Executing test ...'
   }
}
