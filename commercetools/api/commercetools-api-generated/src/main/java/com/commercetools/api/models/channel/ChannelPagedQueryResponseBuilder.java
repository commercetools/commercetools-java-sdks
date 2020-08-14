package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelPagedQueryResponseBuilder {

    
    private Long limit;
    
    
    private Long count;
    
    @Nullable
    private Long total;
    
    
    private Long offset;
    
    
    private java.util.List<com.commercetools.api.models.channel.Channel> results;

    public ChannelPagedQueryResponseBuilder limit( final Long limit) {
        this.limit = limit;
        return this;
    }
    
    public ChannelPagedQueryResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    public ChannelPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }
    
    public ChannelPagedQueryResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    public ChannelPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.models.channel.Channel> results) {
        this.results = results;
        return this;
    }

    
    public Long getLimit(){
        return this.limit;
    }
    
    
    public Long getCount(){
        return this.count;
    }
    
    @Nullable
    public Long getTotal(){
        return this.total;
    }
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    
    public java.util.List<com.commercetools.api.models.channel.Channel> getResults(){
        return this.results;
    }

    public ChannelPagedQueryResponse build() {
        return new ChannelPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ChannelPagedQueryResponseBuilder of() {
        return new ChannelPagedQueryResponseBuilder();
    }

    public static ChannelPagedQueryResponseBuilder of(final ChannelPagedQueryResponse template) {
        ChannelPagedQueryResponseBuilder builder = new ChannelPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
