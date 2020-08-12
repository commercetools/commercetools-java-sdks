package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.customer.CustomerSetStoresAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetStoresActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;
   
   public CustomerSetStoresActionBuilder stores(@Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
      this.stores = stores;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores(){
      return this.stores;
   }

   public CustomerSetStoresAction build() {
       return new CustomerSetStoresActionImpl(stores);
   }
   
   public static CustomerSetStoresActionBuilder of() {
      return new CustomerSetStoresActionBuilder();
   }
   
   public static CustomerSetStoresActionBuilder of(final CustomerSetStoresAction template) {
      CustomerSetStoresActionBuilder builder = new CustomerSetStoresActionBuilder();
      builder.stores = template.getStores();
      return builder;
   }
   
}
