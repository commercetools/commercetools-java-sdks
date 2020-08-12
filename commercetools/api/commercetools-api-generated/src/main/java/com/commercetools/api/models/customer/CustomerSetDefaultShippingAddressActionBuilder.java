package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetDefaultShippingAddressActionBuilder {
   
   @Nullable
   private String addressId;
   
   @Nullable
   private String addressKey;
   
   public CustomerSetDefaultShippingAddressActionBuilder addressId(@Nullable final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   public CustomerSetDefaultShippingAddressActionBuilder addressKey(@Nullable final String addressKey) {
      this.addressKey = addressKey;
      return this;
   }
   
   @Nullable
   public String getAddressId(){
      return this.addressId;
   }
   
   @Nullable
   public String getAddressKey(){
      return this.addressKey;
   }

   public CustomerSetDefaultShippingAddressAction build() {
       return new CustomerSetDefaultShippingAddressActionImpl(addressId, addressKey);
   }
   
   public static CustomerSetDefaultShippingAddressActionBuilder of() {
      return new CustomerSetDefaultShippingAddressActionBuilder();
   }
   
   public static CustomerSetDefaultShippingAddressActionBuilder of(final CustomerSetDefaultShippingAddressAction template) {
      CustomerSetDefaultShippingAddressActionBuilder builder = new CustomerSetDefaultShippingAddressActionBuilder();
      builder.addressId = template.getAddressId();
      builder.addressKey = template.getAddressKey();
      return builder;
   }
   
}
