package hrm.entity;

import hrm.entity.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Kontrak.class)
public class Kontrak_ { 

    public static volatile SingularAttribute<Kontrak, Long> id;
    public static volatile SingularAttribute<Kontrak, Date> tglmulai;
    public static volatile SingularAttribute<Kontrak, Date> tglakhir;
    public static volatile SingularAttribute<Kontrak, Integer> lama;
    public static volatile SingularAttribute<Kontrak, Employee> employee;

}