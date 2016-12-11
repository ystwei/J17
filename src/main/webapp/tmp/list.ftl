<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>$Title$</title>
</head>
<body>
    <#assign  season=["春","夏","秋","冬"]/>
    <#list season as s>
    ${s}

    </#list>


    <#list users as s>
      ${s_index}: <#if s_has_next> , <#else> </#if> ${s.username}
    </#list>
</body>
</html>