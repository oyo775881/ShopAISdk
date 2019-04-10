package top.yokey.shopaisdk.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@SuppressWarnings("ALL")
public class MemberBean implements Serializable {

    @SerializedName("user_name")
    private String userName = "";
    @SerializedName("avatar")
    private String avatar = "";
    @SerializedName("level")
    private String level = "";
    @SerializedName("level_name")
    private String levelName = "";
    @SerializedName("favorites_store")
    private String favoritesStore = "";
    @SerializedName("favorites_goods")
    private String favoritesGoods = "";
    @SerializedName("order_nopay_count")
    private String orderNopayCount = "";
    @SerializedName("order_noreceipt_count")
    private String orderNoreceiptCount = "";
    @SerializedName("order_notakes_count")
    private String orderNotakesCount = "";
    @SerializedName("order_noeval_count")
    private String orderNoevalCount = "";
    @SerializedName("return")
    private String returnX = "";
    @SerializedName("is_fxuser")
    private String isFxuser = "";
    @SerializedName("member_info_all")
    private MemberInfoAllBean memberInfoAll = null;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getFavoritesStore() {
        return favoritesStore;
    }

    public void setFavoritesStore(String favoritesStore) {
        this.favoritesStore = favoritesStore;
    }

    public String getFavoritesGoods() {
        return favoritesGoods;
    }

    public void setFavoritesGoods(String favoritesGoods) {
        this.favoritesGoods = favoritesGoods;
    }

    public String getOrderNopayCount() {
        return orderNopayCount;
    }

    public void setOrderNopayCount(String orderNopayCount) {
        this.orderNopayCount = orderNopayCount;
    }

    public String getOrderNoreceiptCount() {
        return orderNoreceiptCount;
    }

    public void setOrderNoreceiptCount(String orderNoreceiptCount) {
        this.orderNoreceiptCount = orderNoreceiptCount;
    }

    public String getOrderNotakesCount() {
        return orderNotakesCount;
    }

    public void setOrderNotakesCount(String orderNotakesCount) {
        this.orderNotakesCount = orderNotakesCount;
    }

    public String getOrderNoevalCount() {
        return orderNoevalCount;
    }

    public void setOrderNoevalCount(String orderNoevalCount) {
        this.orderNoevalCount = orderNoevalCount;
    }

    public String getReturnX() {
        return returnX;
    }

    public void setReturnX(String returnX) {
        this.returnX = returnX;
    }

    public String getIsFxuser() {
        return isFxuser;
    }

    public void setIsFxuser(String isFxuser) {
        this.isFxuser = isFxuser;
    }

    public MemberInfoAllBean getMemberInfoAll() {
        return memberInfoAll;
    }

    public void setMemberInfoAll(MemberInfoAllBean memberInfoAll) {
        this.memberInfoAll = memberInfoAll;
    }

    public static class MemberInfoAllBean {

        @SerializedName("member_id")
        private String memberId = "";
        @SerializedName("member_name")
        private String memberName = "";
        @SerializedName("member_truename")
        private String memberTruename = "";
        @SerializedName("member_avatar")
        private String memberAvatar = "";
        @SerializedName("member_sex")
        private String memberSex = "";
        @SerializedName("member_birthday")
        private String memberBirthday = "";
        @SerializedName("member_passwd")
        private String memberPasswd = "";
        @SerializedName("member_paypwd")
        private String memberPaypwd = "";
        @SerializedName("member_email")
        private String memberEmail = "";
        @SerializedName("member_email_bind")
        private String memberEmailBind = "";
        @SerializedName("member_mobile")
        private String memberMobile = "";
        @SerializedName("member_mobile_bind")
        private String memberMobileBind = "";
        @SerializedName("member_qq")
        private String memberQq = "";
        @SerializedName("member_ww")
        private String memberWw = "";
        @SerializedName("member_login_num")
        private String memberLoginNum = "";
        @SerializedName("member_time")
        private String memberTime = "";
        @SerializedName("member_login_time")
        private String memberLoginTime = "";
        @SerializedName("member_old_login_time")
        private String memberOldLoginTime = "";
        @SerializedName("member_login_ip")
        private String memberLoginIp = "";
        @SerializedName("member_old_login_ip")
        private String memberOldLoginIp = "";
        @SerializedName("member_qqopenid")
        private String memberQqopenid = "";
        @SerializedName("member_qqinfo")
        private String memberQqinfo = "";
        @SerializedName("member_sinaopenid")
        private String memberSinaopenid = "";
        @SerializedName("member_sinainfo")
        private String memberSinainfo = "";
        @SerializedName("weixin_unionid")
        private String weixinUnionid = "";
        @SerializedName("weixin_info")
        private String weixinInfo = "";
        @SerializedName("member_points")
        private String memberPoints = "";
        @SerializedName("available_predeposit")
        private String availablePredeposit = "";
        @SerializedName("freeze_predeposit")
        private String freezePredeposit = "";
        @SerializedName("available_rc_balance")
        private String availableRcBalance = "";
        @SerializedName("freeze_rc_balance")
        private String freezeRcBalance = "";
        @SerializedName("inform_allow")
        private String informAllow = "";
        @SerializedName("is_buy")
        private String isBuy = "";
        @SerializedName("is_allowtalk")
        private String isAllowtalk = "";
        @SerializedName("member_state")
        private String memberState = "";
        @SerializedName("member_snsvisitnum")
        private String memberSnsvisitnum = "";
        @SerializedName("member_areaid")
        private String memberAreaid = "";
        @SerializedName("member_cityid")
        private String memberCityid = "";
        @SerializedName("member_provinceid")
        private String memberProvinceid = "";
        @SerializedName("member_areainfo")
        private String memberAreainfo = "";
        @SerializedName("member_privacy")
        private String memberPrivacy = "";
        @SerializedName("member_exppoints")
        private String memberExppoints = "";
        @SerializedName("invite_one")
        private String inviteOne = "";
        @SerializedName("invite_two")
        private String inviteTwo = "";
        @SerializedName("invite_three")
        private String inviteThree = "";
        @SerializedName("inviter_id")
        private String inviterId = "";
        @SerializedName("trad_amount")
        private String tradAmount = "";
        @SerializedName("auth_message")
        private String authMessage = "";
        @SerializedName("fx_state")
        private String fxState = "";
        @SerializedName("bill_user_name")
        private String billUserName = "";
        @SerializedName("bill_type_code")
        private String billTypeCode = "";
        @SerializedName("bill_type_number")
        private String billTypeNumber = "";
        @SerializedName("bill_bank_name")
        private String billBankName = "";
        @SerializedName("freeze_trad")
        private String freezeTrad = "";
        @SerializedName("fx_code")
        private String fxCode = "";
        @SerializedName("fx_time")
        private String fxTime = "";
        @SerializedName("fx_handle_time")
        private String fxHandleTime = "";
        @SerializedName("fx_show")
        private String fxShow = "";
        @SerializedName("quit_time")
        private String quitTime = "";
        @SerializedName("fx_apply_times")
        private String fxApplyTimes = "";
        @SerializedName("fx_quit_times")
        private String fxQuitTimes = "";
        @SerializedName("member_reg_ip")
        private String memberRegIp = "";
        @SerializedName("registration_id")
        private String registrationId = "";
        @SerializedName("client_type")
        private String clientType = "";
        @SerializedName("openid")
        private String openid = "";
        @SerializedName("token")
        private String token = "";
        @SerializedName("level_name")
        private String levelName = "";
        @SerializedName("store_id")
        private String storeId = "";

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberTruename() {
            return memberTruename;
        }

        public void setMemberTruename(String memberTruename) {
            this.memberTruename = memberTruename;
        }

        public String getMemberAvatar() {
            return memberAvatar;
        }

        public void setMemberAvatar(String memberAvatar) {
            this.memberAvatar = memberAvatar;
        }

        public String getMemberSex() {
            return memberSex;
        }

        public void setMemberSex(String memberSex) {
            this.memberSex = memberSex;
        }

        public String getMemberBirthday() {
            return memberBirthday;
        }

        public void setMemberBirthday(String memberBirthday) {
            this.memberBirthday = memberBirthday;
        }

        public String getMemberPasswd() {
            return memberPasswd;
        }

        public void setMemberPasswd(String memberPasswd) {
            this.memberPasswd = memberPasswd;
        }

        public String getMemberPaypwd() {
            return memberPaypwd;
        }

        public void setMemberPaypwd(String memberPaypwd) {
            this.memberPaypwd = memberPaypwd;
        }

        public String getMemberEmail() {
            return memberEmail;
        }

        public void setMemberEmail(String memberEmail) {
            this.memberEmail = memberEmail;
        }

        public String getMemberEmailBind() {
            return memberEmailBind;
        }

        public void setMemberEmailBind(String memberEmailBind) {
            this.memberEmailBind = memberEmailBind;
        }

        public String getMemberMobile() {
            return memberMobile;
        }

        public void setMemberMobile(String memberMobile) {
            this.memberMobile = memberMobile;
        }

        public String getMemberMobileBind() {
            return memberMobileBind;
        }

        public void setMemberMobileBind(String memberMobileBind) {
            this.memberMobileBind = memberMobileBind;
        }

        public String getMemberQq() {
            return memberQq;
        }

        public void setMemberQq(String memberQq) {
            this.memberQq = memberQq;
        }

        public String getMemberWw() {
            return memberWw;
        }

        public void setMemberWw(String memberWw) {
            this.memberWw = memberWw;
        }

        public String getMemberLoginNum() {
            return memberLoginNum;
        }

        public void setMemberLoginNum(String memberLoginNum) {
            this.memberLoginNum = memberLoginNum;
        }

        public String getMemberTime() {
            return memberTime;
        }

        public void setMemberTime(String memberTime) {
            this.memberTime = memberTime;
        }

        public String getMemberLoginTime() {
            return memberLoginTime;
        }

        public void setMemberLoginTime(String memberLoginTime) {
            this.memberLoginTime = memberLoginTime;
        }

        public String getMemberOldLoginTime() {
            return memberOldLoginTime;
        }

        public void setMemberOldLoginTime(String memberOldLoginTime) {
            this.memberOldLoginTime = memberOldLoginTime;
        }

        public String getMemberLoginIp() {
            return memberLoginIp;
        }

        public void setMemberLoginIp(String memberLoginIp) {
            this.memberLoginIp = memberLoginIp;
        }

        public String getMemberOldLoginIp() {
            return memberOldLoginIp;
        }

        public void setMemberOldLoginIp(String memberOldLoginIp) {
            this.memberOldLoginIp = memberOldLoginIp;
        }

        public String getMemberQqopenid() {
            return memberQqopenid;
        }

        public void setMemberQqopenid(String memberQqopenid) {
            this.memberQqopenid = memberQqopenid;
        }

        public String getMemberQqinfo() {
            return memberQqinfo;
        }

        public void setMemberQqinfo(String memberQqinfo) {
            this.memberQqinfo = memberQqinfo;
        }

        public String getMemberSinaopenid() {
            return memberSinaopenid;
        }

        public void setMemberSinaopenid(String memberSinaopenid) {
            this.memberSinaopenid = memberSinaopenid;
        }

        public String getMemberSinainfo() {
            return memberSinainfo;
        }

        public void setMemberSinainfo(String memberSinainfo) {
            this.memberSinainfo = memberSinainfo;
        }

        public String getWeixinUnionid() {
            return weixinUnionid;
        }

        public void setWeixinUnionid(String weixinUnionid) {
            this.weixinUnionid = weixinUnionid;
        }

        public String getWeixinInfo() {
            return weixinInfo;
        }

        public void setWeixinInfo(String weixinInfo) {
            this.weixinInfo = weixinInfo;
        }

        public String getMemberPoints() {
            return memberPoints;
        }

        public void setMemberPoints(String memberPoints) {
            this.memberPoints = memberPoints;
        }

        public String getAvailablePredeposit() {
            return availablePredeposit;
        }

        public void setAvailablePredeposit(String availablePredeposit) {
            this.availablePredeposit = availablePredeposit;
        }

        public String getFreezePredeposit() {
            return freezePredeposit;
        }

        public void setFreezePredeposit(String freezePredeposit) {
            this.freezePredeposit = freezePredeposit;
        }

        public String getAvailableRcBalance() {
            return availableRcBalance;
        }

        public void setAvailableRcBalance(String availableRcBalance) {
            this.availableRcBalance = availableRcBalance;
        }

        public String getFreezeRcBalance() {
            return freezeRcBalance;
        }

        public void setFreezeRcBalance(String freezeRcBalance) {
            this.freezeRcBalance = freezeRcBalance;
        }

        public String getInformAllow() {
            return informAllow;
        }

        public void setInformAllow(String informAllow) {
            this.informAllow = informAllow;
        }

        public String getIsBuy() {
            return isBuy;
        }

        public void setIsBuy(String isBuy) {
            this.isBuy = isBuy;
        }

        public String getIsAllowtalk() {
            return isAllowtalk;
        }

        public void setIsAllowtalk(String isAllowtalk) {
            this.isAllowtalk = isAllowtalk;
        }

        public String getMemberState() {
            return memberState;
        }

        public void setMemberState(String memberState) {
            this.memberState = memberState;
        }

        public String getMemberSnsvisitnum() {
            return memberSnsvisitnum;
        }

        public void setMemberSnsvisitnum(String memberSnsvisitnum) {
            this.memberSnsvisitnum = memberSnsvisitnum;
        }

        public String getMemberAreaid() {
            return memberAreaid;
        }

        public void setMemberAreaid(String memberAreaid) {
            this.memberAreaid = memberAreaid;
        }

        public String getMemberCityid() {
            return memberCityid;
        }

        public void setMemberCityid(String memberCityid) {
            this.memberCityid = memberCityid;
        }

        public String getMemberProvinceid() {
            return memberProvinceid;
        }

        public void setMemberProvinceid(String memberProvinceid) {
            this.memberProvinceid = memberProvinceid;
        }

        public String getMemberAreainfo() {
            return memberAreainfo;
        }

        public void setMemberAreainfo(String memberAreainfo) {
            this.memberAreainfo = memberAreainfo;
        }

        public String getMemberPrivacy() {
            return memberPrivacy;
        }

        public void setMemberPrivacy(String memberPrivacy) {
            this.memberPrivacy = memberPrivacy;
        }

        public String getMemberExppoints() {
            return memberExppoints;
        }

        public void setMemberExppoints(String memberExppoints) {
            this.memberExppoints = memberExppoints;
        }

        public String getInviteOne() {
            return inviteOne;
        }

        public void setInviteOne(String inviteOne) {
            this.inviteOne = inviteOne;
        }

        public String getInviteTwo() {
            return inviteTwo;
        }

        public void setInviteTwo(String inviteTwo) {
            this.inviteTwo = inviteTwo;
        }

        public String getInviteThree() {
            return inviteThree;
        }

        public void setInviteThree(String inviteThree) {
            this.inviteThree = inviteThree;
        }

        public String getInviterId() {
            return inviterId;
        }

        public void setInviterId(String inviterId) {
            this.inviterId = inviterId;
        }

        public String getTradAmount() {
            return tradAmount;
        }

        public void setTradAmount(String tradAmount) {
            this.tradAmount = tradAmount;
        }

        public String getAuthMessage() {
            return authMessage;
        }

        public void setAuthMessage(String authMessage) {
            this.authMessage = authMessage;
        }

        public String getFxState() {
            return fxState;
        }

        public void setFxState(String fxState) {
            this.fxState = fxState;
        }

        public String getBillUserName() {
            return billUserName;
        }

        public void setBillUserName(String billUserName) {
            this.billUserName = billUserName;
        }

        public String getBillTypeCode() {
            return billTypeCode;
        }

        public void setBillTypeCode(String billTypeCode) {
            this.billTypeCode = billTypeCode;
        }

        public String getBillTypeNumber() {
            return billTypeNumber;
        }

        public void setBillTypeNumber(String billTypeNumber) {
            this.billTypeNumber = billTypeNumber;
        }

        public String getBillBankName() {
            return billBankName;
        }

        public void setBillBankName(String billBankName) {
            this.billBankName = billBankName;
        }

        public String getFreezeTrad() {
            return freezeTrad;
        }

        public void setFreezeTrad(String freezeTrad) {
            this.freezeTrad = freezeTrad;
        }

        public String getFxCode() {
            return fxCode;
        }

        public void setFxCode(String fxCode) {
            this.fxCode = fxCode;
        }

        public String getFxTime() {
            return fxTime;
        }

        public void setFxTime(String fxTime) {
            this.fxTime = fxTime;
        }

        public String getFxHandleTime() {
            return fxHandleTime;
        }

        public void setFxHandleTime(String fxHandleTime) {
            this.fxHandleTime = fxHandleTime;
        }

        public String getFxShow() {
            return fxShow;
        }

        public void setFxShow(String fxShow) {
            this.fxShow = fxShow;
        }

        public String getQuitTime() {
            return quitTime;
        }

        public void setQuitTime(String quitTime) {
            this.quitTime = quitTime;
        }

        public String getFxApplyTimes() {
            return fxApplyTimes;
        }

        public void setFxApplyTimes(String fxApplyTimes) {
            this.fxApplyTimes = fxApplyTimes;
        }

        public String getFxQuitTimes() {
            return fxQuitTimes;
        }

        public void setFxQuitTimes(String fxQuitTimes) {
            this.fxQuitTimes = fxQuitTimes;
        }

        public String getMemberRegIp() {
            return memberRegIp;
        }

        public void setMemberRegIp(String memberRegIp) {
            this.memberRegIp = memberRegIp;
        }

        public String getRegistrationId() {
            return registrationId;
        }

        public void setRegistrationId(String registrationId) {
            this.registrationId = registrationId;
        }

        public String getClientType() {
            return clientType;
        }

        public void setClientType(String clientType) {
            this.clientType = clientType;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getLevelName() {
            return levelName;
        }

        public void setLevelName(String levelName) {
            this.levelName = levelName;
        }

        public String getStoreId() {
            return storeId;
        }

        public void setStoreId(String storeId) {
            this.storeId = storeId;
        }

    }

}
