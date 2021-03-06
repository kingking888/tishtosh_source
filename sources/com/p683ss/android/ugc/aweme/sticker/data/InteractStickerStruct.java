package com.p683ss.android.ugc.aweme.sticker.data;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct */
public class InteractStickerStruct implements C45868a, Serializable {
    public static final int TYPE_BUSINESS = 2;
    public static final int TYPE_COMMENT = 4;
    public static final int TYPE_DONATION = 6;
    public static final int TYPE_POI = 1;
    public static final int TYPE_TEXT = 5;
    public static final int TYPE_VOTE = 3;
    public String attr;
    public int index;
    @C17952c(mo34828a = "text_info")
    public String mTextStruct;
    @C17952c(mo34828a = "poi_info")
    public PoiStruct poiStruct;
    @C17952c(mo34828a = "track_info")
    public String trackList;
    public int type;
    @C17952c(mo34828a = "vote_info")
    public VoteStruct voteStruct;

    public String getAttr() {
        return this.attr;
    }

    public int getIndex() {
        return this.index;
    }

    public PoiStruct getPoiStruct() {
        return this.poiStruct;
    }

    public String getTextStruct() {
        return this.mTextStruct;
    }

    public String getTrackList() {
        return this.trackList;
    }

    public int getType() {
        return this.type;
    }

    public VoteStruct getVoteStruct() {
        return this.voteStruct;
    }

    public int hashCode() {
        return this.index * 31;
    }

    public boolean isPoiSticker() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public void setAttr(String str) {
        this.attr = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setPoiStruct(PoiStruct poiStruct2) {
        this.poiStruct = poiStruct2;
    }

    public void setTextStruct(String str) {
        this.mTextStruct = str;
    }

    public void setTrackList(String str) {
        this.trackList = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVoteStruct(VoteStruct voteStruct2) {
        this.voteStruct = voteStruct2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
        if (this.type != interactStickerStruct.type || this.index != interactStickerStruct.index) {
            return false;
        }
        if (this.poiStruct == null ? interactStickerStruct.poiStruct != null : !this.poiStruct.equals(interactStickerStruct.poiStruct)) {
            return false;
        }
        if (this.trackList == null ? interactStickerStruct.trackList != null : !this.trackList.equals(interactStickerStruct.trackList)) {
            return false;
        }
        if (this.voteStruct == null ? interactStickerStruct.voteStruct != null : !this.voteStruct.equals(interactStickerStruct.voteStruct)) {
            return false;
        }
        if (this.mTextStruct == null ? interactStickerStruct.mTextStruct != null : !this.mTextStruct.equals(interactStickerStruct.mTextStruct)) {
            return false;
        }
        if (this.attr != null) {
            return this.attr.equals(interactStickerStruct.attr);
        }
        if (interactStickerStruct.attr == null) {
            return true;
        }
        return false;
    }
}
