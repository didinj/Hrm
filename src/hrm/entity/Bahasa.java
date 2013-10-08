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
public class Bahasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    private String bahasa;
    private String lisan;
    private String tulisan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getLisan() {
        return lisan;
    }

    public void setLisan(String lisan) {
        this.lisan = lisan;
    }

    public String getTulisan() {
        return tulisan;
    }

    public void setTulisan(String tulisan) {
        this.tulisan = tulisan;
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
        if (!(object instanceof Bahasa)) {
            return false;
        }
        Bahasa other = (Bahasa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hrm.entity.Bahasa[ id=" + id + " ]";
    }
}
