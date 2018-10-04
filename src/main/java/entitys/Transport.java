
package entitys;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "transportTb")
@XmlRootElement
public class Transport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transport")
    private int id;
    
    @Column(name="transport_title", nullable = false)
    private String transportTitle;
    
    @Column(name="transport_num", nullable = false, unique = true)
    private String transportNum;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_user")
    private User user;
    
    @OneToMany(mappedBy = "transport", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Tracker> trackers = new HashSet<>();

    public Transport() {
    }

    public String getTransportTitle() {
        return transportTitle;
    }

    public Transport(String transportTitle, String transportNum) {
        this.transportTitle = transportTitle;
        this.transportNum = transportNum;
    }

    

    public Transport(String TransportTitle) {
        this.transportTitle = TransportTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @XmlTransient
    public Set<Tracker> getTrackers() {
        return trackers;
    }

    public void setTrackers(Set<Tracker> trackers) {
        this.trackers = trackers;
    }

    public String getTransportNum() {
        return transportNum;
    }

    public void setTransportNum(String transportNum) {
        this.transportNum = transportNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transport)) {
            return false;
        }
        Transport other = (Transport) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Transport[ id=" + id + " transport_title=" + transportTitle + " transport_num=" + transportNum + " ]";
    }
    
}
