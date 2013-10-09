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
public class Tugas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tgltugas;
    private String dept;
    private String unit;
    private String subunit;
    private Integer regu;
    
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

    public Date getTgltugas() {
        return tgltugas;
    }

    public void setTgltugas(Date tgltugas) {
        this.tgltugas = tgltugas;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getRegu() {
        return regu;
    }

    public void setRegu(Integer regu) {
        this.regu = regu;
    }

    public String getSubunit() {
        return subunit;
    }

    public void setSubunit(String subunit) {
        this.subunit = subunit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
        if (!(object instanceof Tugas)) {
            return false;
        }
        Tugas other = (Tugas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Tugas[ id=" + id + " ]";
    }
    
}
