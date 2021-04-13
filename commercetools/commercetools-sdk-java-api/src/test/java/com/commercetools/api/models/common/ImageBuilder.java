package com.commercetools.api.models.common;

import com.commercetools.api.models.common.ImageDimensions;
import com.commercetools.api.models.common.Image;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageBuilder {

    
    
    private String url;
    
    
    
    private com.commercetools.api.models.common.ImageDimensions dimensions;
    
    
    @Nullable
    private String label;

    
    public ImageBuilder url( final String url) {
        this.url = url;
        return this;
    }
    
    
    public ImageBuilder dimensions( final com.commercetools.api.models.common.ImageDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    
    
    public ImageBuilder label(@Nullable final String label) {
        this.label = label;
        return this;
    }

    
    
    public String getUrl(){
        return this.url;
    }
    
    
    
    public com.commercetools.api.models.common.ImageDimensions getDimensions(){
        return this.dimensions;
    }
    
    
    @Nullable
    public String getLabel(){
        return this.label;
    }

    public Image build() {
        return new ImageImpl(url, dimensions, label);
    }

    public static ImageBuilder of() {
        return new ImageBuilder();
    }

    public static ImageBuilder of(final Image template) {
        ImageBuilder builder = new ImageBuilder();
        builder.url = template.getUrl();
        builder.dimensions = template.getDimensions();
        builder.label = template.getLabel();
        return builder;
    }

}
