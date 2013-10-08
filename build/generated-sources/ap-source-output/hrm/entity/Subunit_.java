package hrm.entity;

import hrm.entity.Employee;
import hrm.entity.Unit;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Subunit.class)
public class Subunit_ { 

    public static volatile SingularAttribute<Subunit, Long> id;
    public static volatile SingularAttribute<Subunit, Unit> unit;
    public static volatile SingularAttribute<Subunit, String> namasubunit;
    public static volatile SingularAttribute<Subunit, String> alamatsubunit;
    public static volatile SingularAttribute<Subunit, String> kodesubunit;
    public static volatile ListAttribute<Subunit, Employee> employees;

}