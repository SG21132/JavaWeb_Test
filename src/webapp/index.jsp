<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
  <head>
     <meta charset="utf-8">
     <title>登录</title>
     <link rel="stylesheet" href="style.css">
  </head>
  <body class="body">
     <div class=" deng">
        <div class="box">
            <h1>学生选课系统登录</h1>
            <!--表单，注册or登录-->
            <form action="Server" method="post" class="form">
            <div><span>账号</span><br>&nbsp;&nbsp;<input class="input" type="text" name="username" placeholder="请输入账号"></input></div>
            <br>
            <div><span>密码</span><br>&nbsp;&nbsp;<input class="input" type="password" name="password" placeholder="请输入密码"></input></div>
            <br>&nbsp;&nbsp;
            <button type="submit" class="button">登录</button>
                &nbsp;&nbsp;&nbsp;
            <button type="submit" class="button">重置密码</button>
            </form>
        </div>
     </div>

  </body>
</html>