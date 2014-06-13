package com.gpachov.adf.foodrepo;

import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateful;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import oracle.binding.AttributeContext;
import oracle.binding.RowContext;

@Stateful(name = "SessionEJB", mappedName = "Application1-Persistence-SessionEJB")
public class SessionEJBBean implements SessionEJB, SessionEJBLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "Persistence", type = PersistenceContextType.EXTENDED)
    private EntityManager em;

    public SessionEJBBean() {
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Object queryByRange(String jpqlStmt, int firstResult, int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        return em.merge(entity);
    }

    public void removeProducts(Products products) {
        products = em.find(Products.class, products.getProductId());
        em.remove(products);
    }

    /** <code>select o from Products o</code> */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Products> getProductsFindAll() {
        return em.createNamedQuery("Products.findAll", Products.class).getResultList();
    }

    public void removeProductEntries(ProductEntries productEntries) {
        productEntries = em.find(ProductEntries.class, productEntries.getProductEntryId());
        em.remove(productEntries);
    }

    /** <code>select o from ProductEntries o</code> */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ProductEntries> getProductEntriesFindAll() {
        return em.createNamedQuery("ProductEntries.findAll", ProductEntries.class).getResultList();
    }

    public void removeRecipes(Recipes recipes) {
        recipes = em.find(Recipes.class, recipes.getRecipeId());
        em.remove(recipes);
    }

    /** <code>select o from Recipes o</code> */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Recipes> getRecipesFindAll() {
        return em.createNamedQuery("Recipes.findAll", Recipes.class).getResultList();
    }

    public boolean setAttributeValue(AttributeContext p0, Object p1) {
        return false;
    }

    public Object createRowData(RowContext p0) {
        return null;
    }

    public Object registerDataProvider(RowContext p0) {
        return null;
    }

    public boolean removeRowData(RowContext p0) {
        return false;
    }

    public void validate() {
    }
}
