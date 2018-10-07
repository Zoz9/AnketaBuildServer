/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author zoz9
 */
@Entity
@Table (name = "flowerTb")
public class Flower implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_flower;

    public int getId() {
        return id_flower;
    }

    
    @Column(name = "flowerName")
    private String flowerName;
    
    @Column(name = "foto")
    private Blob foto;
    
    @Column(name = "dateLastGround")
    private Date dateLastGround;
    
    @Column(name = "Description")
    private String Description;

    @Column(name = "Ground")
    private String Ground;

    private User user;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @ManyToOne
    @JoinColumn(name = "id_user")
    
    public String getGround() {
        return Ground;
    }

    public void setGround(String Ground) {
        this.Ground = Ground;
    }
            
    public Flower() {
    }

    public Flower(String flowerName, Blob foto, Date dateLastGround, String Description, String Ground, User user) {
        this.flowerName = flowerName;
        this.foto = foto;
        this.dateLastGround = dateLastGround;
        this.Description = Description;
        this.Ground = Ground;
        this.user = user;
    }

    
    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public Date getDateLastGround() {
        return dateLastGround;
    }

    public void setDateLastGround(Date dateLastGround) {
        this.dateLastGround = dateLastGround;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    

    
    
    public void setId(int id_flower) {
        this.id_flower = id_flower;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id_flower;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flower)) {
            return false;
        }
        Flower other = (Flower) object;
        if (this.id_flower != other.id_flower) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitys.Flower[ id=" + id_flower + " ]";
    }
    
}
