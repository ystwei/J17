<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>$Title$</title>
</head>
<body>
    <#assign test=1/>
    <#assign test=test+1 season=["CHINESE","RUSSIAN","JAPANESE"]/>
    ${test}
    ${season[0]}
    <#assign msg="Hello${msg?html}"/>
    ${msg}
    <#global msg="你好吗？"/>
     ${.globals.msg}
    <#assign salary=0.8/>
    ${salary}
    <#setting number_format="percent"/>
    <#setting number_format="currency"/>
    ${salary}
</body>
</html>