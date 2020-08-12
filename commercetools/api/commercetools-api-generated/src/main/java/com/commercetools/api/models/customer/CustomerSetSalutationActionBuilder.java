package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetSalutationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetSalutationActionBuilder {
   
   @Nullable
   private String salutation;
   
   public CustomerSetSalutationActionBuilder salutation(@Nullable final String salutation) {
      this.salutation = salutation;
      return this;
   }
   
   @Nullable
   public String getSalutation(){
      return this.salutation;
   }

   public CustomerSetSalutationAction build() {
       return new CustomerSetSalutationActionImpl(salutation);
   }
   
   public static CustomerSetSalutationActionBuilder of() {
      return new CustomerSetSalutationActionBuilder();
   }
   
   public static CustomerSetSalutationActionBuilder of(final CustomerSetSalutationAction template) {
      CustomerSetSalutationActionBuilder builder = new CustomerSetSalutationActionBuilder();
      builder.salutation = template.getSalutation();
      return builder;
   }
   
}
