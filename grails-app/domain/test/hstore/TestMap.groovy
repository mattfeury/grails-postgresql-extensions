package test.hstore

import net.kaleidos.hibernate.postgresql.Hstore
import net.kaleidos.hibernate.usertype.HstoreType

class TestMap {

    // v1
    //Hstore hstore
    
    // v2
    Hstore testAttributes
    
    static constrains = {
    }

    static mapping = {
        testAttributes type:HstoreType
    }
}
