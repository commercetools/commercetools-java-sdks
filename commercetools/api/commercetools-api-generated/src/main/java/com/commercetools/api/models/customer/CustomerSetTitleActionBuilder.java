package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetTitleActionBuilder {
   
   @Nullable
   private String title;
   
   public CustomerSetTitleActionBuilder title(@Nullable final String title) {
      this.title = title;
      return this;
   }
   
   @Nullable
   public String getTitle(){
      return this.title;
   }

   public CustomerSetTitleAction build() {
       return new CustomerSetTitleActionImpl(title);
   }
   
   public static CustomerSetTitleActionBuilder of() {
      return new CustomerSetTitleActionBuilder();
   }
   
   public static CustomerSetTitleActionBuilder of(final CustomerSetTitleAction template) {
      CustomerSetTitleActionBuilder builder = new CustomerSetTitleActionBuilder();
      builder.title = template.getTitle();
      return builder;
   }
   
}
