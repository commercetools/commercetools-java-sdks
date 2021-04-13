package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountSetValidFromAndUntilActionImpl.class)
public interface ProductDiscountSetValidFromAndUntilAction extends ProductDiscountUpdateAction {

    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();
    /**
    *  <p>The timeframe for which the discount should be effective.
    *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
    */
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    
    public void setValidFrom(final ZonedDateTime validFrom);
    
    
    
    public void setValidUntil(final ZonedDateTime validUntil);
    

    public static ProductDiscountSetValidFromAndUntilAction of(){
        return new ProductDiscountSetValidFromAndUntilActionImpl();
    }
    

    public static ProductDiscountSetValidFromAndUntilAction of(final ProductDiscountSetValidFromAndUntilAction template) {
        ProductDiscountSetValidFromAndUntilActionImpl instance = new ProductDiscountSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static ProductDiscountSetValidFromAndUntilActionBuilder builder(){
        return ProductDiscountSetValidFromAndUntilActionBuilder.of();
    }
    
    public static ProductDiscountSetValidFromAndUntilActionBuilder builder(final ProductDiscountSetValidFromAndUntilAction template){
        return ProductDiscountSetValidFromAndUntilActionBuilder.of(template);
    }
    

    default <T> T withProductDiscountSetValidFromAndUntilAction(Function<ProductDiscountSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }
}
