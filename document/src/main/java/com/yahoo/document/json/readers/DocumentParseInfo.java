// Copyright 2017 Yahoo Inc. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.
package com.yahoo.document.json.readers;

import com.yahoo.document.DocumentId;
import com.yahoo.document.json.TokenBuffer;
import com.yahoo.document.json.document.DocumentParser;

import java.util.Optional;

public class DocumentParseInfo {
    public DocumentId documentId;
    public Optional<Boolean> create = Optional.empty();
    public Optional<String> condition = Optional.empty();
    public DocumentParser.SupportedOperation operationType = null;
    public TokenBuffer fieldsBuffer = new TokenBuffer();
    public TokenBuffer fieldpathsBuffer = new TokenBuffer();
}
