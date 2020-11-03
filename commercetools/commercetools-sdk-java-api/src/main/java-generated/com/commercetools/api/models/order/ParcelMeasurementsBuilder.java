package com.commercetools.api.models.order;


import com.commercetools.api.models.order.ParcelMeasurements;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelMeasurementsBuilder {

    @Nullable
    private Double heightInMillimeter;
    
    @Nullable
    private Double lengthInMillimeter;
    
    @Nullable
    private Double widthInMillimeter;
    
    @Nullable
    private Double weightInGram;

    public ParcelMeasurementsBuilder heightInMillimeter(@Nullable final Double heightInMillimeter) {
        this.heightInMillimeter = heightInMillimeter;
        return this;
    }
    
    public ParcelMeasurementsBuilder lengthInMillimeter(@Nullable final Double lengthInMillimeter) {
        this.lengthInMillimeter = lengthInMillimeter;
        return this;
    }
    
    public ParcelMeasurementsBuilder widthInMillimeter(@Nullable final Double widthInMillimeter) {
        this.widthInMillimeter = widthInMillimeter;
        return this;
    }
    
    public ParcelMeasurementsBuilder weightInGram(@Nullable final Double weightInGram) {
        this.weightInGram = weightInGram;
        return this;
    }

    @Nullable
    public Double getHeightInMillimeter(){
        return this.heightInMillimeter;
    }
    
    @Nullable
    public Double getLengthInMillimeter(){
        return this.lengthInMillimeter;
    }
    
    @Nullable
    public Double getWidthInMillimeter(){
        return this.widthInMillimeter;
    }
    
    @Nullable
    public Double getWeightInGram(){
        return this.weightInGram;
    }

    public ParcelMeasurements build() {
        return new ParcelMeasurementsImpl(heightInMillimeter, lengthInMillimeter, widthInMillimeter, weightInGram);
    }

    public static ParcelMeasurementsBuilder of() {
        return new ParcelMeasurementsBuilder();
    }

    public static ParcelMeasurementsBuilder of(final ParcelMeasurements template) {
        ParcelMeasurementsBuilder builder = new ParcelMeasurementsBuilder();
        builder.heightInMillimeter = template.getHeightInMillimeter();
        builder.lengthInMillimeter = template.getLengthInMillimeter();
        builder.widthInMillimeter = template.getWidthInMillimeter();
        builder.weightInGram = template.getWeightInGram();
        return builder;
    }

}
