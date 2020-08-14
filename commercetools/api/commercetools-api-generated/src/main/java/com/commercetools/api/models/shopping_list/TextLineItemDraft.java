package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.TextLineItemDraftImpl;

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
@JsonDeserialize(as = TextLineItemDraftImpl.class)
public interface TextLineItemDraft  {

    /**
    *  <p>Defaults to the current date and time.</p>
    */
    
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();
    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();
    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();
    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    /**
    *  <p>Defaults to <code>1</code>.</p>
    */
    
    @JsonProperty("quantity")
    public Integer getQuantity();

    public void setAddedAt(final ZonedDateTime addedAt);
    
    public void setCustom(final CustomFieldsDraft custom);
    
    public void setDescription(final LocalizedString description);
    
    public void setName(final LocalizedString name);
    
    public void setQuantity(final Integer quantity);

    public static TextLineItemDraftImpl of(){
        return new TextLineItemDraftImpl();
    }
    

    public static TextLineItemDraftImpl of(final TextLineItemDraft template) {
        TextLineItemDraftImpl instance = new TextLineItemDraftImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDescription(template.getDescription());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

}
