/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.business;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jimmy
 */

@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findByUserID", query = "SELECT u FROM User u WHERE u.userID = :userID")
    , @NamedQuery(name = "User.findByFirstName", query = "SELECT u FROM User u WHERE u.firstName = :firstName")
    , @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
    , @NamedQuery(name = "User.findByLastname", query = "SELECT u FROM User u WHERE u.lastname = :lastname")
    , @NamedQuery(name = "User.findByAddress1", query = "SELECT u FROM User u WHERE u.address1 = :address1")
    , @NamedQuery(name = "User.findByCity", query = "SELECT u FROM User u WHERE u.city = :city")
    , @NamedQuery(name = "User.findByCountry", query = "SELECT u FROM User u WHERE u.country = :country")
    , @NamedQuery(name = "User.findByCreditCardExpirationDate", query = "SELECT u FROM User u WHERE u.creditCardExpirationDate = :creditCardExpirationDate")
    , @NamedQuery(name = "User.findByCreditCardNumber", query = "SELECT u FROM User u WHERE u.creditCardNumber = :creditCardNumber")
    , @NamedQuery(name = "User.findByCreditCardType", query = "SELECT u FROM User u WHERE u.creditCardType = :creditCardType")
    , @NamedQuery(name = "User.findByState", query = "SELECT u FROM User u WHERE u.state = :state")
    , @NamedQuery(name = "User.findByZip", query = "SELECT u FROM User u WHERE u.zip = :zip")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userID")
    private Long userID;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "email")
    private String email;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "Address1")
    private String address1;
    @Column(name = "City")
    private String city;
    @Column(name = "Country")
    private String country;
    @Column(name = "CreditCardExpirationDate")
    private String creditCardExpirationDate;
    @Column(name = "CreditCardNumber")
    private String creditCardNumber;
    @Column(name = "CreditCardType")
    private String creditCardType;
    @Column(name = "state")
    private String state;
    @Column(name = "Zip")
    private String zip;
    @OneToMany(mappedBy = "userUserId")
    private Collection<Invoice> invoiceCollection;

    public User() {
        firstName = "";
        lastname = "";
        email = "";
        address1 = "";
        city = "";
        state = "";
        zip = "";
        country = "";
        creditCardType = "";
        creditCardNumber = "";
        creditCardExpirationDate = "";
    }

    public User(Long userID) {
        this.userID = userID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getAddressHTMLFormat() {
        String address = firstName + " " + lastname + "<br>";

        

        address += address1 + "<br>";

        

        address += city + ", " + state + " " + zip + "<br>"
                + country;

        return address;
    }


    public String getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }

    public void setCreditCardExpirationDate(String creditCardExpirationDate) {
        this.creditCardExpirationDate = creditCardExpirationDate;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @XmlTransient
    public Collection<Invoice> getInvoiceCollection() {
        return invoiceCollection;
    }

    public void setInvoiceCollection(Collection<Invoice> invoiceCollection) {
        this.invoiceCollection = invoiceCollection;
    }

   
    
}

