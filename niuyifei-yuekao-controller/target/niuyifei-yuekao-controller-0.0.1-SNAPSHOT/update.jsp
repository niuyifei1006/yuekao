<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){	
		$.post("selType",function(date){
			for ( var i in date) {
				$("#tid").append("<option value='"+date[i].tid+"'>"+date[i].tname+"</option>");
			}
			$("#tid").val("${meet.tid}");
		});
		
		$.post("selServer",function(date){
			for ( var i in date) {
				$("#sid").append("<input text='checkbox' name='sid' value='"+date[i].sid+"'>"+date[i].sname);
			}
		})
	})	
</script>
<script type="text/javascript">
	function updateMeet(){
		$.post("updateMeet",$("form").serialize(),function(date){
			if (date) {
				alert("修改成功");
				location.href="list";
			} else {
				alert("修改失败");
			}
		})
	}
</script>
</head>
<body>
	<form action="#">
		<input type="hidden" name="mid" value="${meet.mid }">
		会议编号:<input type="text" name="code" value="${meet.code }"><br><br>
		会议名称:<input type="text" name="mname" value="${meet.mname }"><br><br>
		会议类型:<select id="tid" name="tid">
				<option value="">请选择</option>
			</select><br><br>
		<div id="sid" name="sid">
			会议服务:
		</div><br><br>
		会议日期:<input type="date" name="starttime" value="${meet.starttime }"> 至
				<input type="date" name="endtime" value="${meet.endtime }"><br><br>
		<input type="button" value="修改" onclick="updateMeet()">
	</form>
</body>
</html>