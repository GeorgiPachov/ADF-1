package com.gpachov.adf.foodrepo;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.XmlTransient;

@Entity
@NamedQueries({ @NamedQuery(name = "Recipes.findAll", query = "select o from Recipes o") })
public class Recipes implements Serializable {
    private static final long serialVersionUID = -7406424857260428556L;
    @Column(length = 20)
    private String author;
    @Column(name = "CREATE_AT")
    private Timestamp createAt;
    @Column(length = 20)
    private String description;
    @Id
    @Column(name = "RECIPE_ID", nullable = false)
    private Long recipeId;
    @Column(nullable = false)
    private byte[] text;
    private BigDecimal timetomake;
    @Column(nullable = false, length = 20)
    private String title;
    @Column(name = "UPDATE_AT")
    private Timestamp updateAt;
    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ENTRY_ID")
    private ProductEntries productEntries;

    public Recipes() {
    }

    public Recipes(String author, Timestamp createAt, String description, ProductEntries productEntries, Long recipeId,
                   BigDecimal timetomake, String title, Timestamp updateAt) {
        this.author = author;
        this.createAt = createAt;
        this.description = description;
        this.productEntries = productEntries;
        this.recipeId = recipeId;
        this.timetomake = timetomake;
        this.title = title;
        this.updateAt = updateAt;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public byte[] getText() {
        return text;
    }

    public void setText(byte[] text) {
        this.text = text;
    }

    public BigDecimal getTimetomake() {
        return timetomake;
    }

    public void setTimetomake(BigDecimal timetomake) {
        this.timetomake = timetomake;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @XmlTransient
    public ProductEntries getProductEntries() {
        return productEntries;
    }

    @XmlTransient
    public void setProductEntries(ProductEntries productEntries) {
        this.productEntries = productEntries;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("author=");
        buffer.append(getAuthor());
        buffer.append(',');
        buffer.append("createAt=");
        buffer.append(getCreateAt());
        buffer.append(',');
        buffer.append("description=");
        buffer.append(getDescription());
        buffer.append(',');
        buffer.append("recipeId=");
        buffer.append(getRecipeId());
        buffer.append(',');
        buffer.append("text=");
        buffer.append(getText());
        buffer.append(',');
        buffer.append("timetomake=");
        buffer.append(getTimetomake());
        buffer.append(',');
        buffer.append("title=");
        buffer.append(getTitle());
        buffer.append(',');
        buffer.append("updateAt=");
        buffer.append(getUpdateAt());
        buffer.append(']');
        return buffer.toString();
    }
}
