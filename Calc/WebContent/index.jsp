<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<script>
function openFile(){        
        var name="blankPrint";                           //网页名称，可为空;
        var iWidth=window.screen.availWidth/2;                          //弹出窗口的宽度;
        var iHeight=window.screen.availHeight/2;                        //弹出窗口的高度;
        var iTop = (window.screen.availHeight-30-iHeight)/2;       //获得窗口的垂直位置;
        var iLeft = (window.screen.availWidth-10-iWidth)/2;           //获得窗口的水平位置;
        window.open("index.jsp",name,'resizable=yes,height='+iHeight+',innerHeight='+iHeight+',width='+iWidth+',innerWidth='+iWidth+',top='+iTop+',left='+iLeft);

    </script>




        <title>点击文字弹出一个DIV层窗口代码</title> 
        <style> 
        .black_overlay{ 
            display: none; 
            position: absolute; 
            top: 0%; 
            left: 0%; 
            width: 100%; 
            height: 100%; 
            background-color: black; 
            z-index:1001; 
            -moz-opacity: 0.8; 
            opacity:.80; 
            filter: alpha(opacity=88); 
        } 
        .white_content { 
            display: none; 
            position: absolute; 
            top: 25%; 
            left: 25%; 
            width: 55%; 
            height: 55%; 
            padding: 20px; 
            border: 10px solid orange; 
            background-color: white; 
            z-index:1002; 
            overflow: auto; 
        } 
    </style> 
    
     
        <p>示例弹出层：
<a href = "javascript:void(0)" onclick = "document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'">
请点这里
</a>
</p> 
<input type="button"; onclick="openFile()" value="aa"/>
<li><a href="index.jsp" target="_blank">Preface</a></li>
        <div id="light" class="white_content">这是一个层窗口示例程序. 
        <table border = '1'>
<tr style="background-color:red"><td>aaa</td></tr>
<tr><td>bbb</td></tr>
</table>
<a href = "javascript:void(0)" onclick = "document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'">
点这里关闭本窗口
</a>

</div> 
        <div id="fade" class="black_overlay"></div> 
    

</html>