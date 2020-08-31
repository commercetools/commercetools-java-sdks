package com.commercetools.importapi.models.importsinks;

import com.commercetools.importapi.models.importsinks.ImportSink;
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


/**
*  <p>This type represents a paged importsink result.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSinkPagedResponseImpl implements ImportSinkPagedResponse {

    private Integer limit;
    
    private Long offset;
    
    private Long count;
    
    private java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> results;

    @JsonCreator
    ImportSinkPagedResponseImpl(@JsonProperty("limit") final Integer limit, @JsonProperty("offset") final Long offset, @JsonProperty("count") final Long count, @JsonProperty("results") final java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> results) {
        this.limit = limit;
        this.offset = offset;
        this.count = count;
        this.results = results;
    }
    public ImportSinkPagedResponseImpl() {
       
    }

    /**
    *  <p>The maximum number of import operations returned for a page.</p>
    */
    public Integer getLimit(){
        return this.limit;
    }
    
    /**
    *  <p>The offset supplied by the client or the server default. It is the number of elements skipped.</p>
    */
    public Long getOffset(){
        return this.offset;
    }
    
    /**
    *  <p>The actual number of results returned by this response.</p>
    */
    public Long getCount(){
        return this.count;
    }
    
    /**
    *  <p>The results for this paged response.</p>
    */
    public java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> getResults(){
        return this.results;
    }

    public void setLimit(final Integer limit){
        this.limit = limit;
    }
    
    public void setOffset(final Long offset){
        this.offset = offset;
    }
    
    public void setCount(final Long count){
        this.count = count;
    }
    
    public void setResults(final java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> results){
        this.results = results;
    }

}
