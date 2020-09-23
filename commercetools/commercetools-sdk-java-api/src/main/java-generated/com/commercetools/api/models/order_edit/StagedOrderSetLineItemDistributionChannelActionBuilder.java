package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemDistributionChannelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetLineItemDistributionChannelActionBuilder {

    
    private String lineItemId;
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public StagedOrderSetLineItemDistributionChannelActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    public StagedOrderSetLineItemDistributionChannelActionBuilder distributionChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
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

    public StagedOrderSetLineItemDistributionChannelAction build() {
        return new StagedOrderSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    public static StagedOrderSetLineItemDistributionChannelActionBuilder of() {
        return new StagedOrderSetLineItemDistributionChannelActionBuilder();
    }

    public static StagedOrderSetLineItemDistributionChannelActionBuilder of(final StagedOrderSetLineItemDistributionChannelAction template) {
        StagedOrderSetLineItemDistributionChannelActionBuilder builder = new StagedOrderSetLineItemDistributionChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
