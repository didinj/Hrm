/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrm.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author DIDIN
 */
@Entity
public class Pekerjaan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    private String perusahaan;
    private String alamat;
    private String tglmasuk;
    private String tglkeluar;
    private String gajipokok;
    private String jabatan;
    private String alasanberhenti;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlasanberhenti() {
        return alasanberhenti;
    }

    public void setAlasanberhenti(String alasanberhenti) {
        this.alasanberhenti = alasanberhenti;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(String gajipokok) {
        this.gajipokok = gajipokok;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getTglkeluar() {
        return tglkeluar;
    }

    public void setTglkeluar(String tglkeluar) {
        this.tglkeluar = tglkeluar;
    }

    public String getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(String tglmasuk) {
        this.tglmasuk = tglmasuk;
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
        if (!(object instanceof Pekerjaan)) {
            return false;
        }
        Pekerjaan other = (Pekerjaan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Pekerjaan[ id=" + id + " ]";
    }
    
}
