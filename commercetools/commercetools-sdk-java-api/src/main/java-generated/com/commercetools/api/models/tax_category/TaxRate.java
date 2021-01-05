package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.SubRate;
import com.commercetools.api.models.tax_category.TaxRateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxRateImpl.class)
public interface TaxRate  {

    /**
    *  <p>The ID is always set if the tax rate is part of a TaxCategory.
    *  The external tax rates in a
    *  Cart do not contain an <code>id</code>.</p>
    */
    
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
    *  <p>Percentage in the range of [0..1].
    *  The sum of the amounts of all <code>subRates</code>, if there are any.</p>
    */
    @NotNull
    @JsonProperty("amount")
    public Double getAmount();
    
    @NotNull
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    @NotNull
    @JsonProperty("country")
    public String getCountry();
    /**
    *  <p>The state in the country</p>
    */
    
    @JsonProperty("state")
    public String getState();
    /**
    *  <p>For countries (e.g.
    *  the US) where the total tax is a combination of multiple taxes (e.g.
    *  state and local taxes).</p>
    */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    public void setId(final String id);
    
    public void setName(final String name);
    
    public void setAmount(final Double amount);
    
    public void setIncludedInPrice(final Boolean includedInPrice);
    
    public void setCountry(final String country);
    
    public void setState(final String state);
    
    @JsonIgnore
    public void setSubRates(final SubRate ...subRates);
    public void setSubRates(final List<SubRate> subRates);

    public static TaxRate of(){
        return new TaxRateImpl();
    }
    

    public static TaxRate of(final TaxRate template) {
        TaxRateImpl instance = new TaxRateImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        return instance;
    }

    public static TaxRateBuilder builder(){
        return TaxRateBuilder.of();
    }
    
    public static TaxRateBuilder builder(final TaxRate template){
        return TaxRateBuilder.of(template);
    }
    

    default <T> T withTaxRate(Function<TaxRate, T> helper) {
        return helper.apply(this);
    }
}
