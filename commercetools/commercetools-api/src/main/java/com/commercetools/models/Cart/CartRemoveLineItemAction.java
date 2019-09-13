package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.common.Money;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.cart.CartRemoveLineItemActionImpl;

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
@JsonDeserialize(as = CartRemoveLineItemActionImpl.class)
public interface CartRemoveLineItemAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();
   
   @Valid
   @JsonProperty("externalTotalPrice")
   public ExternalLineItemTotalPrice getExternalTotalPrice();
   
   @Valid
   @JsonProperty("shippingDetailsToRemove")
   public ItemShippingDetailsDraft getShippingDetailsToRemove();

   public void setLineItemId(final String lineItemId);
   
   public void setQuantity(final Integer quantity);
   
   public void setExternalPrice(final Money externalPrice);
   
   public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);
   
   public void setShippingDetailsToRemove(final ItemShippingDetailsDraft shippingDetailsToRemove);
   
   public static CartRemoveLineItemActionImpl of(){
      return new CartRemoveLineItemActionImpl();
   }
   

   public static CartRemoveLineItemActionImpl of(final CartRemoveLineItemAction template) {
      CartRemoveLineItemActionImpl instance = new CartRemoveLineItemActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setExternalTotalPrice(template.getExternalTotalPrice());
      instance.setLineItemId(template.getLineItemId());
      instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
      instance.setExternalPrice(template.getExternalPrice());
      return instance;
   }

}