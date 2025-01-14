// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Properties for GraphAPIComputeServiceResource. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceType")
@JsonTypeName("GraphAPICompute")
@Fluent
public final class GraphApiComputeServiceResourceProperties extends ServiceResourceProperties {
    /*
     * GraphAPICompute endpoint for the service.
     */
    @JsonProperty(value = "graphApiComputeEndpoint")
    private String graphApiComputeEndpoint;

    /*
     * An array that contains all of the locations for the service.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<GraphApiComputeRegionalServiceResource> locations;

    /**
     * Get the graphApiComputeEndpoint property: GraphAPICompute endpoint for the service.
     *
     * @return the graphApiComputeEndpoint value.
     */
    public String graphApiComputeEndpoint() {
        return this.graphApiComputeEndpoint;
    }

    /**
     * Set the graphApiComputeEndpoint property: GraphAPICompute endpoint for the service.
     *
     * @param graphApiComputeEndpoint the graphApiComputeEndpoint value to set.
     * @return the GraphApiComputeServiceResourceProperties object itself.
     */
    public GraphApiComputeServiceResourceProperties withGraphApiComputeEndpoint(String graphApiComputeEndpoint) {
        this.graphApiComputeEndpoint = graphApiComputeEndpoint;
        return this;
    }

    /**
     * Get the locations property: An array that contains all of the locations for the service.
     *
     * @return the locations value.
     */
    public List<GraphApiComputeRegionalServiceResource> locations() {
        return this.locations;
    }

    /** {@inheritDoc} */
    @Override
    public GraphApiComputeServiceResourceProperties withInstanceSize(ServiceSize instanceSize) {
        super.withInstanceSize(instanceSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GraphApiComputeServiceResourceProperties withInstanceCount(Integer instanceCount) {
        super.withInstanceCount(instanceCount);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }
}
