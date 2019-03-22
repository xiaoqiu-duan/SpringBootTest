package com.vince.model.Enum;

/**
 * Package: com.vince.model.Enum
 * User: 诸葛子房
 * Email: xiaoiqu2017wy@163.com
 * Date: 2019/3/21
 * Time: 14:34
 * Description:
 */
public enum ResultEnum {
    SUCESS(0, "success", "成功"),
    FAILED(1, "failed", "失败");

    private int code;
    private String name;
    private String desc;

    private ResultEnum(int code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
    }

    public int toCode() {
        return code;
    }

    public String toName() {
        return name;
    }

    public String toDesc() {
        return desc;
    }


    public static ResultEnum enumValueOf(Integer code) {
        ResultEnum[] values = ResultEnum.values();
        ResultEnum v = null;
        for (int i = 0; i < values.length; i++) {
            if (values[i].toCode() == code) {
                v = values[i];
                break;
            }
        }
        return v;
    }

    /**
     * 按英文编码获取对应的枚举类型
     *
     * @param name 英文编码
     * @return 枚举类型
     */
    public static ResultEnum enumValueOfName(String name) {
        ResultEnum[] values = ResultEnum.values();
        ResultEnum v = null;
        for (int i = 0; i < values.length; i++) {
            if (values[i].toName().equalsIgnoreCase(name)) {
                v = values[i];
                break;
            }
        }
        return v;
    }

    public static ResultEnum enumValueOfDesc(String desc) {
        ResultEnum[] values = ResultEnum.values();
        ResultEnum v = null;
        for (int i = 0; i < values.length; i++) {
            if (values[i].toDesc().equalsIgnoreCase(desc)) {
                v = values[i];
                break;
            }
        }
        return v;
    }


}
