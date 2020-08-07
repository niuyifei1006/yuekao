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
</head>
<body>
	<table>
		<tr>
			<td colspan="15">
				<form action="list" method="post">
					会议名称:<input type="text" name="mname">
					会议类型:<input type="text" name="tname">
					创建时间:<input type="date" name="starttime"> ~ <input type="date" name="endtime">
					<input type="submit" value="查询">
				</form>
				<a href="add.jsp">
				<input type="button" value="新增">
			</a>
			</td>
		</tr>
		<tr>
			<th>序号</th>
			<th>会议编号</th>
			<th>会议名称</th>
			<th>会议类型</th>
			<th>会议开始时间</th>
			<th>会议结束时间</th>
			<th>会议服务</th>
			<th>创建时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${page.list }" var="m">
			<tr>
				<td>${m.mid }</td>
				<td>${m.code }</td>
				<td>${m.mname }</td>
				<td>${m.tname }</td>
				<td>${m.starttime }</td>
				<td>${m.endtime }</td>
				<td>${m.sname }</td>
				<td>${m.createtime }</td>
				<td>
					<a href="delMeet?mid=${m.mid }">
						<input type="button" value="删除">
					</a>
					<a href="selMeetById?mid=${m.mid }">
						<input type="button" value="修改">
					</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="15">
				当前${page.pageNum }/${page.pages }页,共有${page.total }条记录
				<a href="list?pageNum=1">首页</a>
				<a href="list?pageNum=${page.pageNum -1 }">上一页</a>
				<a href="list?pageNum=${page.pageNum +1 }">下一页</a>
				<a href="list?pageNum=${page.pages }">末页</a>
			</td>
		</tr>
	</table>
</body>
</html>