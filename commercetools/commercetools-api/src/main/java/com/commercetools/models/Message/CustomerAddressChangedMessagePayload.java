package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.CustomerAddressChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerAddressChangedMessagePayloadImpl.class)
public interface CustomerAddressChangedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static CustomerAddressChangedMessagePayloadImpl of(){
      return new CustomerAddressChangedMessagePayloadImpl();
   }
   

   public static CustomerAddressChangedMessagePayloadImpl of(final CustomerAddressChangedMessagePayload template) {
      CustomerAddressChangedMessagePayloadImpl instance = new CustomerAddressChangedMessagePayloadImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}