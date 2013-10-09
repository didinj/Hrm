package hrm.entity;

import hrm.entity.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Mutasi.class)
public class Mutasi_ { 

    public static volatile SingularAttribute<Mutasi, Long> id;
    public static volatile SingularAttribute<Mutasi, String> kesubunit;
    public static volatile SingularAttribute<Mutasi, String> jenismutasi;
    public static volatile SingularAttribute<Mutasi, String> daridept;
    public static volatile SingularAttribute<Mutasi, String> keunit;
    public static volatile SingularAttribute<Mutasi, Date> tglmutasi;
    public static volatile SingularAttribute<Mutasi, String> kedept;
    public static volatile SingularAttribute<Mutasi, String> keterangan;
    public static volatile SingularAttribute<Mutasi, String> dariunit;
    public static volatile SingularAttribute<Mutasi, Employee> employee;
    public static volatile SingularAttribute<Mutasi, String> darisubunit;

}