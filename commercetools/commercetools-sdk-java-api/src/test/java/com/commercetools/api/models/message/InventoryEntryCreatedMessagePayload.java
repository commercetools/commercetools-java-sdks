package com.commercetools.api.models.message;

import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = InventoryEntryCreatedMessagePayloadImpl.class)
public interface InventoryEntryCreatedMessagePayload extends MessagePayload {

    String INVENTORY_ENTRY_CREATED = "InventoryEntryCreated";

    
    @NotNull
    @Valid
    @JsonProperty("inventoryEntry")
    public InventoryEntry getInventoryEntry();

    
    public void setInventoryEntry(final InventoryEntry inventoryEntry);
    

    public static InventoryEntryCreatedMessagePayload of(){
        return new InventoryEntryCreatedMessagePayloadImpl();
    }
    

    public static InventoryEntryCreatedMessagePayload of(final InventoryEntryCreatedMessagePayload template) {
        InventoryEntryCreatedMessagePayloadImpl instance = new InventoryEntryCreatedMessagePayloadImpl();
        instance.setInventoryEntry(template.getInventoryEntry());
        return instance;
    }

    public static InventoryEntryCreatedMessagePayloadBuilder builder(){
        return InventoryEntryCreatedMessagePayloadBuilder.of();
    }
    
    public static InventoryEntryCreatedMessagePayloadBuilder builder(final InventoryEntryCreatedMessagePayload template){
        return InventoryEntryCreatedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withInventoryEntryCreatedMessagePayload(Function<InventoryEntryCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
