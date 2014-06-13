package com.gpachov.adf.foodrepo;

import java.util.List;

import javax.ejb.Local;

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
}
