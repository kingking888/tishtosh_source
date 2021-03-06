package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.GoodsReport */
public final class GoodsReport extends Message<GoodsReport, Builder> {
    public static final DefaultValueProtoAdapter<GoodsReport> ADAPTER = new ProtoAdapter_GoodsReport();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String publish;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.GoodsReport$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GoodsReport, Builder> {
        public String publish;

        public final GoodsReport build() {
            return new GoodsReport(this.publish, super.buildUnknownFields());
        }

        public final Builder publish(String str) {
            this.publish = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.GoodsReport$ProtoAdapter_GoodsReport */
    static final class ProtoAdapter_GoodsReport extends DefaultValueProtoAdapter<GoodsReport> {
        public final GoodsReport redact(GoodsReport goodsReport) {
            return goodsReport;
        }

        public ProtoAdapter_GoodsReport() {
            super(FieldEncoding.LENGTH_DELIMITED, GoodsReport.class);
        }

        public final GoodsReport decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (GoodsReport) null);
        }

        public final int encodedSize(GoodsReport goodsReport) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, goodsReport.publish) + goodsReport.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, GoodsReport goodsReport) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, goodsReport.publish);
            protoWriter.writeBytes(goodsReport.unknownFields());
        }

        public final GoodsReport decode(ProtoReader protoReader, GoodsReport goodsReport) throws IOException {
            Builder builder;
            GoodsReport goodsReport2 = (GoodsReport) C10617a.m21405a().mo18840a(GoodsReport.class, goodsReport);
            if (goodsReport2 != null) {
                builder = goodsReport2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (goodsReport2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.publish((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getPublish() throws C10174a {
        if (this.publish != null) {
            return this.publish;
        }
        throw new C10174a();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.publish != null) {
            i = this.publish.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.publish = this.publish;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.publish != null) {
            sb.append(", publish=");
            sb.append(this.publish);
        }
        StringBuilder replace = sb.replace(0, 2, "GoodsReport{");
        replace.append('}');
        return replace.toString();
    }

    public GoodsReport(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoodsReport)) {
            return false;
        }
        GoodsReport goodsReport = (GoodsReport) obj;
        if (!unknownFields().equals(goodsReport.unknownFields()) || !Internal.equals(this.publish, goodsReport.publish)) {
            return false;
        }
        return true;
    }

    public GoodsReport(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.publish = str;
    }
}
