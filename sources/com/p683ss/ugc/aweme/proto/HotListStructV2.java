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

/* renamed from: com.ss.ugc.aweme.proto.HotListStructV2 */
public final class HotListStructV2 extends Message<HotListStructV2, Builder> {
    public static final ProtoAdapter<HotListStructV2> ADAPTER = new ProtoAdapter_HotListStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String footer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String header;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String i18n_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String image_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer type;

    /* renamed from: com.ss.ugc.aweme.proto.HotListStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<HotListStructV2, Builder> {
        public String footer;
        public String header;
        public String i18n_title;
        public String image_url;
        public String schema;
        public String title;
        public Integer type;

        public final HotListStructV2 build() {
            HotListStructV2 hotListStructV2 = new HotListStructV2(this.title, this.image_url, this.schema, this.type, this.i18n_title, this.header, this.footer, super.buildUnknownFields());
            return hotListStructV2;
        }

        public final Builder footer(String str) {
            this.footer = str;
            return this;
        }

        public final Builder header(String str) {
            this.header = str;
            return this;
        }

        public final Builder i18n_title(String str) {
            this.i18n_title = str;
            return this;
        }

        public final Builder image_url(String str) {
            this.image_url = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.HotListStructV2$ProtoAdapter_HotListStructV2 */
    static final class ProtoAdapter_HotListStructV2 extends ProtoAdapter<HotListStructV2> {
        public ProtoAdapter_HotListStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, HotListStructV2.class);
        }

        public final int encodedSize(HotListStructV2 hotListStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, hotListStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, hotListStructV2.image_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, hotListStructV2.schema) + ProtoAdapter.INT32.encodedSizeWithTag(4, hotListStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(5, hotListStructV2.i18n_title) + ProtoAdapter.STRING.encodedSizeWithTag(6, hotListStructV2.header) + ProtoAdapter.STRING.encodedSizeWithTag(7, hotListStructV2.footer) + hotListStructV2.unknownFields().size();
        }

        public final HotListStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.image_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.i18n_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.header((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.footer((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, HotListStructV2 hotListStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hotListStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hotListStructV2.image_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, hotListStructV2.schema);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, hotListStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, hotListStructV2.i18n_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, hotListStructV2.header);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, hotListStructV2.footer);
            protoWriter.writeBytes(hotListStructV2.unknownFields());
        }
    }

    public HotListStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.image_url = this.image_url;
        builder.schema = this.schema;
        builder.type = this.type;
        builder.i18n_title = this.i18n_title;
        builder.header = this.header;
        builder.footer = this.footer;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i8 = 0;
        if (this.title != null) {
            i = this.title.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.image_url != null) {
            i2 = this.image_url.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.schema != null) {
            i3 = this.schema.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.type != null) {
            i4 = this.type.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.i18n_title != null) {
            i5 = this.i18n_title.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.header != null) {
            i6 = this.header.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.footer != null) {
            i8 = this.footer.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.i18n_title != null) {
            sb.append(", i18n_title=");
            sb.append(this.i18n_title);
        }
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.footer != null) {
            sb.append(", footer=");
            sb.append(this.footer);
        }
        StringBuilder replace = sb.replace(0, 2, "HotListStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HotListStructV2)) {
            return false;
        }
        HotListStructV2 hotListStructV2 = (HotListStructV2) obj;
        if (!unknownFields().equals(hotListStructV2.unknownFields()) || !Internal.equals(this.title, hotListStructV2.title) || !Internal.equals(this.image_url, hotListStructV2.image_url) || !Internal.equals(this.schema, hotListStructV2.schema) || !Internal.equals(this.type, hotListStructV2.type) || !Internal.equals(this.i18n_title, hotListStructV2.i18n_title) || !Internal.equals(this.header, hotListStructV2.header) || !Internal.equals(this.footer, hotListStructV2.footer)) {
            return false;
        }
        return true;
    }

    public HotListStructV2(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        this(str, str2, str3, num, str4, str5, str6, ByteString.EMPTY);
    }

    public HotListStructV2(String str, String str2, String str3, Integer num, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.image_url = str2;
        this.schema = str3;
        this.type = num;
        this.i18n_title = str4;
        this.header = str5;
        this.footer = str6;
    }
}
