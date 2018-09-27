/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement.responses;

import com.oracle.bmc.keymanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class DecryptResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned DecryptedData instance.
     */
    private DecryptedData decryptedData;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DecryptResponse o) {
            opcRequestId(o.getOpcRequestId());
            decryptedData(o.getDecryptedData());

            return this;
        }
    }
}
