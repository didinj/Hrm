package hrm.entity;

import hrm.entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Pendidikan.class)
public class Pendidikan_ { 

    public static volatile SingularAttribute<Pendidikan, Long> id;
    public static volatile SingularAttribute<Pendidikan, String> sampai;
    public static volatile SingularAttribute<Pendidikan, String> jurusan;
    public static volatile SingularAttribute<Pendidikan, String> institusi;
    public static volatile SingularAttribute<Pendidikan, String> fakultas;
    public static volatile SingularAttribute<Pendidikan, String> gelar;
    public static volatile SingularAttribute<Pendidikan, String> dari;
    public static volatile SingularAttribute<Pendidikan, String> jenjang;
    public static volatile SingularAttribute<Pendidikan, Employee> employee;

}