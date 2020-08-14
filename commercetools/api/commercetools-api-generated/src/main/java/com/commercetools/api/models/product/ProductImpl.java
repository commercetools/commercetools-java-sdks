package com.commercetools.api.models.product;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.product.ProductCatalogData;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductImpl implements Product {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private String key;
    
    private com.commercetools.api.models.product_type.ProductTypeReference productType;
    
    private com.commercetools.api.models.product.ProductCatalogData masterData;
    
    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;
    
    private com.commercetools.api.models.state.StateReference state;
    
    private com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics;

    @JsonCreator
    ProductImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("key") final String key, @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType, @JsonProperty("masterData") final com.commercetools.api.models.product.ProductCatalogData masterData, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory, @JsonProperty("state") final com.commercetools.api.models.state.StateReference state, @JsonProperty("reviewRatingStatistics") final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.productType = productType;
        this.masterData = masterData;
        this.taxCategory = taxCategory;
        this.state = state;
        this.reviewRatingStatistics = reviewRatingStatistics;
    }
    public ProductImpl() {
       
    }

    /**
    *  <p>The unique ID of the product.</p>
    */
    public String getId(){
        return this.id;
    }
    
    /**
    *  <p>The current version of the product.</p>
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
    
    /**
    *  <p>User-specific unique identifier for the product.
    *  <em>Product keys are different from product variant keys.</em></p>
    */
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.product_type.ProductTypeReference getProductType(){
        return this.productType;
    }
    
    /**
    *  <p>The product data in the master catalog.</p>
    */
    public com.commercetools.api.models.product.ProductCatalogData getMasterData(){
        return this.masterData;
    }
    
    
    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory(){
        return this.taxCategory;
    }
    
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }
    
    /**
    *  <p>Statistics about the review ratings taken into account for this product.</p>
    */
    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
        return this.reviewRatingStatistics;
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
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType){
        this.productType = productType;
    }
    
    public void setMasterData(final com.commercetools.api.models.product.ProductCatalogData masterData){
        this.masterData = masterData;
    }
    
    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory){
        this.taxCategory = taxCategory;
    }
    
    public void setState(final com.commercetools.api.models.state.StateReference state){
        this.state = state;
    }
    
    public void setReviewRatingStatistics(final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics){
        this.reviewRatingStatistics = reviewRatingStatistics;
    }

}
