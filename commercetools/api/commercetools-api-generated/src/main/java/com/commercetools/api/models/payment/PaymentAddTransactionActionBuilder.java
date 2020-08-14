package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.TransactionDraft;
import com.commercetools.api.models.payment.PaymentAddTransactionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentAddTransactionActionBuilder {

    
    private com.commercetools.api.models.payment.TransactionDraft transaction;

    public PaymentAddTransactionActionBuilder transaction( final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
        return this;
    }

    
    public com.commercetools.api.models.payment.TransactionDraft getTransaction(){
        return this.transaction;
    }

    public PaymentAddTransactionAction build() {
        return new PaymentAddTransactionActionImpl(transaction);
    }

    public static PaymentAddTransactionActionBuilder of() {
        return new PaymentAddTransactionActionBuilder();
    }

    public static PaymentAddTransactionActionBuilder of(final PaymentAddTransactionAction template) {
        PaymentAddTransactionActionBuilder builder = new PaymentAddTransactionActionBuilder();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
