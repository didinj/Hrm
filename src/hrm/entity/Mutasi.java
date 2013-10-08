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
public class Mutasi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglmutasi;
    private String jenismutasi;
    private String daridept;
    private String kedept;
    private String dariunit;
    private String keunit;
    private String darisubunit;
    private String kesubunit;
    private String keterangan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDaridept() {
        return daridept;
    }

    public void setDaridept(String daridept) {
        this.daridept = daridept;
    }

    public String getDarisubunit() {
        return darisubunit;
    }

    public void setDarisubunit(String darisubunit) {
        this.darisubunit = darisubunit;
    }

    public String getDariunit() {
        return dariunit;
    }

    public void setDariunit(String dariunit) {
        this.dariunit = dariunit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getJenismutasi() {
        return jenismutasi;
    }

    public void setJenismutasi(String jenismutasi) {
        this.jenismutasi = jenismutasi;
    }

    public String getKedept() {
        return kedept;
    }

    public void setKedept(String kedept) {
        this.kedept = kedept;
    }

    public String getKesubunit() {
        return kesubunit;
    }

    public void setKesubunit(String kesubunit) {
        this.kesubunit = kesubunit;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeunit() {
        return keunit;
    }

    public void setKeunit(String keunit) {
        this.keunit = keunit;
    }

    public Date getTglmutasi() {
        return tglmutasi;
    }

    public void setTglmutasi(Date tglmutasi) {
        this.tglmutasi = tglmutasi;
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
        if (!(object instanceof Mutasi)) {
            return false;
        }
        Mutasi other = (Mutasi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Mutasi[ id=" + id + " ]";
    }
    
}
