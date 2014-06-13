package com.gpachov.adf.foodrepo.session;

import com.gpachov.adf.foodrepo.ProductEntries;
import com.gpachov.adf.foodrepo.Products;
import com.gpachov.adf.foodrepo.Recipes;

import java.util.List;

import javax.ejb.Remote;

import oracle.binding.AttributeContext;
import oracle.binding.RowContext;

@Remote
public interface SessionEJB {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);

    Products persistProducts(Products products);

    void removeProducts(Products products);

    List<Products> getProductsFindAll();

    ProductEntries persistProductEntries(ProductEntries productEntries);

    void removeProductEntries(ProductEntries productEntries);

    List<ProductEntries> getProductEntriesFindAll();

    Recipes persistRecipes(Recipes recipes);

    void removeRecipes(Recipes recipes);

    List<Recipes> getRecipesFindAll();

    boolean setAttributeValue(AttributeContext p0, Object p1);

    Object createRowData(RowContext p0);

    Object registerDataProvider(RowContext p0);

    boolean removeRowData(RowContext p0);

    void validate();
}
