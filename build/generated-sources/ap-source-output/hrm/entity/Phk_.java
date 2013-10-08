package hrm.entity;

import hrm.entity.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Phk.class)
public class Phk_ { 

    public static volatile SingularAttribute<Phk, Long> id;
    public static volatile SingularAttribute<Phk, Date> tglphk;
    public static volatile SingularAttribute<Phk, String> keterangan;
    public static volatile SingularAttribute<Phk, Employee> employee;
    public static volatile SingularAttribute<Phk, Date> tglperiksa;
    public static volatile SingularAttribute<Phk, Employee> pemeriksa;

}