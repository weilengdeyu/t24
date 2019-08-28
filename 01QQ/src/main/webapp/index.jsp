<%@page isELIgnored="false" pageEncoding="UTF-8" language="java" %>
<html>
<body>

<h2>QQ互联</h2>
<a onclick='toLogin()'>
    <img src="image/Connect_logo_4.png"></a>
<script>
    function toLogin()
    {
        //以下为按钮点击事件的逻辑。注意这里要重新打开窗口
        //否则后面跳转到QQ登录，授权页面时会直接缩小当前浏览器的窗口，而不是打开新窗口
        window.open("https://graph.qq.com/oauth2.0/authorize?response_type=code&client_id=101583052&redirect_uri=http://www.yyuming.vip/main/readbook.html&stat=happy","TencentLogin",
            "width=450,height=320,menubar=0,scrollbars=1,resizable=1,status=1,titlebar=0,toolbar=0,location=1");
    }
</script>
</body>
</html>
