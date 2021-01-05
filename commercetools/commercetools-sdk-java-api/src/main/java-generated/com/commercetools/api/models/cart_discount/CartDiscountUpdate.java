package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateImpl;

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
@JsonDeserialize(as = CartDiscountUpdateImpl.class)
public interface CartDiscountUpdate extends com.commercetools.api.models.ResourceUpdate<CartDiscountUpdate, CartDiscountUpdateAction> {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CartDiscountUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final CartDiscountUpdateAction ...actions);
    public void setActions(final List<CartDiscountUpdateAction> actions);

    public static CartDiscountUpdate of(){
        return new CartDiscountUpdateImpl();
    }
    

    public static CartDiscountUpdate of(final CartDiscountUpdate template) {
        CartDiscountUpdateImpl instance = new CartDiscountUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static CartDiscountUpdateBuilder builder(){
        return CartDiscountUpdateBuilder.of();
    }
    
    public static CartDiscountUpdateBuilder builder(final CartDiscountUpdate template){
        return CartDiscountUpdateBuilder.of(template);
    }
    

    default <T> T withCartDiscountUpdate(Function<CartDiscountUpdate, T> helper) {
        return helper.apply(this);
    }
}
