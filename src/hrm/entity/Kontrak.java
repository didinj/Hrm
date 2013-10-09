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
public class Kontrak implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Employee employee;
    private Integer lama;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglmulai;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglakhir;

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

    public Integer getLama() {
        return lama;
    }

    public void setLama(Integer lama) {
        this.lama = lama;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kontrak)) {
            return false;
        }
        Kontrak other = (Kontrak) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Kontrak[ id=" + id + " ]";
    }
    
}
