package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesRequestBody */
public final class GetStrangerMessagesRequestBody extends Message<GetStrangerMessagesRequestBody, Builder> {
    public static final ProtoAdapter<GetStrangerMessagesRequestBody> ADAPTER = new ProtoAdapter_GetStrangerMessagesRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Boolean DEFAULT_RESET_UNREAD_COUNT = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    public final Long conversation_short_id;
    public final Boolean reset_unread_count;

    /* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetStrangerMessagesRequestBody, Builder> {
        public Long conversation_short_id;
        public Boolean reset_unread_count;

        public final GetStrangerMessagesRequestBody build() {
            return new GetStrangerMessagesRequestBody(this.conversation_short_id, this.reset_unread_count, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder reset_unread_count(Boolean bool) {
            this.reset_unread_count = bool;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesRequestBody$ProtoAdapter_GetStrangerMessagesRequestBody */
    static final class ProtoAdapter_GetStrangerMessagesRequestBody extends ProtoAdapter<GetStrangerMessagesRequestBody> {
        public ProtoAdapter_GetStrangerMessagesRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerMessagesRequestBody.class);
        }

        public final GetStrangerMessagesRequestBody redact(GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
            Builder newBuilder = getStrangerMessagesRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerMessagesRequestBody.conversation_short_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getStrangerMessagesRequestBody.reset_unread_count) + getStrangerMessagesRequestBody.unknownFields().size();
        }

        public final GetStrangerMessagesRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.reset_unread_count((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerMessagesRequestBody.conversation_short_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getStrangerMessagesRequestBody.reset_unread_count);
            protoWriter.writeBytes(getStrangerMessagesRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.reset_unread_count = this.reset_unread_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.reset_unread_count != null) {
            sb.append(", reset_unread_count=");
            sb.append(this.reset_unread_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStrangerMessagesRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetStrangerMessagesRequestBody(Long l, Boolean bool) {
        this(l, bool, ByteString.EMPTY);
    }

    public GetStrangerMessagesRequestBody(Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.reset_unread_count = bool;
    }
}
