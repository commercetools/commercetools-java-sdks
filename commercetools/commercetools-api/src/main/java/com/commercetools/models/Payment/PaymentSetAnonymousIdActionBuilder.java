package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetAnonymousIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetAnonymousIdActionBuilder {
   
   @Nullable
   private String anonymousId;
   
   public PaymentSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }

   public PaymentSetAnonymousIdAction build() {
       return new PaymentSetAnonymousIdActionImpl(anonymousId);
   }
   
   public static PaymentSetAnonymousIdActionBuilder of() {
      return new PaymentSetAnonymousIdActionBuilder();
   }
   
   public static PaymentSetAnonymousIdActionBuilder of(final PaymentSetAnonymousIdAction template) {
      PaymentSetAnonymousIdActionBuilder builder = new PaymentSetAnonymousIdActionBuilder();
      builder.anonymousId = template.getAnonymousId();
      return builder;
   }
   
}