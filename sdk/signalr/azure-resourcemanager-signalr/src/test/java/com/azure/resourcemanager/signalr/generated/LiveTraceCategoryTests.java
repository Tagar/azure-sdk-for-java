// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.LiveTraceCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LiveTraceCategoryTests {
    @Test
    public void testDeserialize() {
        LiveTraceCategory model =
            BinaryData
                .fromString("{\"name\":\"plrbpbewtghf\",\"enabled\":\"lcgwxzvlvqh\"}")
                .toObject(LiveTraceCategory.class);
        Assertions.assertEquals("plrbpbewtghf", model.name());
        Assertions.assertEquals("lcgwxzvlvqh", model.enabled());
    }

    @Test
    public void testSerialize() {
        LiveTraceCategory model = new LiveTraceCategory().withName("plrbpbewtghf").withEnabled("lcgwxzvlvqh");
        model = BinaryData.fromObject(model).toObject(LiveTraceCategory.class);
        Assertions.assertEquals("plrbpbewtghf", model.name());
        Assertions.assertEquals("lcgwxzvlvqh", model.enabled());
    }
}
