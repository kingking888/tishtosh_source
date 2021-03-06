package com.bytedance.android.live.base.model.proto;

import com.bytedance.android.live.base.model.C2963b;
import com.bytedance.android.live.base.model.C2968c;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.FlexImageModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.ImageModel.Content;
import com.bytedance.android.live.base.model._CateCell_ProtoDecoder;
import com.bytedance.android.live.base.model._Category_ProtoDecoder;
import com.bytedance.android.live.base.model._FansClubMember_ProtoDecoder;
import com.bytedance.android.live.base.model._FlexImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_Content_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.banner.C2965a;
import com.bytedance.android.live.base.model.banner.C2966b;
import com.bytedance.android.live.base.model.banner.C2967c;
import com.bytedance.android.live.base.model.banner._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._FeedBanner_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.C2974a.C2975a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.feed._FeedExtra_LogPb_ProtoDecoder;
import com.bytedance.android.live.base.model.feed._FeedExtra_ProtoDecoder;
import com.bytedance.android.live.base.model.feed._FeedItem_ProtoDecoder;
import com.bytedance.android.live.base.model.live.C2983c;
import com.bytedance.android.live.base.model.live.C2984d;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.live.RoomStats.C2980a;
import com.bytedance.android.live.base.model.live._RankUser_ProtoDecoder;
import com.bytedance.android.live.base.model.live._Ranking_ProtoDecoder;
import com.bytedance.android.live.base.model.live._RoomStats_ProtoDecoder;
import com.bytedance.android.live.base.model.live._RoomStats_UserComposition_ProtoDecoder;
import com.bytedance.android.live.base.model.user.C2999a;
import com.bytedance.android.live.base.model.user.C3002b;
import com.bytedance.android.live.base.model.user.C3003c;
import com.bytedance.android.live.base.model.user.C3004d;
import com.bytedance.android.live.base.model.user.C3005e;
import com.bytedance.android.live.base.model.user.C3006f;
import com.bytedance.android.live.base.model.user.C3008h;
import com.bytedance.android.live.base.model.user.C3012k;
import com.bytedance.android.live.base.model.user.C3014m;
import com.bytedance.android.live.base.model.user.C3015n;
import com.bytedance.android.live.base.model.user.C3015n.C3016a;
import com.bytedance.android.live.base.model.user.C3015n.C3017b;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.FansClubData.UserBadge;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.FraternityInfo;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.User.C2998a;
import com.bytedance.android.live.base.model.user._ActivityRewardInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._AnchorInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._AnchorLevel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._AuthenticationInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._Author_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BorderInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FansClubData_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FansClubData_UserBadge_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FollowInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FraternityInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._GradeIcon_ProtoDecoder;
import com.bytedance.android.live.base.model.user._NobleLevelInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._UserAttr_ProtoDecoder;
import com.bytedance.android.live.base.model.user._UserHonor_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_OwnRoom_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.base.model.user._XiguaUserParams_ProtoDecoder;
import com.bytedance.android.live.base.model.user._XiguaUserParams_RocketSchema_ProtoDecoder;
import com.bytedance.android.live.base.model.user._XiguaUserParams_UserExtendInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.bytedance.android.livesdkapi.depend.model.live.C8694ab;
import com.bytedance.android.livesdkapi.depend.model.live.C8695b;
import com.bytedance.android.livesdkapi.depend.model.live.C8695b.C8696a;
import com.bytedance.android.livesdkapi.depend.model.live.C8697c;
import com.bytedance.android.livesdkapi.depend.model.live.C8698d;
import com.bytedance.android.livesdkapi.depend.model.live.C8699e;
import com.bytedance.android.livesdkapi.depend.model.live.C8700f;
import com.bytedance.android.livesdkapi.depend.model.live.C8701g;
import com.bytedance.android.livesdkapi.depend.model.live.C8702h;
import com.bytedance.android.livesdkapi.depend.model.live.C8703i;
import com.bytedance.android.livesdkapi.depend.model.live.C8704j;
import com.bytedance.android.livesdkapi.depend.model.live.C8711n;
import com.bytedance.android.livesdkapi.depend.model.live.C8713p;
import com.bytedance.android.livesdkapi.depend.model.live.C8713p.C8714a;
import com.bytedance.android.livesdkapi.depend.model.live.C8713p.C8715b;
import com.bytedance.android.livesdkapi.depend.model.live.C8718r;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import com.bytedance.android.livesdkapi.depend.model.live.C8723w;
import com.bytedance.android.livesdkapi.depend.model.live.C8724x;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.livesdkapi.depend.model.live.C8727z;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Options;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.PullData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live._BannerInRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleMode_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleMode_StealTowerData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleScorePairInRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleScorePair_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleSettingInRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleTask_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BurstInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ChannelInfoInRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ChannelInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_Options_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_PullData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_Quality_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LivePlayTagInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._MatchInfo_FollowBtnSkin_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._MatchInfo_MatchSkinInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._MatchInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._OfficialRoomInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomAuthStatus_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomDecoration_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomLinkInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomTab_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomUserAttr_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrlExtra_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrlExtra_SrConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrl_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._TopFanTicket_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._UserHealthScoreInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.message.C8847d;
import com.bytedance.android.livesdkapi.message.C8849f;
import com.bytedance.android.livesdkapi.message.C8849f.C8850a;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8852h;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.bytedance.android.livesdkapi.message.C8854j;
import com.bytedance.android.livesdkapi.message.C8855k;
import com.bytedance.android.livesdkapi.message.C8856l;
import com.bytedance.android.livesdkapi.message.C8857m;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._PatternRef_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._ProtoMessageFetchResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextFormat_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPieceGift_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPieceHeart_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPiecePatternRef_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPieceUser_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPiece_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import java.util.HashMap;
import java.util.Map;

public final class _ProtoDecoders_LIVEBASE {
    private static final Map<Class, C2888b> DECODER_MAP = new HashMap();

    public final void inject(Map<Class, C2888b> map) {
        map.put(ImageModel.class, new _ImageModel_ProtoDecoder());
        map.put(Content.class, new _ImageModel_Content_ProtoDecoder());
        map.put(C2967c.class, new _RankRoundBanner_ProtoDecoder());
        map.put(C2966b.class, new _FeedBannerContainer_ProtoDecoder());
        map.put(C2965a.class, new _FeedBanner_ProtoDecoder());
        map.put(RoomStats.class, new _RoomStats_ProtoDecoder());
        map.put(C2980a.class, new _RoomStats_UserComposition_ProtoDecoder());
        map.put(C2984d.class, new _Ranking_ProtoDecoder());
        map.put(C2983c.class, new _RankUser_ProtoDecoder());
        map.put(C2968c.class, new _Category_ProtoDecoder());
        map.put(FlexImageModel.class, new _FlexImageModel_ProtoDecoder());
        map.put(FeedItem.class, new _FeedItem_ProtoDecoder());
        map.put(C2974a.class, new _FeedExtra_ProtoDecoder());
        map.put(C2975a.class, new _FeedExtra_LogPb_ProtoDecoder());
        map.put(FansClubMember.class, new _FansClubMember_ProtoDecoder());
        map.put(FansClubData.class, new _FansClubData_ProtoDecoder());
        map.put(UserBadge.class, new _FansClubData_UserBadge_ProtoDecoder());
        map.put(FollowInfo.class, new _FollowInfo_ProtoDecoder());
        map.put(C3014m.class, new _UserHonor_ProtoDecoder());
        map.put(C3003c.class, new _AnchorLevel_ProtoDecoder());
        map.put(C3012k.class, new _UserAttr_ProtoDecoder());
        map.put(FraternityInfo.class, new _FraternityInfo_ProtoDecoder());
        map.put(User.class, new _User_ProtoDecoder());
        map.put(C2998a.class, new _User_OwnRoom_ProtoDecoder());
        map.put(C2999a.class, new _ActivityRewardInfo_ProtoDecoder());
        map.put(C3004d.class, new _AuthenticationInfo_ProtoDecoder());
        map.put(C3008h.class, new _GradeIcon_ProtoDecoder());
        map.put(NobleLevelInfo.class, new _NobleLevelInfo_ProtoDecoder());
        map.put(C3002b.class, new _AnchorInfo_ProtoDecoder());
        map.put(C3015n.class, new _XiguaUserParams_ProtoDecoder());
        map.put(C3017b.class, new _XiguaUserParams_UserExtendInfo_ProtoDecoder());
        map.put(C3016a.class, new _XiguaUserParams_RocketSchema_ProtoDecoder());
        map.put(C3006f.class, new _BorderInfo_ProtoDecoder());
        map.put(C3005e.class, new _Author_ProtoDecoder());
        map.put(C2963b.class, new _CateCell_ProtoDecoder());
        map.put(C8694ab.class, new _UserHealthScoreInfo_ProtoDecoder());
        map.put(C8700f.class, new _BattleSettingInRoom_ProtoDecoder());
        map.put(C8718r.class, new _OfficialRoomInfo_ProtoDecoder());
        map.put(StreamUrl.class, new _StreamUrl_ProtoDecoder());
        map.put(Room.class, new _Room_ProtoDecoder());
        map.put(C8725y.class, new _StreamUrlExtra_ProtoDecoder());
        map.put(C8726a.class, new _StreamUrlExtra_SrConfig_ProtoDecoder());
        map.put(C8724x.class, new _RoomUserAttr_ProtoDecoder());
        map.put(C8702h.class, new _BurstInfo_ProtoDecoder());
        map.put(C8723w.class, new _RoomTab_ProtoDecoder());
        map.put(C8692a.class, new _BannerInRoom_ProtoDecoder());
        map.put(C8721u.class, new _RoomDecoration_ProtoDecoder());
        map.put(C8699e.class, new _BattleSetting_ProtoDecoder());
        map.put(C8695b.class, new _BattleMode_ProtoDecoder());
        map.put(C8696a.class, new _BattleMode_StealTowerData_ProtoDecoder());
        map.put(C8698d.class, new _BattleScorePairInRoom_ProtoDecoder());
        map.put(RoomAuthStatus.class, new _RoomAuthStatus_ProtoDecoder());
        map.put(C8711n.class, new _LivePlayTagInfo_ProtoDecoder());
        map.put(C8703i.class, new _ChannelInfo_ProtoDecoder());
        map.put(C8697c.class, new _BattleScorePair_ProtoDecoder());
        map.put(C8722v.class, new _RoomLinkInfo_ProtoDecoder());
        map.put(C8704j.class, new _ChannelInfoInRoom_ProtoDecoder());
        map.put(C8713p.class, new _MatchInfo_ProtoDecoder());
        map.put(C8715b.class, new _MatchInfo_MatchSkinInfo_ProtoDecoder());
        map.put(C8714a.class, new _MatchInfo_FollowBtnSkin_ProtoDecoder());
        map.put(C8701g.class, new _BattleTask_ProtoDecoder());
        map.put(LiveCoreSDKData.class, new _LiveCoreSDKData_ProtoDecoder());
        map.put(PullData.class, new _LiveCoreSDKData_PullData_ProtoDecoder());
        map.put(Options.class, new _LiveCoreSDKData_Options_ProtoDecoder());
        map.put(Quality.class, new _LiveCoreSDKData_Quality_ProtoDecoder());
        map.put(C8727z.class, new _TopFanTicket_ProtoDecoder());
        map.put(C8852h.class, new _TextFormat_ProtoDecoder());
        map.put(C8853i.class, new _TextPiece_ProtoDecoder());
        map.put(C8856l.class, new _TextPiecePatternRef_ProtoDecoder());
        map.put(C8851g.class, new _Text_ProtoDecoder());
        map.put(C8845b.class, new _CommonMessageData_ProtoDecoder());
        map.put(C8857m.class, new _TextPieceUser_ProtoDecoder());
        map.put(C8849f.class, new _ProtoMessageFetchResult_ProtoDecoder());
        map.put(C8850a.class, new _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder());
        map.put(C8855k.class, new _TextPieceHeart_ProtoDecoder());
        map.put(C8854j.class, new _TextPieceGift_ProtoDecoder());
        map.put(C8847d.class, new _PatternRef_ProtoDecoder());
    }
}
