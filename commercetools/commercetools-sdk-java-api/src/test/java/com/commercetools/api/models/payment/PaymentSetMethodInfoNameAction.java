package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionImpl;

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
@JsonDeserialize(as = PaymentSetMethodInfoNameActionImpl.class)
public interface PaymentSetMethodInfoNameAction extends PaymentUpdateAction {

    String SET_METHOD_INFO_NAME = "setMethodInfoName";

    /**
    *  <p>If not provided, the name is unset.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    
    public void setName(final LocalizedString name);
    

    public static PaymentSetMethodInfoNameAction of(){
        return new PaymentSetMethodInfoNameActionImpl();
    }
    

    public static PaymentSetMethodInfoNameAction of(final PaymentSetMethodInfoNameAction template) {
        PaymentSetMethodInfoNameActionImpl instance = new PaymentSetMethodInfoNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static PaymentSetMethodInfoNameActionBuilder builder(){
        return PaymentSetMethodInfoNameActionBuilder.of();
    }
    
    public static PaymentSetMethodInfoNameActionBuilder builder(final PaymentSetMethodInfoNameAction template){
        return PaymentSetMethodInfoNameActionBuilder.of(template);
    }
    

    default <T> T withPaymentSetMethodInfoNameAction(Function<PaymentSetMethodInfoNameAction, T> helper) {
        return helper.apply(this);
    }
}
