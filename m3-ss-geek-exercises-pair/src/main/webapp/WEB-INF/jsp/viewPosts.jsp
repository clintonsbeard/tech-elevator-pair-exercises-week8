<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
<h2>Solar System Geek Forum</h2>
	<c:url var="submitPost" value="/submitPost"/>
	<a href="${submitPost}" class="centered">Post A Message</a>
	
	<div class="posts">
		<c:forEach items="${posts}" var="post">
			<div class="post">
				<h4><c:out value="${post.subject}"/></h4>
				<p>
				<c:out value="by ${post.username}"/>
					<fmt:parseDate var="parsedDate" pattern="yyyy-MM-dd'T'HH:mm:ss" value="${post.datePosted}"/>
					<fmt:formatDate var="d" type="date" pattern="MM/dd/yyyy" value="${parsedDate}"/>
					on ${d}
					<fmt:formatDate var="t" type="time" timeStyle="medium" value="${parsedDate}"/>
					at ${t}
				</p>
				<p class="message"><c:out value="${post.message}"/></p>
			</div>
		</c:forEach>
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />