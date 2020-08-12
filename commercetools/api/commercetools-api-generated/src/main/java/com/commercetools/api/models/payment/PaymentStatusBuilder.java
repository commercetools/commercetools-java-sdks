package com.commercetools.api.models.payment;

import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.payment.PaymentStatus;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentStatusBuilder {
   
   @Nullable
   private String interfaceCode;
   
   @Nullable
   private String interfaceText;
   
   @Nullable
   private com.commercetools.api.models.state.StateReference state;
   
   public PaymentStatusBuilder interfaceCode(@Nullable final String interfaceCode) {
      this.interfaceCode = interfaceCode;
      return this;
   }
   
   public PaymentStatusBuilder interfaceText(@Nullable final String interfaceText) {
      this.interfaceText = interfaceText;
      return this;
   }
   
   public PaymentStatusBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public String getInterfaceCode(){
      return this.interfaceCode;
   }
   
   @Nullable
   public String getInterfaceText(){
      return this.interfaceText;
   }
   
   @Nullable
   public com.commercetools.api.models.state.StateReference getState(){
      return this.state;
   }

   public PaymentStatus build() {
       return new PaymentStatusImpl(interfaceCode, interfaceText, state);
   }
   
   public static PaymentStatusBuilder of() {
      return new PaymentStatusBuilder();
   }
   
   public static PaymentStatusBuilder of(final PaymentStatus template) {
      PaymentStatusBuilder builder = new PaymentStatusBuilder();
      builder.interfaceCode = template.getInterfaceCode();
      builder.interfaceText = template.getInterfaceText();
      builder.state = template.getState();
      return builder;
   }
   
}
