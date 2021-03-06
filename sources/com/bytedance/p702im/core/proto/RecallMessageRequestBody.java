package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.RecallMessageRequestBody */
public final class RecallMessageRequestBody extends Message<RecallMessageRequestBody, Builder> {
    public static final ProtoAdapter<RecallMessageRequestBody> ADAPTER = new ProtoAdapter_RecallMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_SERVER_MESSAGE_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Long server_message_id;

    /* renamed from: com.bytedance.im.core.proto.RecallMessageRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RecallMessageRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long server_message_id;

        public final RecallMessageRequestBody build() {
            RecallMessageRequestBody recallMessageRequestBody = new RecallMessageRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.server_message_id, super.buildUnknownFields());
            return recallMessageRequestBody;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.RecallMessageRequestBody$ProtoAdapter_RecallMessageRequestBody */
    static final class ProtoAdapter_RecallMessageRequestBody extends ProtoAdapter<RecallMessageRequestBody> {
        public ProtoAdapter_RecallMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, RecallMessageRequestBody.class);
        }

        public final RecallMessageRequestBody redact(RecallMessageRequestBody recallMessageRequestBody) {
            Builder newBuilder = recallMessageRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(RecallMessageRequestBody recallMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, recallMessageRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, recallMessageRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, recallMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, recallMessageRequestBody.server_message_id) + recallMessageRequestBody.unknownFields().size();
        }

        public final RecallMessageRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.server_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RecallMessageRequestBody recallMessageRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recallMessageRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, recallMessageRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, recallMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, recallMessageRequestBody.server_message_id);
            protoWriter.writeBytes(recallMessageRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.server_message_id = this.server_message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "RecallMessageRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public RecallMessageRequestBody(String str, Long l, Integer num, Long l2) {
        this(str, l, num, l2, ByteString.EMPTY);
    }

    public RecallMessageRequestBody(String str, Long l, Integer num, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.server_message_id = l2;
    }
}
