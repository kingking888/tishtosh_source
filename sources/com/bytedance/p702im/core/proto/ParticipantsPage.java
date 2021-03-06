package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ParticipantsPage */
public final class ParticipantsPage extends Message<ParticipantsPage, Builder> {
    public static final ProtoAdapter<ParticipantsPage> ADAPTER = new ProtoAdapter_ParticipantsPage();
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    public final Long cursor;
    public final Boolean has_more;
    public final List<Participant> participants;

    /* renamed from: com.bytedance.im.core.proto.ParticipantsPage$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ParticipantsPage, Builder> {
        public Long cursor;
        public Boolean has_more;
        public List<Participant> participants = Internal.newMutableList();

        public final ParticipantsPage build() {
            return new ParticipantsPage(this.participants, this.has_more, this.cursor, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder participants(List<Participant> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ParticipantsPage$ProtoAdapter_ParticipantsPage */
    static final class ProtoAdapter_ParticipantsPage extends ProtoAdapter<ParticipantsPage> {
        public ProtoAdapter_ParticipantsPage() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantsPage.class);
        }

        public final ParticipantsPage redact(ParticipantsPage participantsPage) {
            Builder newBuilder = participantsPage.newBuilder();
            Internal.redactElements(newBuilder.participants, Participant.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ParticipantsPage participantsPage) {
            return Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, participantsPage.participants) + ProtoAdapter.BOOL.encodedSizeWithTag(2, participantsPage.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, participantsPage.cursor) + participantsPage.unknownFields().size();
        }

        public final ParticipantsPage decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.participants.add(Participant.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.has_more((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ParticipantsPage participantsPage) throws IOException {
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, participantsPage.participants);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, participantsPage.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, participantsPage.cursor);
            protoWriter.writeBytes(participantsPage.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.has_more = this.has_more;
        builder.cursor = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "ParticipantsPage{");
        replace.append('}');
        return replace.toString();
    }

    public ParticipantsPage(List<Participant> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public ParticipantsPage(List<Participant> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participants = Internal.immutableCopyOf("participants", list);
        this.has_more = bool;
        this.cursor = l;
    }
}
