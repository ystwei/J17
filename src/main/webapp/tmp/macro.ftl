<#macro test day time hour>
    ${day}--${time}--${hour}
</#macro>
<h1><@test day=100 time=200 hour=300/></h1>

<h3><@test day=100 time=200 hour=300/></h3>

<#macro test day time=200 hour=400>
${day}--${time}--${hour}
</#macro>
<h3><@test day=100/></h3>

<#macro my title items>
    ${title?substring(0,3)}
    <#list items as i>
        <#if i_index%2==0>
          <font color="red">${i?cap_first}</font>
        <#else>
          <font color="blue">${i?cap_first}</font>
        </#if>

    </#list>
</#macro>

<@my items=["abc","def","ghi","<b>xz</b>"] title="MyWorld"/>


<#macro her  extra...>
    <img
      <#list extra?keys as k>
        ${k}="${extra[k]}"
      </#list>

    />

</#macro>
<@her src="images/2.gif" width="100" height="30" />

<@her src="images/2.gif" />

<@her width="100" height="30" />