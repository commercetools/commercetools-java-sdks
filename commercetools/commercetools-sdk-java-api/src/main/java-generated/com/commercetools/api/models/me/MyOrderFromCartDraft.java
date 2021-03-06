
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyOrderFromCartDraftImpl.class)
public interface MyOrderFromCartDraft {

    /**
    *  <p>The unique ID of the cart from which an order is created.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    public void setId(final String id);

    public void setVersion(final Long version);

    public static MyOrderFromCartDraft of() {
        return new MyOrderFromCartDraftImpl();
    }

    public static MyOrderFromCartDraft of(final MyOrderFromCartDraft template) {
        MyOrderFromCartDraftImpl instance = new MyOrderFromCartDraftImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public static MyOrderFromCartDraftBuilder builder() {
        return MyOrderFromCartDraftBuilder.of();
    }

    public static MyOrderFromCartDraftBuilder builder(final MyOrderFromCartDraft template) {
        return MyOrderFromCartDraftBuilder.of(template);
    }

    default <T> T withMyOrderFromCartDraft(Function<MyOrderFromCartDraft, T> helper) {
        return helper.apply(this);
    }
}
