package com.commercetools.api.models.product;


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
public final class FacetResultRangeImpl implements FacetResultRange {

    private Double from;
    
    private String fromStr;
    
    private Double to;
    
    private String toStr;
    
    private Long count;
    
    private Long productCount;
    
    private Long total;
    
    private Double min;
    
    private Double max;
    
    private Double mean;

    @JsonCreator
    FacetResultRangeImpl(@JsonProperty("from") final Double from, @JsonProperty("fromStr") final String fromStr, @JsonProperty("to") final Double to, @JsonProperty("toStr") final String toStr, @JsonProperty("count") final Long count, @JsonProperty("productCount") final Long productCount, @JsonProperty("total") final Long total, @JsonProperty("min") final Double min, @JsonProperty("max") final Double max, @JsonProperty("mean") final Double mean) {
        this.from = from;
        this.fromStr = fromStr;
        this.to = to;
        this.toStr = toStr;
        this.count = count;
        this.productCount = productCount;
        this.total = total;
        this.min = min;
        this.max = max;
        this.mean = mean;
    }
    public FacetResultRangeImpl() {
    }

    
    public Double getFrom(){
        return this.from;
    }
    
    
    public String getFromStr(){
        return this.fromStr;
    }
    
    
    public Double getTo(){
        return this.to;
    }
    
    
    public String getToStr(){
        return this.toStr;
    }
    
    
    public Long getCount(){
        return this.count;
    }
    
    
    public Long getProductCount(){
        return this.productCount;
    }
    
    
    public Long getTotal(){
        return this.total;
    }
    
    
    public Double getMin(){
        return this.min;
    }
    
    
    public Double getMax(){
        return this.max;
    }
    
    
    public Double getMean(){
        return this.mean;
    }

    public void setFrom(final Double from){
        this.from = from;
    }
    
    public void setFromStr(final String fromStr){
        this.fromStr = fromStr;
    }
    
    public void setTo(final Double to){
        this.to = to;
    }
    
    public void setToStr(final String toStr){
        this.toStr = toStr;
    }
    
    public void setCount(final Long count){
        this.count = count;
    }
    
    public void setProductCount(final Long productCount){
        this.productCount = productCount;
    }
    
    public void setTotal(final Long total){
        this.total = total;
    }
    
    public void setMin(final Double min){
        this.min = min;
    }
    
    public void setMax(final Double max){
        this.max = max;
    }
    
    public void setMean(final Double mean){
        this.mean = mean;
    }

}
