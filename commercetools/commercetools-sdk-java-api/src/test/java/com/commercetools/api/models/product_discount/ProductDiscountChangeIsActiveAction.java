package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveActionImpl;

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
@JsonDeserialize(as = ProductDiscountChangeIsActiveActionImpl.class)
public interface ProductDiscountChangeIsActiveAction extends ProductDiscountUpdateAction {

    String CHANGE_IS_ACTIVE = "changeIsActive";

    
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    
    public void setIsActive(final Boolean isActive);
    

    public static ProductDiscountChangeIsActiveAction of(){
        return new ProductDiscountChangeIsActiveActionImpl();
    }
    

    public static ProductDiscountChangeIsActiveAction of(final ProductDiscountChangeIsActiveAction template) {
        ProductDiscountChangeIsActiveActionImpl instance = new ProductDiscountChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    public static ProductDiscountChangeIsActiveActionBuilder builder(){
        return ProductDiscountChangeIsActiveActionBuilder.of();
    }
    
    public static ProductDiscountChangeIsActiveActionBuilder builder(final ProductDiscountChangeIsActiveAction template){
        return ProductDiscountChangeIsActiveActionBuilder.of(template);
    }
    

    default <T> T withProductDiscountChangeIsActiveAction(Function<ProductDiscountChangeIsActiveAction, T> helper) {
        return helper.apply(this);
    }
}
