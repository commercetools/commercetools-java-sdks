package com.commercetools.api.models.me;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetLineItemDistributionChannelActionBuilder {

    
    private String lineItemId;
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public MyCartSetLineItemDistributionChannelActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    public MyCartSetLineItemDistributionChannelActionBuilder distributionChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }

    public MyCartSetLineItemDistributionChannelAction build() {
        return new MyCartSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    public static MyCartSetLineItemDistributionChannelActionBuilder of() {
        return new MyCartSetLineItemDistributionChannelActionBuilder();
    }

    public static MyCartSetLineItemDistributionChannelActionBuilder of(final MyCartSetLineItemDistributionChannelAction template) {
        MyCartSetLineItemDistributionChannelActionBuilder builder = new MyCartSetLineItemDistributionChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
