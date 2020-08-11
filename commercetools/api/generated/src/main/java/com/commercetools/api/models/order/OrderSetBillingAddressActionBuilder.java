package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetBillingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetBillingAddressActionBuilder {

   @Nullable
   private com.commercetools.api.models.common.Address address;

   public OrderSetBillingAddressActionBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }

   public OrderSetBillingAddressAction build() {
       return new OrderSetBillingAddressActionImpl(address);
   }

   public static OrderSetBillingAddressActionBuilder of() {
      return new OrderSetBillingAddressActionBuilder();
   }

   public static OrderSetBillingAddressActionBuilder of(final OrderSetBillingAddressAction template) {
      OrderSetBillingAddressActionBuilder builder = new OrderSetBillingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }

}
