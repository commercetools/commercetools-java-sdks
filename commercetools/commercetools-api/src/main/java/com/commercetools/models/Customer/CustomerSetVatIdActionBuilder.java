package com.commercetools.models.customer;

import com.commercetools.models.customer.CustomerUpdateAction;
import com.commercetools.models.customer.CustomerSetVatIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetVatIdActionBuilder {
   
   @Nullable
   private String vatId;
   
   public CustomerSetVatIdActionBuilder vatId(@Nullable final String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   @Nullable
   public String getVatId(){
      return this.vatId;
   }

   public CustomerSetVatIdAction build() {
       return new CustomerSetVatIdActionImpl(vatId);
   }
   
   public static CustomerSetVatIdActionBuilder of() {
      return new CustomerSetVatIdActionBuilder();
   }
   
   public static CustomerSetVatIdActionBuilder of(final CustomerSetVatIdAction template) {
      CustomerSetVatIdActionBuilder builder = new CustomerSetVatIdActionBuilder();
      builder.vatId = template.getVatId();
      return builder;
   }
   
}