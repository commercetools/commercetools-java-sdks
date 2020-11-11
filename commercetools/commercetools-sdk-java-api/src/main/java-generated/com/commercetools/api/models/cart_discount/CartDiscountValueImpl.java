package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueAbsolute;
import com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItem;
import com.commercetools.api.models.cart_discount.CartDiscountValueRelative;
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
public final class CartDiscountValueImpl implements CartDiscountValue {

    private String type;

    @JsonCreator
    CartDiscountValueImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    public CartDiscountValueImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }


}
