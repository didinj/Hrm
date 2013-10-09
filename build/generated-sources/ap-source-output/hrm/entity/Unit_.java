package hrm.entity;

import hrm.entity.Subunit;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Unit.class)
public class Unit_ { 

    public static volatile SingularAttribute<Unit, Long> id;
    public static volatile SingularAttribute<Unit, String> kodeunit;
    public static volatile ListAttribute<Unit, Subunit> subunits;
    public static volatile SingularAttribute<Unit, String> namaunit;

}