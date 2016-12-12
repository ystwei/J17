<#macro do>
    <h1><#nested></h1>
    <h2><#nested></h2>
    <h3><#nested></h3>
</#macro>

<@do>哈尔滨</@do>

<#macro ni>
<h1><#nested "a" 1 3></h1>
<h2><#nested "b" 2 4></h2>
<h3><#nested "c" 3 5></h3>
</#macro>

<@ni ; x ,y ,z>
  <h2>${x}</h2>
  <font color="blue">${y}</font>
  <i>${z}</i>
</@ni>

<#macro she count>
    <#list 1..count as i>
        <#nested  i i-1 i==count >
        <#if i==count>
          <#return>
        </#if>
        你好
    </#list>

</#macro>
<br/>
<@she 4 ; x,y,z>
    ${x}--${y}--
    <#if z>
      结束
    </#if>


</@she>