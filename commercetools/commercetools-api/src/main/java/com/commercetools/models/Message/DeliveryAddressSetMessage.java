package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.Message;
import java.lang.String;
import com.commercetools.models.message.DeliveryAddressSetMessageImpl;

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
@JsonDeserialize(as = DeliveryAddressSetMessageImpl.class)
public interface DeliveryAddressSetMessage extends Message {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   
   @Valid
   @JsonProperty("oldAddress")
   public Address getOldAddress();

   public void setDeliveryId(final String deliveryId);
   
   public void setAddress(final Address address);
   
   public void setOldAddress(final Address oldAddress);
   
   public static DeliveryAddressSetMessageImpl of(){
      return new DeliveryAddressSetMessageImpl();
   }
   

   public static DeliveryAddressSetMessageImpl of(final DeliveryAddressSetMessage template) {
      DeliveryAddressSetMessageImpl instance = new DeliveryAddressSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setOldAddress(template.getOldAddress());
      instance.setDeliveryId(template.getDeliveryId());
      instance.setAddress(template.getAddress());
      return instance;
   }

}