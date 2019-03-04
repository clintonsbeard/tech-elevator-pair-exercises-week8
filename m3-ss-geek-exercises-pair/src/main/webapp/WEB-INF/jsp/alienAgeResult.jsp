<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content" style="position:relative;">
<h2>Alien Age Calculator Results</h2>
	
	<img src="img/${param.planets}.jpg">
	<div style="display:inline-block; position:absolute; top:85px; left:270px">
		<c:out value="If you are ${param.age} years old on planet Earth, then you are ${estimate.resultAge} ${param.planets} years old." />
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />