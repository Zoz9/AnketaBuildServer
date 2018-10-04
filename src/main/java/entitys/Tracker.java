
package entitys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "trackerTb")
@XmlRootElement
public class Tracker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id_tracker")
    private int id;
    
    @Column(name= "dateTime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date date;
    
    //id_transport
    @ManyToOne
    @JoinColumn(name="id_transport")
    private Transport transport;
    
    //id_user
    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;
    
    @Column(name= "gps_position", nullable = false)
    private String gpsPosition;

    @Column(name= "fuel", nullable = false)
    private int fuel;
    
    @Column(name= "crop_weight", nullable = false)
    private int cropWeight;
    
    @Column(name= "speed", nullable = false)
    private int speed;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getGpsPosition() {
        return gpsPosition;
    }

    public void setGpsPosition(String gpsPosition) {
        this.gpsPosition = gpsPosition;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getCropWeight() {
        return cropWeight;
    }

    public void setCropWeight(int cropWeight) {
        this.cropWeight = cropWeight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
        if (!(object instanceof Tracker)) {
            return false;
        }
        Tracker other = (Tracker) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Tracker[ id=" + id + " ]";
    }
    
}
