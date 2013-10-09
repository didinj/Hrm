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
public class Resign implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Employee employee;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglberhenti;
    private String keterangan;

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

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Date getTglberhenti() {
        return tglberhenti;
    }

    public void setTglberhenti(Date tglberhenti) {
        this.tglberhenti = tglberhenti;
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
        if (!(object instanceof Resign)) {
            return false;
        }
        Resign other = (Resign) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Resign[ id=" + id + " ]";
    }
    
}
