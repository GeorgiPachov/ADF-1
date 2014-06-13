package com.gpachov.adf.foodrepo;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.persistence.OneToMany;

import javax.xml.bind.annotation.XmlTransient;

@Entity
@NamedQueries({ @NamedQuery(name = "Products.findAll", query = "select o from Products o") })
public class Products implements Serializable {
    private static final long serialVersionUID = 6780508351383829741L;
    @Column(name = "CALORIES_PER_GRAM")
    private BigDecimal caloriesPerGram;
    @Column(name = "GRAMS_PER_UNIT")
    private BigDecimal gramsPerUnit;
    @Column(length = 20)
    private String name;
    @Column(name = "PRODUCT_ENTRY_ID", nullable = false)
    private Long productEntryId;
    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;
    @XmlTransient
    @OneToMany(mappedBy = "products", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ProductEntries> productEntriesList;

    public Products() {
    }

    public Products(BigDecimal caloriesPerGram, BigDecimal gramsPerUnit, String name, Long productEntryId,
                    Long productId) {
        this.caloriesPerGram = caloriesPerGram;
        this.gramsPerUnit = gramsPerUnit;
        this.name = name;
        this.productEntryId = productEntryId;
        this.productId = productId;
    }


    public BigDecimal getCaloriesPerGram() {
        return caloriesPerGram;
    }

    public void setCaloriesPerGram(BigDecimal caloriesPerGram) {
        this.caloriesPerGram = caloriesPerGram;
    }

    public BigDecimal getGramsPerUnit() {
        return gramsPerUnit;
    }

    public void setGramsPerUnit(BigDecimal gramsPerUnit) {
        this.gramsPerUnit = gramsPerUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProductEntryId() {
        return productEntryId;
    }

    public void setProductEntryId(Long productEntryId) {
        this.productEntryId = productEntryId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @XmlTransient
    public List<ProductEntries> getProductEntriesList() {
        return productEntriesList;
    }

    @XmlTransient
    public void setProductEntriesList(List<ProductEntries> productEntriesList) {
        this.productEntriesList = productEntriesList;
    }

    public ProductEntries addProductEntries(ProductEntries productEntries) {
        getProductEntriesList().add(productEntries);
        productEntries.setProducts(this);
        return productEntries;
    }

    public ProductEntries removeProductEntries(ProductEntries productEntries) {
        getProductEntriesList().remove(productEntries);
        productEntries.setProducts(null);
        return productEntries;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("caloriesPerGram=");
        buffer.append(getCaloriesPerGram());
        buffer.append(',');
        buffer.append("gramsPerUnit=");
        buffer.append(getGramsPerUnit());
        buffer.append(',');
        buffer.append("name=");
        buffer.append(getName());
        buffer.append(',');
        buffer.append("productEntryId=");
        buffer.append(getProductEntryId());
        buffer.append(',');
        buffer.append("productId=");
        buffer.append(getProductId());
        buffer.append(']');
        return buffer.toString();
    }
}
