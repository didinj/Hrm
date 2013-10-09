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
public class Unit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy="unit") 
    private List<Subunit> subunits;
    private String kodeunit;
    private String namaunit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodeunit() {
        return kodeunit;
    }

    public void setKodeunit(String kodeunit) {
        this.kodeunit = kodeunit;
    }

    public String getNamaunit() {
        return namaunit;
    }

    public void setNamaunit(String namaunit) {
        this.namaunit = namaunit;
    }

    public List<Subunit> getSubunits() {
        return subunits;
    }

    public void setSubunits(List<Subunit> subunits) {
        this.subunits = subunits;
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
        if (!(object instanceof Unit)) {
            return false;
        }
        Unit other = (Unit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Unit[ id=" + id + " ]";
    }
    
}
