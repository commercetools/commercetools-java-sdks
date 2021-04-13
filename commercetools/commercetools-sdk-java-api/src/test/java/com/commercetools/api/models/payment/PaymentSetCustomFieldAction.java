package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.payment.PaymentSetCustomFieldActionImpl;

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
@JsonDeserialize(as = PaymentSetCustomFieldActionImpl.class)
public interface PaymentSetCustomFieldAction extends PaymentUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static PaymentSetCustomFieldAction of(){
        return new PaymentSetCustomFieldActionImpl();
    }
    

    public static PaymentSetCustomFieldAction of(final PaymentSetCustomFieldAction template) {
        PaymentSetCustomFieldActionImpl instance = new PaymentSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static PaymentSetCustomFieldActionBuilder builder(){
        return PaymentSetCustomFieldActionBuilder.of();
    }
    
    public static PaymentSetCustomFieldActionBuilder builder(final PaymentSetCustomFieldAction template){
        return PaymentSetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withPaymentSetCustomFieldAction(Function<PaymentSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
