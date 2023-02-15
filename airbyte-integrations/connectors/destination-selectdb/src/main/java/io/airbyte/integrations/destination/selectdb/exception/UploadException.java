/*
 * Copyright (c) 2022 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.destination.selectdb.exception;

public class UploadException extends SelectdbRuntimeException{

    public UploadException(Exception exception) {
        super(exception);
    }
}