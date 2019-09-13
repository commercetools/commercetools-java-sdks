package io.vrap.rmf.base.client.utils.json.modules;

import com.fasterxml.jackson.databind.module.SimpleModule;
import io.vrap.rmf.base.client.utils.json.modules.deserializers.ZonedDateTimeDeserializer;

import java.time.ZonedDateTime;

public class ZonedDateTimeDeserializationModule extends SimpleModule {

    private static final long serialVersionUID = 0L;

    public ZonedDateTimeDeserializationModule() {
        addDeserializer(ZonedDateTime.class, new ZonedDateTimeDeserializer());
    }
    
}
