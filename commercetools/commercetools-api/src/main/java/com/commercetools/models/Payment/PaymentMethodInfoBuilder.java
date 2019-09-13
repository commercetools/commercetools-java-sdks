package com.commercetools.models.payment;

import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.payment.PaymentMethodInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentMethodInfoBuilder {
   
   @Nullable
   private java.lang.String method;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private java.lang.String paymentInterface;
   
   public PaymentMethodInfoBuilder method(@Nullable final java.lang.String method) {
      this.method = method;
      return this;
   }
   
   public PaymentMethodInfoBuilder name(@Nullable final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public PaymentMethodInfoBuilder paymentInterface(@Nullable final java.lang.String paymentInterface) {
      this.paymentInterface = paymentInterface;
      return this;
   }
   
   @Nullable
   public java.lang.String getMethod(){
      return this.method;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getPaymentInterface(){
      return this.paymentInterface;
   }

   public PaymentMethodInfo build() {
       return new PaymentMethodInfoImpl(method, name, paymentInterface);
   }
   
   public static PaymentMethodInfoBuilder of() {
      return new PaymentMethodInfoBuilder();
   }
   
   public static PaymentMethodInfoBuilder of(final PaymentMethodInfo template) {
      PaymentMethodInfoBuilder builder = new PaymentMethodInfoBuilder();
      builder.method = template.getMethod();
      builder.name = template.getName();
      builder.paymentInterface = template.getPaymentInterface();
      return builder;
   }
   
}