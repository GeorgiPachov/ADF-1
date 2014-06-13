package com.gpachov.adf.foodrepo;

import java.util.List;

import javax.ejb.Local;

import oracle.binding.AttributeContext;
import oracle.binding.RowContext;

@Local
public interface SessionEJBLocal {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);

    void removeProducts(Products products);

    List<Products> getProductsFindAll();

    void removeProductEntries(ProductEntries productEntries);

    List<ProductEntries> getProductEntriesFindAll();

    void removeRecipes(Recipes recipes);

    List<Recipes> getRecipesFindAll();

    boolean setAttributeValue(AttributeContext p0, Object p1);

    Object createRowData(RowContext p0);

    Object registerDataProvider(RowContext p0);

    boolean removeRowData(RowContext p0);

    void validate();
}
