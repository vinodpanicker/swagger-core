package io.swagger;

import static org.testng.Assert.assertNull;
import io.swagger.models.properties.Property;
import io.swagger.util.Json;

import org.testng.annotations.Test;

public class EmptyPropertyOrModelTest {

    @Test
    public void propertyCanBeEmpty() throws Exception {
        assertNull(Json.mapper().readValue("{}", Property.class));
    }
    
}
