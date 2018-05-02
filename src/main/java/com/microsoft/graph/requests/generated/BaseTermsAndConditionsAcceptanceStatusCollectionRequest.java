// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Terms And Conditions Acceptance Status Collection Request.
 */
public class BaseTermsAndConditionsAcceptanceStatusCollectionRequest extends BaseCollectionRequest<BaseTermsAndConditionsAcceptanceStatusCollectionResponse, ITermsAndConditionsAcceptanceStatusCollectionPage> implements IBaseTermsAndConditionsAcceptanceStatusCollectionRequest {

    /**
     * The request builder for this collection of TermsAndConditionsAcceptanceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTermsAndConditionsAcceptanceStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseTermsAndConditionsAcceptanceStatusCollectionResponse.class, ITermsAndConditionsAcceptanceStatusCollectionPage.class);
    }

    public void get(final ICallback<ITermsAndConditionsAcceptanceStatusCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITermsAndConditionsAcceptanceStatusCollectionPage get() throws ClientException {
        final BaseTermsAndConditionsAcceptanceStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TermsAndConditionsAcceptanceStatus newTermsAndConditionsAcceptanceStatus, final ICallback<TermsAndConditionsAcceptanceStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TermsAndConditionsAcceptanceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTermsAndConditionsAcceptanceStatus, callback);
    }

    public TermsAndConditionsAcceptanceStatus post(final TermsAndConditionsAcceptanceStatus newTermsAndConditionsAcceptanceStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TermsAndConditionsAcceptanceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTermsAndConditionsAcceptanceStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITermsAndConditionsAcceptanceStatusCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (TermsAndConditionsAcceptanceStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITermsAndConditionsAcceptanceStatusCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (TermsAndConditionsAcceptanceStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITermsAndConditionsAcceptanceStatusCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (TermsAndConditionsAcceptanceStatusCollectionRequest)this;
    }

    public ITermsAndConditionsAcceptanceStatusCollectionPage buildFromResponse(final BaseTermsAndConditionsAcceptanceStatusCollectionResponse response) {
        final ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TermsAndConditionsAcceptanceStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TermsAndConditionsAcceptanceStatusCollectionPage page = new TermsAndConditionsAcceptanceStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}