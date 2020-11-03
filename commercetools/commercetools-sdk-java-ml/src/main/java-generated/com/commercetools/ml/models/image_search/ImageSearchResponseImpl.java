package com.commercetools.ml.models.image_search;

import com.commercetools.ml.models.image_search.ResultItem;
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


/**
*  <p>Response format from image search endpoint.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageSearchResponseImpl implements ImageSearchResponse {

    private Integer count;
    
    private Double offset;
    
    private Integer total;
    
    private java.util.List<com.commercetools.ml.models.image_search.ResultItem> results;

    @JsonCreator
    ImageSearchResponseImpl(@JsonProperty("count") final Integer count, @JsonProperty("offset") final Double offset, @JsonProperty("total") final Integer total, @JsonProperty("results") final java.util.List<com.commercetools.ml.models.image_search.ResultItem> results) {
        this.count = count;
        this.offset = offset;
        this.total = total;
        this.results = results;
    }
    public ImageSearchResponseImpl() {
       
    }

    /**
    *  <p>The maximum number of results to return from a query.</p>
    */
    public Integer getCount(){
        return this.count;
    }
    
    /**
    *  <p>The offset into the results matching the query. An offset of 0 is the default value indicating that no results should be skipped.</p>
    */
    public Double getOffset(){
        return this.offset;
    }
    
    /**
    *  <p>The total number of product images that were have been analyzed.</p>
    */
    public Integer getTotal(){
        return this.total;
    }
    
    /**
    *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
    */
    public java.util.List<com.commercetools.ml.models.image_search.ResultItem> getResults(){
        return this.results;
    }

    public void setCount(final Integer count){
        this.count = count;
    }
    
    public void setOffset(final Double offset){
        this.offset = offset;
    }
    
    public void setTotal(final Integer total){
        this.total = total;
    }
    
    public void setResults(final com.commercetools.ml.models.image_search.ResultItem ...results){
       this.results = new ArrayList<>(Arrays.asList(results));
    }
    
    public void setResults(final java.util.List<com.commercetools.ml.models.image_search.ResultItem> results){
       this.results = results;
    }

}
