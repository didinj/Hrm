package hrm.entity;

import hrm.entity.Bahasa;
import hrm.entity.Dept;
import hrm.entity.Keluarga;
import hrm.entity.Kontrak;
import hrm.entity.Mutasi;
import hrm.entity.Pekerjaan;
import hrm.entity.Pendidikan;
import hrm.entity.Phk;
import hrm.entity.Resign;
import hrm.entity.Subunit;
import hrm.entity.Tugas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> identitas;
    public static volatile SingularAttribute<Employee, String> hp;
    public static volatile SingularAttribute<Employee, Integer> tinggi;
    public static volatile SingularAttribute<Employee, String> kota;
    public static volatile ListAttribute<Employee, Tugas> tugases;
    public static volatile SingularAttribute<Employee, Long> id;
    public static volatile SingularAttribute<Employee, String> jabatan;
    public static volatile SingularAttribute<Employee, Subunit> subunit;
    public static volatile SingularAttribute<Employee, String> kodepos;
    public static volatile SingularAttribute<Employee, Integer> regu;
    public static volatile SingularAttribute<Employee, String> nama;
    public static volatile SingularAttribute<Employee, Dept> dept;
    public static volatile SingularAttribute<Employee, Phk> phk;
    public static volatile ListAttribute<Employee, Keluarga> keluargas;
    public static volatile ListAttribute<Employee, Mutasi> mutasis;
    public static volatile SingularAttribute<Employee, Integer> berat;
    public static volatile SingularAttribute<Employee, String> propinsi;
    public static volatile ListAttribute<Employee, Pendidikan> pendidikans;
    public static volatile SingularAttribute<Employee, Boolean> status;
    public static volatile SingularAttribute<Employee, String> goldarah;
    public static volatile SingularAttribute<Employee, Resign> resign;
    public static volatile ListAttribute<Employee, Pekerjaan> pekerjaans;
    public static volatile SingularAttribute<Employee, String> kelurahan;
    public static volatile SingularAttribute<Employee, Kontrak> kontrak;
    public static volatile SingularAttribute<Employee, String> kecamatan;
    public static volatile SingularAttribute<Employee, String> rfid;
    public static volatile ListAttribute<Employee, Bahasa> bahasas;
    public static volatile SingularAttribute<Employee, Date> tgllahir;
    public static volatile SingularAttribute<Employee, String> email;
    public static volatile SingularAttribute<Employee, String> telepon;
    public static volatile SingularAttribute<Employee, String> tempatlahir;
    public static volatile SingularAttribute<Employee, String> rt;
    public static volatile SingularAttribute<Employee, String> alamat;
    public static volatile SingularAttribute<Employee, String> rw;
    public static volatile SingularAttribute<Employee, String> nik;

}