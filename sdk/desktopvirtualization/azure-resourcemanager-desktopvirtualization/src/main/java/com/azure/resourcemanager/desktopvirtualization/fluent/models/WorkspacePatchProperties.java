// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.desktopvirtualization.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Workspace properties that can be patched. */
@Fluent
public final class WorkspacePatchProperties {
    /*
     * Description of Workspace.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Friendly name of Workspace.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * List of applicationGroup links.
     */
    @JsonProperty(value = "applicationGroupReferences")
    private List<String> applicationGroupReferences;

    /*
     * Enabled to allow this resource to be access from the public network
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Get the description property: Description of Workspace.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of Workspace.
     *
     * @param description the description value to set.
     * @return the WorkspacePatchProperties object itself.
     */
    public WorkspacePatchProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of Workspace.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of Workspace.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the WorkspacePatchProperties object itself.
     */
    public WorkspacePatchProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the applicationGroupReferences property: List of applicationGroup links.
     *
     * @return the applicationGroupReferences value.
     */
    public List<String> applicationGroupReferences() {
        return this.applicationGroupReferences;
    }

    /**
     * Set the applicationGroupReferences property: List of applicationGroup links.
     *
     * @param applicationGroupReferences the applicationGroupReferences value to set.
     * @return the WorkspacePatchProperties object itself.
     */
    public WorkspacePatchProperties withApplicationGroupReferences(List<String> applicationGroupReferences) {
        this.applicationGroupReferences = applicationGroupReferences;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Enabled to allow this resource to be access from the public network.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Enabled to allow this resource to be access from the public network.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WorkspacePatchProperties object itself.
     */
    public WorkspacePatchProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
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
