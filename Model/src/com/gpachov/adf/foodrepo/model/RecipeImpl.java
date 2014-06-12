package com.gpachov.adf.foodrepo.model;

import java.math.BigDecimal;

import java.sql.Blob;
import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 11 01:35:34 EEST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RecipeImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        RecipeId,
        Author,
        Title,
        Description,
        Timetomake,
        Text,
        CreateAt,
        UpdateAt,
        ProductEntryId,
        ProductEntries;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int RECIPEID = AttributesEnum.RecipeId.index();
    public static final int AUTHOR = AttributesEnum.Author.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int TIMETOMAKE = AttributesEnum.Timetomake.index();
    public static final int TEXT = AttributesEnum.Text.index();
    public static final int CREATEAT = AttributesEnum.CreateAt.index();
    public static final int UPDATEAT = AttributesEnum.UpdateAt.index();
    public static final int PRODUCTENTRYID = AttributesEnum.ProductEntryId.index();
    public static final int PRODUCTENTRIES = AttributesEnum.ProductEntries.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RecipeImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.gpachov.adf.foodrepo.model.Recipe");
    }

    /**
     * Gets the attribute value for RecipeId, using the alias name RecipeId.
     * @return the value of RecipeId
     */
    public BigDecimal getRecipeId() {
        return (BigDecimal) getAttributeInternal(RECIPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RecipeId.
     * @param value value to set the RecipeId
     */
    public void setRecipeId(BigDecimal value) {
        setAttributeInternal(RECIPEID, value);
    }

    /**
     * Gets the attribute value for Author, using the alias name Author.
     * @return the value of Author
     */
    public String getAuthor() {
        return (String) getAttributeInternal(AUTHOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Author.
     * @param value value to set the Author
     */
    public void setAuthor(String value) {
        setAttributeInternal(AUTHOR, value);
    }

    /**
     * Gets the attribute value for Title, using the alias name Title.
     * @return the value of Title
     */
    public String getTitle() {
        return (String) getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Title.
     * @param value value to set the Title
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for Timetomake, using the alias name Timetomake.
     * @return the value of Timetomake
     */
    public BigDecimal getTimetomake() {
        return (BigDecimal) getAttributeInternal(TIMETOMAKE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Timetomake.
     * @param value value to set the Timetomake
     */
    public void setTimetomake(BigDecimal value) {
        setAttributeInternal(TIMETOMAKE, value);
    }

    /**
     * Gets the attribute value for Text, using the alias name Text.
     * @return the value of Text
     */
    public Blob getText() {
        return (Blob) getAttributeInternal(TEXT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Text.
     * @param value value to set the Text
     */
    public void setText(Blob value) {
        setAttributeInternal(TEXT, value);
    }

    /**
     * Gets the attribute value for CreateAt, using the alias name CreateAt.
     * @return the value of CreateAt
     */
    public Timestamp getCreateAt() {
        return (Timestamp) getAttributeInternal(CREATEAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreateAt.
     * @param value value to set the CreateAt
     */
    public void setCreateAt(Timestamp value) {
        setAttributeInternal(CREATEAT, value);
    }

    /**
     * Gets the attribute value for UpdateAt, using the alias name UpdateAt.
     * @return the value of UpdateAt
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) getAttributeInternal(UPDATEAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdateAt.
     * @param value value to set the UpdateAt
     */
    public void setUpdateAt(Timestamp value) {
        setAttributeInternal(UPDATEAT, value);
    }

    /**
     * Gets the attribute value for ProductEntryId, using the alias name ProductEntryId.
     * @return the value of ProductEntryId
     */
    public BigDecimal getProductEntryId() {
        return (BigDecimal) getAttributeInternal(PRODUCTENTRYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductEntryId.
     * @param value value to set the ProductEntryId
     */
    public void setProductEntryId(BigDecimal value) {
        setAttributeInternal(PRODUCTENTRYID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getProductEntries() {
        return (EntityImpl) getAttributeInternal(PRODUCTENTRIES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setProductEntries(EntityImpl value) {
        setAttributeInternal(PRODUCTENTRIES, value);
    }


    /**
     * @param recipeId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal recipeId) {
        return new Key(new Object[] { recipeId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
