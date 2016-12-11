<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>$Title$</title>
</head>
<body>
    <#assign score="${score}"?number/>
    <#if (score>100)>
        棒
        <#elseif (score>60)>
        中
        <#else>
        差
    </#if>
</body>
</html>