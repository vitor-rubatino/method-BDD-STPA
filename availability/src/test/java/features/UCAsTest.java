package features;

import com.intuit.karate.junit5.Karate;

class UCAsTest {
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
    
}
