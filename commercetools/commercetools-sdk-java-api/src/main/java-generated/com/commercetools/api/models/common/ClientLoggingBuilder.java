package com.commercetools.api.models.common;

import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.common.ClientLogging;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ClientLoggingBuilder {

    @Nullable
    private String clientId;
    
    @Nullable
    private String externalUserId;
    
    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    @Nullable
    private String anonymousId;

    public ClientLoggingBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    public ClientLoggingBuilder externalUserId(@Nullable final String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    
    public ClientLoggingBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }
    
    public ClientLoggingBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getClientId(){
        return this.clientId;
    }
    
    @Nullable
    public String getExternalUserId(){
        return this.externalUserId;
    }
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    @Nullable
    public String getAnonymousId(){
        return this.anonymousId;
    }

    public ClientLogging build() {
        return new ClientLoggingImpl(clientId, externalUserId, customer, anonymousId);
    }

    public static ClientLoggingBuilder of() {
        return new ClientLoggingBuilder();
    }

    public static ClientLoggingBuilder of(final ClientLogging template) {
        ClientLoggingBuilder builder = new ClientLoggingBuilder();
        builder.clientId = template.getClientId();
        builder.externalUserId = template.getExternalUserId();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
