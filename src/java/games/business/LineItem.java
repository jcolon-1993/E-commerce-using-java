/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.business;

import java.io.Serializable;
import java.text.NumberFormat;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jimmy
 */
@Entity
@Table(name = "lineitem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lineitem.findAll", query = "SELECT l FROM LineItem l")
    , @NamedQuery(name = "Lineitem.findByLineitemid", query = "SELECT l FROM LineItem l WHERE l.lineitemid = :lineitemid")
   , @NamedQuery(name = "Lineitem.findByQuantity", query = "SELECT l FROM LineItem l WHERE l.quantity = :quantity")})
public class LineItem implements Serializable {

    
    @Id
    @Basic(optional = false)
    @Column(name = "LINEITEMID")
    private Long lineitemid;
    
    @Column(name = "QUANTITY")
    private int quantity = 1;
    @JoinColumn(name = "PRODUCT_productID", referencedColumnName = "productID")
    @OneToOne
    private Products product;

    public LineItem() {
    }

    public Long getLineItemId() {
        return lineitemid;
    }

    public void setLineItemId(Long lineitemid) {
        this.lineitemid = lineitemid;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Products getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        double total = product.getPrice() * quantity;
        return total;
    }

    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
}
