package cn.hofan.email.entity;

import java.io.Serializable;
import java.util.Date;

import cn.hofan.spat.db.dal.annotation.Column;
import cn.hofan.spat.db.dal.annotation.Id;
import cn.hofan.spat.db.dal.annotation.NotDBColumn;
import cn.hofan.spat.db.dal.annotation.Table;

import com.bj58.spat.gaea.serializer.component.annotation.GaeaMember;
import com.bj58.spat.gaea.serializer.component.annotation.GaeaSerializable;

/**
 */
@Table(name = "email_config")
@GaeaSerializable(name = "em.EmailConfig")
public class EmailConfig implements Serializable {

    @NotDBColumn
    private static final long serialVersionUID = 5458574899L;

    /**
     * id
     */
    @Id(insertable = true)
    @Column(name = "id")
    @GaeaMember
    private int id;

    /**
     * 账号id
     */
    @Column(name = "account_id")
    @GaeaMember
    private int accountId;

    /**
     * 邮箱地址
     */
    @Column(name = "email_address")
    @GaeaMember
    private String emailAddress;

    /**
     * pop服务
     */
    @Column(name = "pop_server")
    @GaeaMember
    private String popServer;

    /**
     * pop端口
     */
    @Column(name = "pop_port")
    @GaeaMember
    private int popPort;

    /**
     * smtp服务
     */
    @Column(name = "smtp_server")
    @GaeaMember
    private String smtpServer;

    /**
     * smtp端口
     */
    @Column(name = "smtp_port")
    @GaeaMember
    private int smtpPort;

    /**
     * 是否ssl加密：0否，1是
     */
    @Column(name = "is_ssl")
    @GaeaMember
    private int isSsl;

    /**
     * 密码
     */
    @Column(name = "passwd")
    @GaeaMember
    private String passwd;

    /**
     * 是否发送邮件，0否，1是
     */
    @Column(name = "is_send_email")
    @GaeaMember
    private int isSendEmail;

    /**
     * 是否接收邮件：0否，1是
     */
    @Column(name = "is_receive_email")
    @GaeaMember
    private int isReceiveEmail;

    /**
     * 代理服务器，scheme：http|https|socks4|socks5
     */
    @Column(name = "proxy_scheme")
    @GaeaMember
    private String proxyScheme;

    /**
     * 代理服务器ip
     */
    @Column(name = "proxy_ip")
    @GaeaMember
    private String proxyIP;

    /**
     * 代理服务器端口
     */
    @Column(name = "proxy_port")
    @GaeaMember
    private int proxyPort;

    /**
     * 代理服务器用户名
     */
    @Column(name = "proxy_username")
    @GaeaMember
    private String proxyUsername;

    /**
     * 代理服务器密码
     */
    @Column(name = "proxy_password")
    @GaeaMember
    private String proxyPassword;

    /**
     * 网页登录代理ip，格式：http:192.168.3.13:3128
     */
    @Column(name = "page_proxy")
    @GaeaMember
    private String pageProxy;

    /**
     * 发送数量
     */
    @Column(name = "send_qty_limit")
    @GaeaMember
    private int sendQtyLimit;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    @GaeaMember
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @GaeaMember
    private java.util.Date createTime;

    /**
     * 创建电脑名
     */
    @Column(name = "create_machine")
    @GaeaMember
    private String createMachine;

    /**
     * 最后更新人
     */
    @Column(name = "last_upd_user")
    @GaeaMember
    private String lastUpdUser;

    /**
     * 最后更新时间
     */
    @Column(name = "last_upd_time")
    @GaeaMember
    private java.util.Date lastUpdTime;

    /**
     * 最后更新机器名
     */
    @Column(name = "last_upd_machine")
    @GaeaMember
    private String lastUpdMachine;

    /**
     * 最后一次获取邮件的时间
     */
    @Column(name = "last_load_time")
    @GaeaMember
    private Date lastLoadTime;

    public EmailConfig() {
    }

    public EmailConfig(int id) {
        this.id = id;
    }

    public String getProxyUsername() {
        return proxyUsername;
    }

    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public String getProxyScheme() {
        return proxyScheme;
    }

    public void setProxyScheme(String proxyScheme) {
        this.proxyScheme = proxyScheme;
    }

    public String getProxyIP() {
        return proxyIP;
    }

    public void setProxyIP(String proxyIP) {
        this.proxyIP = proxyIP;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getPageProxy() {
        return pageProxy;
    }

    public void setPageProxy(String pageProxy) {
        this.pageProxy = pageProxy;
    }

    public Date getLastLoadTime() {
        return lastLoadTime;
    }

    public void setLastLoadTime(Date lastLoadTime) {
        this.lastLoadTime = lastLoadTime;
    }

    /**
     * getter----id
     */
    public int getId() {
        return id;
    }

    /**
     * setter----id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter----账号id
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * setter----账号id
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    /**
     * getter----邮箱地址
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * setter----邮箱地址
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * getter----pop服务
     */
    public String getPopServer() {
        return popServer;
    }

    /**
     * setter----pop服务
     */
    public void setPopServer(String popServer) {
        this.popServer = popServer;
    }

    /**
     * getter----pop端口
     */
    public int getPopPort() {
        return popPort;
    }

    /**
     * setter----pop端口
     */
    public void setPopPort(int popPort) {
        this.popPort = popPort;
    }

    /**
     * getter----smtp服务
     */
    public String getSmtpServer() {
        return smtpServer;
    }

    /**
     * setter----smtp服务
     */
    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    /**
     * getter----smtp端口
     */
    public int getSmtpPort() {
        return smtpPort;
    }

    /**
     * setter----smtp端口
     */
    public void setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
    }

    /**
     * getter----是否ssl加密：0否，1是
     */
    public int getIsSsl() {
        return isSsl;
    }

    /**
     * setter----是否ssl加密：0否，1是
     */
    public void setIsSsl(int isSsl) {
        this.isSsl = isSsl;
    }

    /**
     * getter----密码
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * setter----密码
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * getter----是否发送邮件，0否，1是
     */
    public int getIsSendEmail() {
        return isSendEmail;
    }

    /**
     * setter----是否发送邮件，0否，1是
     */
    public void setIsSendEmail(int isSendEmail) {
        this.isSendEmail = isSendEmail;
    }

    /**
     * getter----是否接收邮件：0否，1是
     */
    public int getIsReceiveEmail() {
        return isReceiveEmail;
    }

    /**
     * setter----是否接收邮件：0否，1是
     */
    public void setIsReceiveEmail(int isReceiveEmail) {
        this.isReceiveEmail = isReceiveEmail;
    }

    /**
     * getter----发送数量
     */
    public int getSendQtyLimit() {
        return sendQtyLimit;
    }

    /**
     * setter----发送数量
     */
    public void setSendQtyLimit(int sendQtyLimit) {
        this.sendQtyLimit = sendQtyLimit;
    }

    /**
     * getter----创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * setter----创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * getter----创建时间
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * setter----创建时间
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * getter----创建电脑名
     */
    public String getCreateMachine() {
        return createMachine;
    }

    /**
     * setter----创建电脑名
     */
    public void setCreateMachine(String createMachine) {
        this.createMachine = createMachine;
    }

    /**
     * getter----最后更新人
     */
    public String getLastUpdUser() {
        return lastUpdUser;
    }

    /**
     * setter----最后更新人
     */
    public void setLastUpdUser(String lastUpdUser) {
        this.lastUpdUser = lastUpdUser;
    }

    /**
     * getter----最后更新时间
     */
    public java.util.Date getLastUpdTime() {
        return lastUpdTime;
    }

    /**
     * setter----最后更新时间
     */
    public void setLastUpdTime(java.util.Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    /**
     * getter----最后更新机器名
     */
    public String getLastUpdMachine() {
        return lastUpdMachine;
    }

    /**
     * setter----最后更新机器名
     */
    public void setLastUpdMachine(String lastUpdMachine) {
        this.lastUpdMachine = lastUpdMachine;
    }

}
