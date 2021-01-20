
package com.commercetools.importapi.models.orders;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.orders.ItemShippingDetailsDraftImpl;
import com.commercetools.importapi.models.orders.ItemShippingTarget;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ItemShippingDetailsDraftImpl.class)
public interface ItemShippingDetailsDraft {

    /**
    *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    @JsonIgnore
    public void setTargets(final ItemShippingTarget... targets);

    public void setTargets(final List<ItemShippingTarget> targets);

    public static ItemShippingDetailsDraft of() {
        return new ItemShippingDetailsDraftImpl();
    }

    public static ItemShippingDetailsDraft of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
        instance.setTargets(template.getTargets());
        return instance;
    }

    public static ItemShippingDetailsDraftBuilder builder() {
        return ItemShippingDetailsDraftBuilder.of();
    }

    public static ItemShippingDetailsDraftBuilder builder(final ItemShippingDetailsDraft template) {
        return ItemShippingDetailsDraftBuilder.of(template);
    }

    default <T> T withItemShippingDetailsDraft(Function<ItemShippingDetailsDraft, T> helper) {
        return helper.apply(this);
    }
}
