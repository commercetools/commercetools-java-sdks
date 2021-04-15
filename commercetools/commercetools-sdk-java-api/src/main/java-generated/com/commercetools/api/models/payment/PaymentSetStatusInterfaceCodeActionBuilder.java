package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentSetStatusInterfaceCodeActionBuilder {

    
    @Nullable
    private String interfaceCode;

    
    public PaymentSetStatusInterfaceCodeActionBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    
    @Nullable
    public String getInterfaceCode(){
        return this.interfaceCode;
    }

    public PaymentSetStatusInterfaceCodeAction build() {
        return new PaymentSetStatusInterfaceCodeActionImpl(interfaceCode);
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder of() {
        return new PaymentSetStatusInterfaceCodeActionBuilder();
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder of(final PaymentSetStatusInterfaceCodeAction template) {
        PaymentSetStatusInterfaceCodeActionBuilder builder = new PaymentSetStatusInterfaceCodeActionBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        return builder;
    }

}
