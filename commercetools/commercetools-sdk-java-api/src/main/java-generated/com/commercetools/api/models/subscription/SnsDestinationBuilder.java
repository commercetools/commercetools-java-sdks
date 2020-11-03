package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.SnsDestination;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SnsDestinationBuilder {

    
    private String accessKey;
    
    
    private String accessSecret;
    
    
    private String topicArn;

    public SnsDestinationBuilder accessKey( final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    public SnsDestinationBuilder accessSecret( final String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    
    public SnsDestinationBuilder topicArn( final String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    
    public String getAccessKey(){
        return this.accessKey;
    }
    
    
    public String getAccessSecret(){
        return this.accessSecret;
    }
    
    
    public String getTopicArn(){
        return this.topicArn;
    }

    public SnsDestination build() {
        return new SnsDestinationImpl(accessKey, accessSecret, topicArn);
    }

    public static SnsDestinationBuilder of() {
        return new SnsDestinationBuilder();
    }

    public static SnsDestinationBuilder of(final SnsDestination template) {
        SnsDestinationBuilder builder = new SnsDestinationBuilder();
        builder.accessKey = template.getAccessKey();
        builder.accessSecret = template.getAccessSecret();
        builder.topicArn = template.getTopicArn();
        return builder;
    }

}
