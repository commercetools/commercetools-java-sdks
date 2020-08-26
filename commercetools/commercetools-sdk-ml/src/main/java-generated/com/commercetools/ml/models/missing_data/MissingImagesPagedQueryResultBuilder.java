package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImages;
import com.commercetools.ml.models.missing_data.MissingImagesMeta;
import com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingImagesPagedQueryResultBuilder {


   private Long count;


   private Long total;


   private Long offset;


   private java.util.List<com.commercetools.ml.models.missing_data.MissingImages> results;


   private com.commercetools.ml.models.missing_data.MissingImagesMeta meta;

   public MissingImagesPagedQueryResultBuilder count( final Long count) {
      this.count = count;
      return this;
   }

   public MissingImagesPagedQueryResultBuilder total( final Long total) {
      this.total = total;
      return this;
   }

   public MissingImagesPagedQueryResultBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }

   public MissingImagesPagedQueryResultBuilder results( final java.util.List<com.commercetools.ml.models.missing_data.MissingImages> results) {
      this.results = results;
      return this;
   }

   public MissingImagesPagedQueryResultBuilder meta( final com.commercetools.ml.models.missing_data.MissingImagesMeta meta) {
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


   public java.util.List<com.commercetools.ml.models.missing_data.MissingImages> getResults(){
      return this.results;
   }


   public com.commercetools.ml.models.missing_data.MissingImagesMeta getMeta(){
      return this.meta;
   }

   public MissingImagesPagedQueryResult build() {
       return new MissingImagesPagedQueryResultImpl(count, total, offset, results, meta);
   }

   public static MissingImagesPagedQueryResultBuilder of() {
      return new MissingImagesPagedQueryResultBuilder();
   }

   public static MissingImagesPagedQueryResultBuilder of(final MissingImagesPagedQueryResult template) {
      MissingImagesPagedQueryResultBuilder builder = new MissingImagesPagedQueryResultBuilder();
      builder.count = template.getCount();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.results = template.getResults();
      builder.meta = template.getMeta();
      return builder;
   }

}
