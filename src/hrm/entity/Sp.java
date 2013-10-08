/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrm.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author DIDIN
 */
@Entity
public class Sp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    private String jenissp;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglmulai;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglakhir;
    private String keterangan;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglperiksa;
    @ManyToOne
    @JoinColumn(name = "PEMERIKSA_ID")
    private Employee pemeriksa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getJenissp() {
        return jenissp;
    }

    public void setJenissp(String jenissp) {
        this.jenissp = jenissp;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Employee getPemeriksa() {
        return pemeriksa;
    }

    public void setPemeriksa(Employee pemeriksa) {
        this.pemeriksa = pemeriksa;
    }

    public Date getTglakhir() {
        return tglakhir;
    }

    public void setTglakhir(Date tglakhir) {
        this.tglakhir = tglakhir;
    }

    public Date getTglmulai() {
        return tglmulai;
    }

    public void setTglmulai(Date tglmulai) {
        this.tglmulai = tglmulai;
    }

    public Date getTglperiksa() {
        return tglperiksa;
    }

    public void setTglperiksa(Date tglperiksa) {
        this.tglperiksa = tglperiksa;
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
        if (!(object instanceof Sp)) {
            return false;
        }
        Sp other = (Sp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Sp[ id=" + id + " ]";
    }
    
}
