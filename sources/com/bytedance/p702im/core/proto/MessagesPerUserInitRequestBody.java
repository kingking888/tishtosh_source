package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitRequestBody */
public final class MessagesPerUserInitRequestBody extends Message<MessagesPerUserInitRequestBody, Builder> {
    public static final ProtoAdapter<MessagesPerUserInitRequestBody> ADAPTER = new ProtoAdapter_MessagesPerUserInitRequestBody();
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long cursor;

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessagesPerUserInitRequestBody, Builder> {
        public Long cursor;

        public final MessagesPerUserInitRequestBody build() {
            return new MessagesPerUserInitRequestBody(this.cursor, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesPerUserInitRequestBody$ProtoAdapter_MessagesPerUserInitRequestBody */
    static final class ProtoAdapter_MessagesPerUserInitRequestBody extends ProtoAdapter<MessagesPerUserInitRequestBody> {
        public ProtoAdapter_MessagesPerUserInitRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitRequestBody.class);
        }

        public final MessagesPerUserInitRequestBody redact(MessagesPerUserInitRequestBody messagesPerUserInitRequestBody) {
            Builder newBuilder = messagesPerUserInitRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MessagesPerUserInitRequestBody messagesPerUserInitRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messagesPerUserInitRequestBody.cursor) + messagesPerUserInitRequestBody.unknownFields().size();
        }

        public final MessagesPerUserInitRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessagesPerUserInitRequestBody messagesPerUserInitRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesPerUserInitRequestBody.cursor);
            protoWriter.writeBytes(messagesPerUserInitRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagesPerUserInitRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public MessagesPerUserInitRequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public MessagesPerUserInitRequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
    }
}
