package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.tax_category.TaxRate;
import java.time.ZonedDateTime;
import com.commercetools.api.models.tax_category.TaxCategoryImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryImpl.class)
public interface TaxCategory extends BaseResource {

    /**
    *  <p>The unique ID of the category.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();
    /**
    *  <p>The current version of the category.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();
    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();
    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("description")
    public String getDescription();
    /**
    *  <p>The tax rates have unique IDs in the rates list</p>
    */
    @NotNull
    @Valid
    @JsonProperty("rates")
    public List<TaxRate> getRates();
    /**
    *  <p>User-specific unique identifier for the category.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);
    
    public void setVersion(final Long version);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
    
    public void setCreatedBy(final CreatedBy createdBy);
    
    public void setName(final String name);
    
    public void setDescription(final String description);
    
    public void setRates(final List<TaxRate> rates);
    
    public void setKey(final String key);

    public static TaxCategoryImpl of(){
        return new TaxCategoryImpl();
    }
    

    public static TaxCategoryImpl of(final TaxCategory template) {
        TaxCategoryImpl instance = new TaxCategoryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setRates(template.getRates());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T extends Accessor<TaxCategory>> T withTaxCategory(Function<TaxCategory, T> helper) {
        return helper.apply(this);
    }
}
