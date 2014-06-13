package com.gpachov.adf.foodrepo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "ProductEntries.findAll", query = "select o from ProductEntries o") })
public class ProductEntries implements Serializable {
    public ProductEntries() {
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append(']');
        return buffer.toString();
    }
}
