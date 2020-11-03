package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountCodeState;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderDiscountCodeStateSetMessagePayloadBuilder {

    
    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;
    
    
    private com.commercetools.api.models.cart.DiscountCodeState state;
    
    @Nullable
    private com.commercetools.api.models.cart.DiscountCodeState oldState;

    public OrderDiscountCodeStateSetMessagePayloadBuilder discountCode( final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }
    
    public OrderDiscountCodeStateSetMessagePayloadBuilder state( final com.commercetools.api.models.cart.DiscountCodeState state) {
        this.state = state;
        return this;
    }
    
    public OrderDiscountCodeStateSetMessagePayloadBuilder oldState(@Nullable final com.commercetools.api.models.cart.DiscountCodeState oldState) {
        this.oldState = oldState;
        return this;
    }

    
    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode(){
        return this.discountCode;
    }
    
    
    public com.commercetools.api.models.cart.DiscountCodeState getState(){
        return this.state;
    }
    
    @Nullable
    public com.commercetools.api.models.cart.DiscountCodeState getOldState(){
        return this.oldState;
    }

    public OrderDiscountCodeStateSetMessagePayload build() {
        return new OrderDiscountCodeStateSetMessagePayloadImpl(discountCode, state, oldState);
    }

    public static OrderDiscountCodeStateSetMessagePayloadBuilder of() {
        return new OrderDiscountCodeStateSetMessagePayloadBuilder();
    }

    public static OrderDiscountCodeStateSetMessagePayloadBuilder of(final OrderDiscountCodeStateSetMessagePayload template) {
        OrderDiscountCodeStateSetMessagePayloadBuilder builder = new OrderDiscountCodeStateSetMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        return builder;
    }

}
