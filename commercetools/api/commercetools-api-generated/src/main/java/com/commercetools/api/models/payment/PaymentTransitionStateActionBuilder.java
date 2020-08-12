package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.payment.PaymentTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentTransitionStateActionBuilder {
   
   
   private com.commercetools.api.models.state.StateResourceIdentifier state;
   
   @Nullable
   private Boolean force;
   
   public PaymentTransitionStateActionBuilder state( final com.commercetools.api.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   public PaymentTransitionStateActionBuilder force(@Nullable final Boolean force) {
      this.force = force;
      return this;
   }
   
   
   public com.commercetools.api.models.state.StateResourceIdentifier getState(){
      return this.state;
   }
   
   @Nullable
   public Boolean getForce(){
      return this.force;
   }

   public PaymentTransitionStateAction build() {
       return new PaymentTransitionStateActionImpl(state, force);
   }
   
   public static PaymentTransitionStateActionBuilder of() {
      return new PaymentTransitionStateActionBuilder();
   }
   
   public static PaymentTransitionStateActionBuilder of(final PaymentTransitionStateAction template) {
      PaymentTransitionStateActionBuilder builder = new PaymentTransitionStateActionBuilder();
      builder.state = template.getState();
      builder.force = template.getForce();
      return builder;
   }
   
}
