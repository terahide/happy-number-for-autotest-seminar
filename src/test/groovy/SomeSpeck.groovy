

import happy.number.Solution
import spock.lang.Specification
import spock.lang.Unroll

class SomeSpeck extends Specification {
    @Unroll
    def "#number は happy? #expected"() {
        given:
        when:
        def actual = Solution.isHappy number
        then:
        actual == expected
        where:
        number | expected
        19     | true
        18     | false
        1      | true
        2      | false
        3      | false
        4      | false
        5      | false
        6      | false
        7      | false
        8      | false
        9      | false
    }
}
