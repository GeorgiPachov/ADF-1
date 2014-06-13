package com.gpachov.adf.foodrepo;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlTransient;

@Entity
@NamedQueries({ @NamedQuery(name = "ProductEntries.findAll", query = "select o from ProductEntries o") })
@Table(name = "PRODUCT_ENTRIES")
public class ProductEntries implements Serializable {
    private static final long serialVersionUID = 5841228685338196076L;
    @Id
    @Column(name = "PRODUCT_ENTRY_ID", nullable = false)
    private Long productEntryId;
    private BigDecimal quantity;
    @XmlTransient
    @OneToMany(mappedBy = "productEntries", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Recipes> recipesList;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Products products;

    public ProductEntries() {
    }

    public ProductEntries(Long productEntryId, Products products, BigDecimal quantity) {
        this.productEntryId = productEntryId;
        this.products = products;
        this.quantity = quantity;
    }


    public Long getProductEntryId() {
        return productEntryId;
    }

    public void setProductEntryId(Long productEntryId) {
        this.productEntryId = productEntryId;
    }


    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @XmlTransient
    public List<Recipes> getRecipesList() {
        return recipesList;
    }

    @XmlTransient
    public void setRecipesList(List<Recipes> recipesList) {
        this.recipesList = recipesList;
    }

    public Recipes addRecipes(Recipes recipes) {
        getRecipesList().add(recipes);
        recipes.setProductEntries(this);
        return recipes;
    }

    public Recipes removeRecipes(Recipes recipes) {
        getRecipesList().remove(recipes);
        recipes.setProductEntries(null);
        return recipes;
    }

    @XmlTransient
    public Products getProducts() {
        return products;
    }

    @XmlTransient
    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("productEntryId=");
        buffer.append(getProductEntryId());
        buffer.append(',');
        buffer.append("quantity=");
        buffer.append(getQuantity());
        buffer.append(',');
        buffer.append(']');
        return buffer.toString();
    }
}
