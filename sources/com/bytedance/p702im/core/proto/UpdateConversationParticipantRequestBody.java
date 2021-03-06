package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody */
public final class UpdateConversationParticipantRequestBody extends Message<UpdateConversationParticipantRequestBody, Builder> {
    public static final ProtoAdapter<UpdateConversationParticipantRequestBody> ADAPTER = new ProtoAdapter_UpdateConversationParticipantRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Boolean DEFAULT_IS_ALIAS_SET = Boolean.valueOf(false);
    public static final Integer DEFAULT_ROLE = Integer.valueOf(0);
    public static final Long DEFAULT_USER_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String alias;
    public final Map<String, String> biz_ext;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Boolean is_alias_set;
    public final Integer role;
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UpdateConversationParticipantRequestBody, Builder> {
        public String alias;
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Boolean is_alias_set;
        public Integer role;
        public Long user_id;

        public final UpdateConversationParticipantRequestBody build() {
            UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody = new UpdateConversationParticipantRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.user_id, this.role, this.alias, this.is_alias_set, this.biz_ext, super.buildUnknownFields());
            return updateConversationParticipantRequestBody;
        }

        public final Builder alias(String str) {
            this.alias = str;
            return this;
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

        public final Builder is_alias_set(Boolean bool) {
            this.is_alias_set = bool;
            return this;
        }

        public final Builder role(Integer num) {
            this.role = num;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }

        public final Builder biz_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.biz_ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody$ProtoAdapter_UpdateConversationParticipantRequestBody */
    static final class ProtoAdapter_UpdateConversationParticipantRequestBody extends ProtoAdapter<UpdateConversationParticipantRequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;

        public ProtoAdapter_UpdateConversationParticipantRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationParticipantRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final UpdateConversationParticipantRequestBody redact(UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
            Builder newBuilder = updateConversationParticipantRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateConversationParticipantRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, updateConversationParticipantRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, updateConversationParticipantRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, updateConversationParticipantRequestBody.user_id) + ProtoAdapter.INT32.encodedSizeWithTag(5, updateConversationParticipantRequestBody.role) + ProtoAdapter.STRING.encodedSizeWithTag(6, updateConversationParticipantRequestBody.alias) + ProtoAdapter.BOOL.encodedSizeWithTag(7, updateConversationParticipantRequestBody.is_alias_set) + this.biz_ext.encodedSizeWithTag(11, updateConversationParticipantRequestBody.biz_ext) + updateConversationParticipantRequestBody.unknownFields().size();
        }

        public final UpdateConversationParticipantRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 11) {
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
                            builder.user_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.role((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.alias((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.is_alias_set((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    builder.biz_ext.putAll((Map) this.biz_ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateConversationParticipantRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, updateConversationParticipantRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, updateConversationParticipantRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, updateConversationParticipantRequestBody.user_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, updateConversationParticipantRequestBody.role);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, updateConversationParticipantRequestBody.alias);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, updateConversationParticipantRequestBody.is_alias_set);
            this.biz_ext.encodeWithTag(protoWriter, 11, updateConversationParticipantRequestBody.biz_ext);
            protoWriter.writeBytes(updateConversationParticipantRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.user_id = this.user_id;
        builder.role = this.role;
        builder.alias = this.alias;
        builder.is_alias_set = this.is_alias_set;
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
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
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.is_alias_set != null) {
            sb.append(", is_alias_set=");
            sb.append(this.is_alias_set);
        }
        if (!this.biz_ext.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateConversationParticipantRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateConversationParticipantRequestBody(String str, Long l, Integer num, Long l2, Integer num2, String str2, Boolean bool, Map<String, String> map) {
        this(str, l, num, l2, num2, str2, bool, map, ByteString.EMPTY);
    }

    public UpdateConversationParticipantRequestBody(String str, Long l, Integer num, Long l2, Integer num2, String str2, Boolean bool, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.user_id = l2;
        this.role = num2;
        this.alias = str2;
        this.is_alias_set = bool;
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map);
    }
}
