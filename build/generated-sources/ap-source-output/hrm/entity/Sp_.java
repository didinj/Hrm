package hrm.entity;

import hrm.entity.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Sp.class)
public class Sp_ { 

    public static volatile SingularAttribute<Sp, Long> id;
    public static volatile SingularAttribute<Sp, String> jenissp;
    public static volatile SingularAttribute<Sp, Date> tglmulai;
    public static volatile SingularAttribute<Sp, Date> tglakhir;
    public static volatile SingularAttribute<Sp, String> keterangan;
    public static volatile SingularAttribute<Sp, Employee> employee;
    public static volatile SingularAttribute<Sp, Date> tglperiksa;
    public static volatile SingularAttribute<Sp, Employee> pemeriksa;

}