package com.commercetools.models.order;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderSetCustomLineItemShippingDetailsActionImpl;

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
@JsonDeserialize(as = OrderSetCustomLineItemShippingDetailsActionImpl.class)
public interface OrderSetCustomLineItemShippingDetailsAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static OrderSetCustomLineItemShippingDetailsActionImpl of(){
      return new OrderSetCustomLineItemShippingDetailsActionImpl();
   }
   

   public static OrderSetCustomLineItemShippingDetailsActionImpl of(final OrderSetCustomLineItemShippingDetailsAction template) {
      OrderSetCustomLineItemShippingDetailsActionImpl instance = new OrderSetCustomLineItemShippingDetailsActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setShippingDetails(template.getShippingDetails());
      return instance;
   }

}