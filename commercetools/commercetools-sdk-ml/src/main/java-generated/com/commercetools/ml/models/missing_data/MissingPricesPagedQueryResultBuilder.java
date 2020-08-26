package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPrices;
import com.commercetools.ml.models.missing_data.MissingPricesMeta;
import com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingPricesPagedQueryResultBuilder {

    
    private Long count;
    
    
    private Long total;
    
    
    private Long offset;
    
    
    private java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results;
    
    
    private com.commercetools.ml.models.missing_data.MissingPricesMeta meta;

    public MissingPricesPagedQueryResultBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    public MissingPricesPagedQueryResultBuilder total( final Long total) {
        this.total = total;
        return this;
    }
    
    public MissingPricesPagedQueryResultBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    public MissingPricesPagedQueryResultBuilder results( final java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> results) {
        this.results = results;
        return this;
    }
    
    public MissingPricesPagedQueryResultBuilder meta( final com.commercetools.ml.models.missing_data.MissingPricesMeta meta) {
        this.meta = meta;
        return this;
    }

    
    public Long getCount(){
        return this.count;
    }
    
    
    public Long getTotal(){
        return this.total;
    }
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    
    public java.util.List<com.commercetools.ml.models.missing_data.MissingPrices> getResults(){
        return this.results;
    }
    
    
    public com.commercetools.ml.models.missing_data.MissingPricesMeta getMeta(){
        return this.meta;
    }

    public MissingPricesPagedQueryResult build() {
        return new MissingPricesPagedQueryResultImpl(count, total, offset, results, meta);
    }

    public static MissingPricesPagedQueryResultBuilder of() {
        return new MissingPricesPagedQueryResultBuilder();
    }

    public static MissingPricesPagedQueryResultBuilder of(final MissingPricesPagedQueryResult template) {
        MissingPricesPagedQueryResultBuilder builder = new MissingPricesPagedQueryResultBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
