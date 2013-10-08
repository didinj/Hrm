package hrm.entity;

import hrm.entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Pekerjaan.class)
public class Pekerjaan_ { 

    public static volatile SingularAttribute<Pekerjaan, Long> id;
    public static volatile SingularAttribute<Pekerjaan, String> perusahaan;
    public static volatile SingularAttribute<Pekerjaan, String> jabatan;
    public static volatile SingularAttribute<Pekerjaan, Employee> employee;
    public static volatile SingularAttribute<Pekerjaan, String> alamat;
    public static volatile SingularAttribute<Pekerjaan, String> tglmasuk;
    public static volatile SingularAttribute<Pekerjaan, String> alasanberhenti;
    public static volatile SingularAttribute<Pekerjaan, String> tglkeluar;
    public static volatile SingularAttribute<Pekerjaan, String> gajipokok;

}