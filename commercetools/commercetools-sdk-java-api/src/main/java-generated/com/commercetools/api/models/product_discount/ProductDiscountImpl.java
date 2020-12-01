package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.product_discount.ProductDiscountValue;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountImpl implements ProductDiscount {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private String key;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private com.commercetools.api.models.product_discount.ProductDiscountValue value;
    
    private String predicate;
    
    private String sortOrder;
    
    private Boolean isActive;
    
    private java.util.List<com.commercetools.api.models.common.Reference> references;
    
    private java.time.ZonedDateTime validFrom;
    
    private java.time.ZonedDateTime validUntil;

    @JsonCreator
    ProductDiscountImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("key") final String key, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("value") final com.commercetools.api.models.product_discount.ProductDiscountValue value, @JsonProperty("predicate") final String predicate, @JsonProperty("sortOrder") final String sortOrder, @JsonProperty("isActive") final Boolean isActive, @JsonProperty("references") final java.util.List<com.commercetools.api.models.common.Reference> references, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.name = name;
        this.key = key;
        this.description = description;
        this.value = value;
        this.predicate = predicate;
        this.sortOrder = sortOrder;
        this.isActive = isActive;
        this.references = references;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }
    public ProductDiscountImpl() {
    }

    /**
    *  <p>The unique ID of the product discount</p>
    */
    public String getId(){
        return this.id;
    }
    
    /**
    *  <p>The current version of the product discount.</p>
    */
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
    *  <p>User-specific unique identifier for a product discount.
    *  Must be unique across a project.</p>
    */
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    
    public com.commercetools.api.models.product_discount.ProductDiscountValue getValue(){
        return this.value;
    }
    
    /**
    *  <p>A valid ProductDiscount Predicate.</p>
    */
    public String getPredicate(){
        return this.predicate;
    }
    
    /**
    *  <p>The string contains a number between 0 and 1.
    *  A discount with greater sortOrder is prioritized higher than a discount with lower sortOrder.
    *  A sortOrder must be unambiguous.</p>
    */
    public String getSortOrder(){
        return this.sortOrder;
    }
    
    /**
    *  <p>Only active discount will be applied to product prices.</p>
    */
    public Boolean getIsActive(){
        return this.isActive;
    }
    
    /**
    *  <p>The platform will generate this array from the predicate.
    *  It contains the references of all the resources that are addressed in the predicate.</p>
    */
    public java.util.List<com.commercetools.api.models.common.Reference> getReferences(){
        return this.references;
    }
    
    /**
    *  <p>The time from which the discount should be effective.
    *  Please take Eventual Consistency into account for calculated product discount values.</p>
    */
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    /**
    *  <p>The time from which the discount should be ineffective.
    *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
    */
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setValue(final com.commercetools.api.models.product_discount.ProductDiscountValue value){
        this.value = value;
    }
    
    public void setPredicate(final String predicate){
        this.predicate = predicate;
    }
    
    public void setSortOrder(final String sortOrder){
        this.sortOrder = sortOrder;
    }
    
    public void setIsActive(final Boolean isActive){
        this.isActive = isActive;
    }
    
    public void setReferences(final com.commercetools.api.models.common.Reference ...references){
       this.references = new ArrayList<>(Arrays.asList(references));
    }
    
    public void setReferences(final java.util.List<com.commercetools.api.models.common.Reference> references){
       this.references = references;
    }
    
    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }
    
    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }

}
