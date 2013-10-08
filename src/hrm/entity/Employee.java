/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrm.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author DIDIN
 */
@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "SUBUNIT_ID")
    private Subunit subunit;
    private String nik;
    private String rfid;
    private String nama;
    private String jabatan;
    private Integer regu;
    @ManyToOne
    @JoinColumn(name = "DEPT_ID")
    private Dept dept;
    private String tempatlahir;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tgllahir;
    private String alamat;
    private String rt;
    private String rw;
    private String kelurahan;
    private String kecamatan;
    private String kota;
    private String propinsi;
    private String kodepos;
    private String telepon;
    private String hp;
    private String email;
    private String identitas;
    private String goldarah;
    private Integer tinggi;
    private Integer berat;
    private boolean status;
    @OneToMany(mappedBy = "employee")
    private List<Bahasa> bahasas;
    @OneToMany(mappedBy = "employee")
    private List<Pendidikan> pendidikans;
    @OneToMany(mappedBy = "employee")
    private List<Pekerjaan> pekerjaans;
    @OneToMany(mappedBy = "employee")
    private List<Keluarga> keluargas;
    @OneToMany(mappedBy = "employee")
    private List<Tugas> tugases;
    @OneToMany(mappedBy = "employee")
    private List<Mutasi> mutasis;
    @OneToOne(mappedBy = "employee")
    private Resign resign;
    @OneToOne(mappedBy = "employee")
    private Phk phk;
    @OneToOne(mappedBy = "employee")
    private Kontrak kontrak;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<Bahasa> getBahasas() {
        return bahasas;
    }

    public void setBahasas(List<Bahasa> bahasas) {
        this.bahasas = bahasas;
    }

    public Integer getBerat() {
        return berat;
    }

    public void setBerat(Integer berat) {
        this.berat = berat;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoldarah() {
        return goldarah;
    }

    public void setGoldarah(String goldarah) {
        this.goldarah = goldarah;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentitas() {
        return identitas;
    }

    public void setIdentitas(String identitas) {
        this.identitas = identitas;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public List<Keluarga> getKeluargas() {
        return keluargas;
    }

    public void setKeluargas(List<Keluarga> keluargas) {
        this.keluargas = keluargas;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKodepos() {
        return kodepos;
    }

    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    public Kontrak getKontrak() {
        return kontrak;
    }

    public void setKontrak(Kontrak kontrak) {
        this.kontrak = kontrak;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public List<Mutasi> getMutasis() {
        return mutasis;
    }

    public void setMutasis(List<Mutasi> mutasis) {
        this.mutasis = mutasis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public List<Pekerjaan> getPekerjaans() {
        return pekerjaans;
    }

    public void setPekerjaans(List<Pekerjaan> pekerjaans) {
        this.pekerjaans = pekerjaans;
    }

    public List<Pendidikan> getPendidikans() {
        return pendidikans;
    }

    public void setPendidikans(List<Pendidikan> pendidikans) {
        this.pendidikans = pendidikans;
    }

    public Phk getPhk() {
        return phk;
    }

    public void setPhk(Phk phk) {
        this.phk = phk;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    public Integer getRegu() {
        return regu;
    }

    public void setRegu(Integer regu) {
        this.regu = regu;
    }

    public Resign getResign() {
        return resign;
    }

    public void setResign(Resign resign) {
        this.resign = resign;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Subunit getSubunit() {
        return subunit;
    }

    public void setSubunit(Subunit subunit) {
        this.subunit = subunit;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }

    public Integer getTinggi() {
        return tinggi;
    }

    public void setTinggi(Integer tinggi) {
        this.tinggi = tinggi;
    }

    public List<Tugas> getTugases() {
        return tugases;
    }

    public void setTugases(List<Tugas> tugases) {
        this.tugases = tugases;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Employee[ id=" + id + " ]";
    }
}
