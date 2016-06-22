package org.spargonaut

import org.junit.Rule
import spock.lang.Specification
import org.springframework.boot.test.OutputCapture

class MyGroovyApplicationSpec extends Specification {

    @Rule
    OutputCapture capture = new OutputCapture()

    void 'should print hello world!'() {
        when:
        MyGroovyApplication.main()

        then:
        capture.toString() == 'Hello World!\n'
    }
}
