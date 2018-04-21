package com.mirsfang.daodian.entitis;

/**
 * 登陆对象
 * Created by Administrator on 2018/4/21.
 */

public class LoginEntity {
    public static final String KEY="KEY_LoginEntity";

    /**
     * SooID : null
     * SooTimeSign : null
     * RealName : null
     * Telephone : null
     * Sex : null
     * City : null
     * Address : null
     * HeadPic : null
     * RealNameState : null
     * AccountType : 0
     * ManageID : 0
     * AgentID : 0
     * UserID : 0
     * ShopID : 0
     * EmployeeID : 0
     * Success : -7
     * Msg : 鐢ㄦ埛鍚嶆垨瀵嗙爜閿欒
     * Body :
     */

    private String SooID;
    private String SooTimeSign;
    private String RealName;
    private String Telephone;
    private String Sex;
    private String City;
    private String Address;
    private String HeadPic;
    private String RealNameState;
    private int AccountType;
    private int ManageID;
    private int AgentID;
    private int UserID;
    private int ShopID;
    private int EmployeeID;
    private int Success;
    private String Msg;
    private String Body;


    public String getSooID() {
        return SooID;
    }

    public void setSooID(String sooID) {
        SooID = sooID;
    }

    public String getSooTimeSign() {
        return SooTimeSign;
    }

    public void setSooTimeSign(String sooTimeSign) {
        SooTimeSign = sooTimeSign;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getHeadPic() {
        return HeadPic;
    }

    public void setHeadPic(String headPic) {
        HeadPic = headPic;
    }

    public String getRealNameState() {
        return RealNameState;
    }

    public void setRealNameState(String realNameState) {
        RealNameState = realNameState;
    }

    public int getAccountType() {
        return AccountType;
    }

    public void setAccountType(int accountType) {
        AccountType = accountType;
    }

    public int getManageID() {
        return ManageID;
    }

    public void setManageID(int manageID) {
        ManageID = manageID;
    }

    public int getAgentID() {
        return AgentID;
    }

    public void setAgentID(int agentID) {
        AgentID = agentID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getShopID() {
        return ShopID;
    }

    public void setShopID(int shopID) {
        ShopID = shopID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public int getSuccess() {
        return Success;
    }

    public void setSuccess(int success) {
        Success = success;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }
}
