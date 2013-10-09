package hrm.entity;

import hrm.entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Bahasa.class)
public class Bahasa_ { 

    public static volatile SingularAttribute<Bahasa, Long> id;
    public static volatile SingularAttribute<Bahasa, String> lisan;
    public static volatile SingularAttribute<Bahasa, String> tulisan;
    public static volatile SingularAttribute<Bahasa, String> bahasa;
    public static volatile SingularAttribute<Bahasa, Employee> employee;

}