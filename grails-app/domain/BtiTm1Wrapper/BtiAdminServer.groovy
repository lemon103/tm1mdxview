package BtiTm1Wrapper

import com.applix.tm1.TM1Bean

class BtiAdminServer {
    String name
    Integer port
    TM1Bean bean

    static constraints = {
        name(blank:false, nullable:false, maxSize:50)
        port(min:1, max:65535)
    }

    

    String toString() {
        return name
    }
}
