<%@include file="/WEB-INF/templates/include.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="${allUser}" var="usr">
	<div class="follw_user">	
		<img src="<%=SpittrConstant.IMAGEROOTURL%>male_default.png"> &nbsp; &nbsp;
		<span class="ProfileCard-actions"> ${usr.usrfn}</span>		
		<span class="follow_button"><a href="follow?id=${usr.usrid}">following</a></span>
	</div>
</c:forEach>
