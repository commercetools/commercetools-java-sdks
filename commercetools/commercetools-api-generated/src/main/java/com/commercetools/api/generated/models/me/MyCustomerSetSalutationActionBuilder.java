package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerSetSalutationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetSalutationActionBuilder {
   
   @Nullable
   private String salutation;
   
   public MyCustomerSetSalutationActionBuilder salutation(@Nullable final String salutation) {
      this.salutation = salutation;
      return this;
   }
   
   @Nullable
   public String getSalutation(){
      return this.salutation;
   }

   public MyCustomerSetSalutationAction build() {
       return new MyCustomerSetSalutationActionImpl(salutation);
   }
   
   public static MyCustomerSetSalutationActionBuilder of() {
      return new MyCustomerSetSalutationActionBuilder();
   }
   
   public static MyCustomerSetSalutationActionBuilder of(final MyCustomerSetSalutationAction template) {
      MyCustomerSetSalutationActionBuilder builder = new MyCustomerSetSalutationActionBuilder();
      builder.salutation = template.getSalutation();
      return builder;
   }
   
}