// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The streaming endpoint current sku. */
@Fluent
public final class ArmStreamingEndpointCurrentSku {
    /*
     * The streaming endpoint sku name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The streaming endpoint sku capacity.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: The streaming endpoint sku name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the capacity property: The streaming endpoint sku capacity.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The streaming endpoint sku capacity.
     *
     * @param capacity the capacity value to set.
     * @return the ArmStreamingEndpointCurrentSku object itself.
     */
    public ArmStreamingEndpointCurrentSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
