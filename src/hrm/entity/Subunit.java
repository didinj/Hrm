/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrm.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author DIDIN
 */
@Entity
public class Subunit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kodesubunit;
    private String namasubunit;
    private String alamatsubunit;
    @OneToMany(mappedBy="subunit")
    private List<Employee> employees;
    @ManyToOne
    @JoinColumn(name = "UNIT_ID")
    private Unit unit;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getAlamatsubunit() {
        return alamatsubunit;
    }

    public void setAlamatsubunit(String alamatsubunit) {
        this.alamatsubunit = alamatsubunit;
    }

    public List getEmployees() {
        return employees;
    }

    public void setEmployees(List employees) {
        this.employees = employees;
    }

    public String getKodesubunit() {
        return kodesubunit;
    }

    public void setKodesubunit(String kodesubunit) {
        this.kodesubunit = kodesubunit;
    }

    public String getNamasubunit() {
        return namasubunit;
    }

    public void setNamasubunit(String namasubunit) {
        this.namasubunit = namasubunit;
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
        if (!(object instanceof Subunit)) {
            return false;
        }
        Subunit other = (Subunit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Subunit[ id=" + id + " ]";
    }
    
}
