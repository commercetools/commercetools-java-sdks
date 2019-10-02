package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyCustomerUpdateAction;
import com.commercetools.models.me.MyCustomerChangeAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerChangeAddressActionBuilder {
   
   
   private com.commercetools.models.common.Address address;
   
   
   private String addressId;
   
   public MyCustomerChangeAddressActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public MyCustomerChangeAddressActionBuilder addressId( final String addressId) {
      this.addressId = addressId;
      return this;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public MyCustomerChangeAddressAction build() {
       return new MyCustomerChangeAddressActionImpl(address, addressId);
   }
   
   public static MyCustomerChangeAddressActionBuilder of() {
      return new MyCustomerChangeAddressActionBuilder();
   }
   
   public static MyCustomerChangeAddressActionBuilder of(final MyCustomerChangeAddressAction template) {
      MyCustomerChangeAddressActionBuilder builder = new MyCustomerChangeAddressActionBuilder();
      builder.address = template.getAddress();
      builder.addressId = template.getAddressId();
      return builder;
   }
   
}