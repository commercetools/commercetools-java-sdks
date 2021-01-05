package com.commercetools.api.models.order;

import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.order.PaymentInfoImpl;

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
@JsonDeserialize(as = PaymentInfoImpl.class)
public interface PaymentInfo  {

    
    @NotNull
    @Valid
    @JsonProperty("payments")
    public List<PaymentReference> getPayments();

    @JsonIgnore
    public void setPayments(final PaymentReference ...payments);
    public void setPayments(final List<PaymentReference> payments);

    public static PaymentInfo of(){
        return new PaymentInfoImpl();
    }
    

    public static PaymentInfo of(final PaymentInfo template) {
        PaymentInfoImpl instance = new PaymentInfoImpl();
        instance.setPayments(template.getPayments());
        return instance;
    }

    public static PaymentInfoBuilder builder(){
        return PaymentInfoBuilder.of();
    }
    
    public static PaymentInfoBuilder builder(final PaymentInfo template){
        return PaymentInfoBuilder.of(template);
    }
    

    default <T> T withPaymentInfo(Function<PaymentInfo, T> helper) {
        return helper.apply(this);
    }
}
