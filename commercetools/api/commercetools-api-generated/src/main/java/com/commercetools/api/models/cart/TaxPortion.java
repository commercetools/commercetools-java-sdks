package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.cart.TaxPortionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = TaxPortionImpl.class)
public interface TaxPortion  {

   
   
   @JsonProperty("name")
   public String getName();
   /**
   *  <p>A number in the range [0..1]</p>
   */
   @NotNull
   @JsonProperty("rate")
   public Double getRate();
   
   @NotNull
   @Valid
   @JsonProperty("amount")
   public TypedMoney getAmount();

   public void setName(final String name);
   
   public void setRate(final Double rate);
   
   public void setAmount(final TypedMoney amount);
   
   public static TaxPortionImpl of(){
      return new TaxPortionImpl();
   }
   

   public static TaxPortionImpl of(final TaxPortion template) {
      TaxPortionImpl instance = new TaxPortionImpl();
      instance.setName(template.getName());
      instance.setRate(template.getRate());
      instance.setAmount(template.getAmount());
      return instance;
   }

}
