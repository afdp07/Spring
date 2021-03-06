package sh.model;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Anghel Leonard
 */
@Entity
@Table(name = "thirdcategory")
@XmlRootElement
public class ThirdCategory {
    
    private static final long serialVersionUID = 1L;
     
    @Id
    @Basic(optional = false)
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Size(max = 50)
    @NotNull
    @Column(name = "name", nullable=false)
    private String name;        
    @ManyToOne
    @JoinColumn(name = "secondary_id")
    private SecondaryCategory secondary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecondaryCategory getSecondary() {
        return secondary;
    }

    public void setSecondary(SecondaryCategory secondary) {
        this.secondary = secondary;
    }
               
    public ThirdCategory() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThirdCategory other = (ThirdCategory) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ThirdCategory{" + "id=" + id + ", name=" + name + ", secondary=" + secondary + '}';
    }            
}
