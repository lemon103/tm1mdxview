package BtiTm1Wrapper

import com.applix.tm1.TM1MdxView

class BtiMdxView {
    String name
    String mdx
    TM1MdxView mdxView

    static constraints = {
        name(blank:false, nullable:false, maxSize:50)
        mdx(blank:false, nullable:false)
    }

    static belongsTo = [adminServer:BtiAdminServer]
}
