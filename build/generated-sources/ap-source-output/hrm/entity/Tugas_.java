package hrm.entity;

import hrm.entity.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Tugas.class)
public class Tugas_ { 

    public static volatile SingularAttribute<Tugas, Long> id;
    public static volatile SingularAttribute<Tugas, String> unit;
    public static volatile SingularAttribute<Tugas, String> subunit;
    public static volatile SingularAttribute<Tugas, Date> tgltugas;
    public static volatile SingularAttribute<Tugas, Integer> regu;
    public static volatile SingularAttribute<Tugas, String> dept;
    public static volatile SingularAttribute<Tugas, Employee> employee;

}