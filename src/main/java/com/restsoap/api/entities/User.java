// default package
// Generated Apr 25, 2022, 7:19:32 PM by Hibernate Tools 6.0.0.Beta2
package com.restsoap.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
@XmlRootElement
@Entity
@Table(name = "user", catalog = "rest_soap", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User implements java.io.Serializable {

    private Integer id;
    private String name;
    private String gender;
    private String email;
    private String password;
    private String type;
    private Set<Cart> carts = new HashSet<Cart>(0);

    public User() {
    }

    public User(String email) {
        this.email = email;
    }

    public User(String name, String gender, String email, String password, String type, Set<Cart> carts) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.type = type;
        this.carts = carts;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "gender", length = 45)
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "email", unique = true, nullable = false, length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", length = 45)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "type", length = 45)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    // @ManyToMany(fetch = FetchType.EAGER)
    public Set<Cart> getCarts() {
        return this.carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

}
