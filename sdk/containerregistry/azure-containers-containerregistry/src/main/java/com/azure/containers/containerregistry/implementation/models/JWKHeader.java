// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** JSON web key parameter. */
@Fluent
public final class JWKHeader {
    /*
     * crv value
     */
    @JsonProperty(value = "crv")
    private String crv;

    /*
     * kid value
     */
    @JsonProperty(value = "kid")
    private String kid;

    /*
     * kty value
     */
    @JsonProperty(value = "kty")
    private String kty;

    /*
     * x value
     */
    @JsonProperty(value = "x")
    private String x;

    /*
     * y value
     */
    @JsonProperty(value = "y")
    private String y;

    /** Creates an instance of JWKHeader class. */
    public JWKHeader() {}

    /**
     * Get the crv property: crv value.
     *
     * @return the crv value.
     */
    public String getCrv() {
        return this.crv;
    }

    /**
     * Set the crv property: crv value.
     *
     * @param crv the crv value to set.
     * @return the JWKHeader object itself.
     */
    public JWKHeader setCrv(String crv) {
        this.crv = crv;
        return this;
    }

    /**
     * Get the kid property: kid value.
     *
     * @return the kid value.
     */
    public String getKid() {
        return this.kid;
    }

    /**
     * Set the kid property: kid value.
     *
     * @param kid the kid value to set.
     * @return the JWKHeader object itself.
     */
    public JWKHeader setKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the kty property: kty value.
     *
     * @return the kty value.
     */
    public String getKty() {
        return this.kty;
    }

    /**
     * Set the kty property: kty value.
     *
     * @param kty the kty value to set.
     * @return the JWKHeader object itself.
     */
    public JWKHeader setKty(String kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get the x property: x value.
     *
     * @return the x value.
     */
    public String getX() {
        return this.x;
    }

    /**
     * Set the x property: x value.
     *
     * @param x the x value to set.
     * @return the JWKHeader object itself.
     */
    public JWKHeader setX(String x) {
        this.x = x;
        return this;
    }

    /**
     * Get the y property: y value.
     *
     * @return the y value.
     */
    public String getY() {
        return this.y;
    }

    /**
     * Set the y property: y value.
     *
     * @param y the y value to set.
     * @return the JWKHeader object itself.
     */
    public JWKHeader setY(String y) {
        this.y = y;
        return this;
    }
}
