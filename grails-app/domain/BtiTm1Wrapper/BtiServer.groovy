package BtiTm1Wrapper

import com.applix.tm1.TM1Server

class BtiServer {
    String name
    String user
    String password
    TM1Server server

    static constraints = {
        name(blank:false, nullable:false, maxSize:50)
        user(nullable:false)
        password(nullable:false)
    }

    static belongsTo = [adminServer:BtiAdminServer]
    static hasMany = [mdxViews:BtiMdxView]

    String toString() {
        return name
    }
}
