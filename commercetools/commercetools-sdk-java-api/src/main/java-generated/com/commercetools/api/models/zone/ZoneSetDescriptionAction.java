
package com.commercetools.api.models.zone;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.zone.ZoneSetDescriptionActionImpl;
import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneSetDescriptionActionImpl.class)
public interface ZoneSetDescriptionAction extends ZoneUpdateAction {

    @JsonProperty("description")
    public String getDescription();

    public void setDescription(final String description);

    public static ZoneSetDescriptionAction of() {
        return new ZoneSetDescriptionActionImpl();
    }

    public static ZoneSetDescriptionAction of(final ZoneSetDescriptionAction template) {
        ZoneSetDescriptionActionImpl instance = new ZoneSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ZoneSetDescriptionActionBuilder builder() {
        return ZoneSetDescriptionActionBuilder.of();
    }

    public static ZoneSetDescriptionActionBuilder builder(final ZoneSetDescriptionAction template) {
        return ZoneSetDescriptionActionBuilder.of(template);
    }

    default <T> T withZoneSetDescriptionAction(Function<ZoneSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
