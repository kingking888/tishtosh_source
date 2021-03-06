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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle */
public final class com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle extends Message<com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle> ADAPTER = new C32828xbb047c38();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 60456040)
    public final String challenge;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 143911128)
    public final String commodity;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 80148248)
    public final String general;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3322092)
    public final String live;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 104263205)
    public final String music;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 111178)
    public final String poi;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3599307)
    public final String user;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 112202875)
    public final String video;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle, Builder> {
        public String challenge;
        public String commodity;
        public String general;
        public String live;
        public String music;
        public String poi;
        public String user;
        public String video;

        public final com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle build() {
            com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle = new com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle(this.general, this.user, this.music, this.challenge, this.video, this.poi, this.commodity, this.live, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle;
        }

        public final Builder challenge(String str) {
            this.challenge = str;
            return this;
        }

        public final Builder commodity(String str) {
            this.commodity = str;
            return this;
        }

        public final Builder general(String str) {
            this.general = str;
            return this;
        }

        public final Builder live(String str) {
            this.live = str;
            return this;
        }

        public final Builder music(String str) {
            this.music = str;
            return this;
        }

        public final Builder poi(String str) {
            this.poi = str;
            return this;
        }

        public final Builder user(String str) {
            this.user = str;
            return this;
        }

        public final Builder video(String str) {
            this.video = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle$ProtoAdapter_com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle */
    static final class C32828xbb047c38 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle> {
        public final com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle redact(com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle) {
            return com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle;
        }

        public C32828xbb047c38() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle.class);
        }

        public final com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle) {
            return ProtoAdapter.STRING.encodedSizeWithTag(80148248, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.general) + ProtoAdapter.STRING.encodedSizeWithTag(3599307, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.user) + ProtoAdapter.STRING.encodedSizeWithTag(104263205, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.music) + ProtoAdapter.STRING.encodedSizeWithTag(60456040, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.challenge) + ProtoAdapter.STRING.encodedSizeWithTag(112202875, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.video) + ProtoAdapter.STRING.encodedSizeWithTag(111178, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.poi) + ProtoAdapter.STRING.encodedSizeWithTag(143911128, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.commodity) + ProtoAdapter.STRING.encodedSizeWithTag(3322092, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.live) + com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 80148248, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.general);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3599307, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.user);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 104263205, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.music);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 60456040, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.challenge);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 112202875, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.video);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 111178, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.poi);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 143911128, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.commodity);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3322092, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.live);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.unknownFields());
        }

        public final com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle decode(ProtoReader protoReader, com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle2 = (com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle.class, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle);
            if (com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle2 != null) {
                builder = com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 111178:
                            builder.poi((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3322092:
                            builder.live((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3599307:
                            builder.user((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 60456040:
                            builder.challenge((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 80148248:
                            builder.general((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 104263205:
                            builder.music((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 112202875:
                            builder.video((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 143911128:
                            builder.commodity((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getChallenge() throws C10174a {
        if (this.challenge != null) {
            return this.challenge;
        }
        throw new C10174a();
    }

    public final String getCommodity() throws C10174a {
        if (this.commodity != null) {
            return this.commodity;
        }
        throw new C10174a();
    }

    public final String getGeneral() throws C10174a {
        if (this.general != null) {
            return this.general;
        }
        throw new C10174a();
    }

    public final String getLive() throws C10174a {
        if (this.live != null) {
            return this.live;
        }
        throw new C10174a();
    }

    public final String getMusic() throws C10174a {
        if (this.music != null) {
            return this.music;
        }
        throw new C10174a();
    }

    public final String getPoi() throws C10174a {
        if (this.poi != null) {
            return this.poi;
        }
        throw new C10174a();
    }

    public final String getUser() throws C10174a {
        if (this.user != null) {
            return this.user;
        }
        throw new C10174a();
    }

    public final String getVideo() throws C10174a {
        if (this.video != null) {
            return this.video;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.general = this.general;
        builder.user = this.user;
        builder.music = this.music;
        builder.challenge = this.challenge;
        builder.video = this.video;
        builder.poi = this.poi;
        builder.commodity = this.commodity;
        builder.live = this.live;
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
        int i7;
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i9 = 0;
        if (this.general != null) {
            i = this.general.hashCode();
        } else {
            i = 0;
        }
        int i10 = (hashCode + i) * 37;
        if (this.user != null) {
            i2 = this.user.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 37;
        if (this.music != null) {
            i3 = this.music.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        if (this.challenge != null) {
            i4 = this.challenge.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        if (this.video != null) {
            i5 = this.video.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        if (this.poi != null) {
            i6 = this.poi.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        if (this.commodity != null) {
            i7 = this.commodity.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.live != null) {
            i9 = this.live.hashCode();
        }
        int i17 = i16 + i9;
        this.hashCode = i17;
        return i17;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.general != null) {
            sb.append(", general=");
            sb.append(this.general);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.music != null) {
            sb.append(", music=");
            sb.append(this.music);
        }
        if (this.challenge != null) {
            sb.append(", challenge=");
            sb.append(this.challenge);
        }
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (this.poi != null) {
            sb.append(", poi=");
            sb.append(this.poi);
        }
        if (this.commodity != null) {
            sb.append(", commodity=");
            sb.append(this.commodity);
        }
        if (this.live != null) {
            sb.append(", live=");
            sb.append(this.live);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle)) {
            return false;
        }
        com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle = (com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.unknownFields()) || !Internal.equals(this.general, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.general) || !Internal.equals(this.user, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.user) || !Internal.equals(this.music, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.music) || !Internal.equals(this.challenge, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.challenge) || !Internal.equals(this.video, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.video) || !Internal.equals(this.poi, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.poi) || !Internal.equals(this.commodity, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.commodity) || !Internal.equals(this.live, com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle.live)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.general = str;
        this.user = str2;
        this.music = str3;
        this.challenge = str4;
        this.video = str5;
        this.poi = str6;
        this.commodity = str7;
        this.live = str8;
    }
}
