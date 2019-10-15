package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ZoneRateDraft;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.models.shipping_method.ShippingMethodDraftImpl;

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
@JsonDeserialize(as = ShippingMethodDraftImpl.class)
public interface ShippingMethodDraft  {

   
   
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("description")
   public String getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();
   
   @NotNull
   @Valid
   @JsonProperty("zoneRates")
   public List<ZoneRateDraft> getZoneRates();
   
   @NotNull
   @JsonProperty("isDefault")
   public Boolean getIsDefault();
   
   
   @JsonProperty("predicate")
   public String getPredicate();

   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setDescription(final String description);
   
   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public void setZoneRates(final List<ZoneRateDraft> zoneRates);
   
   public void setIsDefault(final Boolean isDefault);
   
   public void setPredicate(final String predicate);
   
   public static ShippingMethodDraftImpl of(){
      return new ShippingMethodDraftImpl();
   }
   

   public static ShippingMethodDraftImpl of(final ShippingMethodDraft template) {
      ShippingMethodDraftImpl instance = new ShippingMethodDraftImpl();
      instance.setZoneRates(template.getZoneRates());
      instance.setPredicate(template.getPredicate());
      instance.setIsDefault(template.getIsDefault());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setKey(template.getKey());
      instance.setTaxCategory(template.getTaxCategory());
      return instance;
   }

}