package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.OrderBillingAddressSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderBillingAddressSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.common.Address oldAddress;
   
   @Nullable
   private com.commercetools.models.common.Address address;
   
   public OrderBillingAddressSetMessagePayloadBuilder oldAddress(@Nullable final com.commercetools.models.common.Address oldAddress) {
      this.oldAddress = oldAddress;
      return this;
   }
   
   public OrderBillingAddressSetMessagePayloadBuilder address(@Nullable final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getOldAddress(){
      return this.oldAddress;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public OrderBillingAddressSetMessagePayload build() {
       return new OrderBillingAddressSetMessagePayloadImpl(oldAddress, address);
   }
   
   public static OrderBillingAddressSetMessagePayloadBuilder of() {
      return new OrderBillingAddressSetMessagePayloadBuilder();
   }
   
   public static OrderBillingAddressSetMessagePayloadBuilder of(final OrderBillingAddressSetMessagePayload template) {
      OrderBillingAddressSetMessagePayloadBuilder builder = new OrderBillingAddressSetMessagePayloadBuilder();
      builder.oldAddress = template.getOldAddress();
      builder.address = template.getAddress();
      return builder;
   }
   
}