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
public class Phk implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Employee employee;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglphk;
    private String keterangan;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglperiksa;
    @OneToOne
    @PrimaryKeyJoinColumn
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

    public Date getTglperiksa() {
        return tglperiksa;
    }

    public void setTglperiksa(Date tglperiksa) {
        this.tglperiksa = tglperiksa;
    }

    public Date getTglphk() {
        return tglphk;
    }

    public void setTglphk(Date tglphk) {
        this.tglphk = tglphk;
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
        if (!(object instanceof Phk)) {
            return false;
        }
        Phk other = (Phk) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Phk[ id=" + id + " ]";
    }
    
}
