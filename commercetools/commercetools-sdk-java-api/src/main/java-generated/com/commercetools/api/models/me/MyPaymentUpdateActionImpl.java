
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyPaymentAddTransactionAction;
import com.commercetools.api.models.me.MyPaymentChangeAmountPlannedAction;
import com.commercetools.api.models.me.MyPaymentSetCustomFieldAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoNameAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentUpdateActionImpl implements MyPaymentUpdateAction {

    private String action;

    @JsonCreator
    MyPaymentUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    public MyPaymentUpdateActionImpl() {
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyPaymentUpdateActionImpl that = (MyPaymentUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}
