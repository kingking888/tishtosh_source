package com.p683ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.PoiFrontendTypeStructV2 */
final class PoiFrontendTypeStructV2 extends Message<PoiFrontendTypeStructV2, Builder> {
    public static final ProtoAdapter<PoiFrontendTypeStructV2> ADAPTER = new ProtoAdapter_PoiFrontendTypeStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;

    /* renamed from: com.ss.ugc.aweme.proto.PoiFrontendTypeStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PoiFrontendTypeStructV2, Builder> {
        public String code;
        public String desc;
        public String name;

        public final PoiFrontendTypeStructV2 build() {
            return new PoiFrontendTypeStructV2(this.code, this.name, this.desc, super.buildUnknownFields());
        }

        public final Builder code(String str) {
            this.code = str;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PoiFrontendTypeStructV2$ProtoAdapter_PoiFrontendTypeStructV2 */
    static final class ProtoAdapter_PoiFrontendTypeStructV2 extends ProtoAdapter<PoiFrontendTypeStructV2> {
        public ProtoAdapter_PoiFrontendTypeStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PoiFrontendTypeStructV2.class);
        }

        public final int encodedSize(PoiFrontendTypeStructV2 poiFrontendTypeStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, poiFrontendTypeStructV2.code) + ProtoAdapter.STRING.encodedSizeWithTag(2, poiFrontendTypeStructV2.name) + ProtoAdapter.STRING.encodedSizeWithTag(3, poiFrontendTypeStructV2.desc) + poiFrontendTypeStructV2.unknownFields().size();
        }

        public final PoiFrontendTypeStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.code((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PoiFrontendTypeStructV2 poiFrontendTypeStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, poiFrontendTypeStructV2.code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, poiFrontendTypeStructV2.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, poiFrontendTypeStructV2.desc);
            protoWriter.writeBytes(poiFrontendTypeStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.code = this.code;
        builder.name = this.name;
        builder.desc = this.desc;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.code != null) {
            i = this.code.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.name != null) {
            i2 = this.name.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.desc != null) {
            i4 = this.desc.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        StringBuilder replace = sb.replace(0, 2, "PoiFrontendTypeStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiFrontendTypeStructV2)) {
            return false;
        }
        PoiFrontendTypeStructV2 poiFrontendTypeStructV2 = (PoiFrontendTypeStructV2) obj;
        if (!unknownFields().equals(poiFrontendTypeStructV2.unknownFields()) || !Internal.equals(this.code, poiFrontendTypeStructV2.code) || !Internal.equals(this.name, poiFrontendTypeStructV2.name) || !Internal.equals(this.desc, poiFrontendTypeStructV2.desc)) {
            return false;
        }
        return true;
    }

    public PoiFrontendTypeStructV2(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public PoiFrontendTypeStructV2(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = str;
        this.name = str2;
        this.desc = str3;
    }
}
