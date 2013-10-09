package hrm.entity;

import hrm.entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Keluarga.class)
public class Keluarga_ { 

    public static volatile SingularAttribute<Keluarga, Long> id;
    public static volatile SingularAttribute<Keluarga, Integer> usia;
    public static volatile SingularAttribute<Keluarga, String> pendidikan;
    public static volatile SingularAttribute<Keluarga, String> instansi;
    public static volatile SingularAttribute<Keluarga, String> hubungan;
    public static volatile SingularAttribute<Keluarga, String> nama;
    public static volatile SingularAttribute<Keluarga, Employee> employee;
    public static volatile SingularAttribute<Keluarga, String> pekerjaan;

}