// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.SkuCapacity;
import org.junit.jupiter.api.Test;

public final class SkuCapacityTests {
    @Test
    public void testDeserialize() {
        SkuCapacity model =
            BinaryData
                .fromString(
                    "{\"minimum\":1703781779,\"maximum\":995419481,\"default\":1024892279,\"allowedValues\":[1113434704,346562184,254804801,1095781686],\"scaleType\":\"Automatic\"}")
                .toObject(SkuCapacity.class);
    }

    @Test
    public void testSerialize() {
        SkuCapacity model = new SkuCapacity();
        model = BinaryData.fromObject(model).toObject(SkuCapacity.class);
    }
}
