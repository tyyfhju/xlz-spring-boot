package com.zjy.xlz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XlzApplicationTests {

//    @Autowired
//    JavaMailSender javaMailSender; //可直接注入邮件发送的对象
//
//    @Value("${spring.mail.username}") //动态获取配置文件中 发送邮件的账户
//    private String sendemail;

    @Test
    void contextLoads() {
//        //随机生成一个四位数的验证码
//        int yzm = new Random().nextInt(9999) % (9999 - 1000 + 1) + 1000;
//        //创建简单邮件消息
//        SimpleMailMessage message = new SimpleMailMessage();
//        //谁发的
//        message.setFrom(sendemail);
//        //谁要接收
//        message.setTo("1532328736@qq.com");
//        //邮件标题
//        message.setSubject("欢迎访问行路者旅游网站");
//        //邮件内容
//        message.setText("您的验证码是"+yzm);
//        javaMailSender.send(message);
    }

}
