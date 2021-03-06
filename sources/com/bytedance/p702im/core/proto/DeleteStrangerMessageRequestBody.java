package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody */
public final class DeleteStrangerMessageRequestBody extends Message<DeleteStrangerMessageRequestBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerMessageRequestBody> ADAPTER = new ProtoAdapter_DeleteStrangerMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Long DEFAULT_SERVER_MESSAGE_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long conversation_short_id;
    public final Long server_message_id;

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteStrangerMessageRequestBody, Builder> {
        public Long conversation_short_id;
        public Long server_message_id;

        public final DeleteStrangerMessageRequestBody build() {
            return new DeleteStrangerMessageRequestBody(this.server_message_id, this.conversation_short_id, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody$ProtoAdapter_DeleteStrangerMessageRequestBody */
    static final class ProtoAdapter_DeleteStrangerMessageRequestBody extends ProtoAdapter<DeleteStrangerMessageRequestBody> {
        public ProtoAdapter_DeleteStrangerMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerMessageRequestBody.class);
        }

        public final DeleteStrangerMessageRequestBody redact(DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            Builder newBuilder = deleteStrangerMessageRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, deleteStrangerMessageRequestBody.server_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, deleteStrangerMessageRequestBody.conversation_short_id) + deleteStrangerMessageRequestBody.unknownFields().size();
        }

        public final DeleteStrangerMessageRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.server_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteStrangerMessageRequestBody.server_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteStrangerMessageRequestBody.conversation_short_id);
            protoWriter.writeBytes(deleteStrangerMessageRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.server_message_id = this.server_message_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteStrangerMessageRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteStrangerMessageRequestBody(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public DeleteStrangerMessageRequestBody(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.conversation_short_id = l2;
    }
}
