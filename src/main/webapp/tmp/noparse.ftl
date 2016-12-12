<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>$Title$</title>
</head>
<body>
    <#assign animals=["Dog","Cat"]/>
    <#noparse>
      <#list animals as a>
          我的${a}宠物！

      </#list>
    </#noparse>

</body>
</html>