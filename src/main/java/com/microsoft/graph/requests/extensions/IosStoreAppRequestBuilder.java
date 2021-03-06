// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIosStoreAppRequest;
import com.microsoft.graph.requests.extensions.IosStoreAppRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Store App Request Builder.
 */
public class IosStoreAppRequestBuilder extends BaseRequestBuilder implements IIosStoreAppRequestBuilder {

    /**
     * The request builder for the IosStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosStoreAppRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IIosStoreAppRequest instance
     */
    public IIosStoreAppRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIosStoreAppRequest instance
     */
    public IIosStoreAppRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new IosStoreAppRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

