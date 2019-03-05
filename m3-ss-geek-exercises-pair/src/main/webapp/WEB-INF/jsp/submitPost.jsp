<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
<h2>New Geek Post</h2>
	<c:url var="submitPostResult" value="/postProcessor" />
	<form action="${submitPostResult}" method="POST">
		<div>
			<label for="username">Username</label>
			<input type="text" name="username"/>
		</div>
		<div>
			<label for="subject">Subject</label>
			<input type="text" name="subject"/>
		</div>
		<div>
			<label for="message">Message</label>
			<textarea name="message"></textarea>
		</div>
		<button type="submit">Submit</button>
	</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />