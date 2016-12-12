<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>$Title$</title>
</head>
<body>
    <#escape el as el?html>
        ${msg}

        <#noescape>
            ${msg}
        </#noescape>
    </#escape>
    ${msg?html}
</body>
</html>