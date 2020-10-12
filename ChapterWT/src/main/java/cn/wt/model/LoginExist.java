package cn.wt.model;

import lombok.Data;

@Data
public class LoginExist {
    private String version;  //版本号
    private String channelId; //分配的id
    private String time; //时间戳
    private String randomCode; //32位随机
    private String sign; //生成签名
    private String data; //具体参数
    private String jsCode; //微信的授权码
    private String developPerson;
    private String sdt;

}
