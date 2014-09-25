package cn.hofan.email.entity.constant;

/**
 * 邮件类型：1 收件箱，2 异常邮件箱，3 待发送邮件，4 发件箱，5 废件箱，6 归档邮件
 * @author lizhao  2014/9/23.
 */

public enum EmailType {
    /**
     * 1 收件箱
     */
    INBOX(1),
    /**
     * 2 异常邮件箱
     */
    ERROR_INBOX(2),
    /**
     * 3 待发送邮件
     */
    DRAFTS(3),
    /**
     * 4 发件箱，
     */
    SENT(4),
    /**
     * 5 废件箱
     */
    TRASH(5),
    /**
     * 6 归档邮件
     */
    ARCHIVE(6);

    private int value;
    EmailType(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }

    }
