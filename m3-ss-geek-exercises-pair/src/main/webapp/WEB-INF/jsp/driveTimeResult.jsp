<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content" style="position:relative;">
<h2>Drive Time Calculator Results</h2>
	
	<img src="img/${param.planets}.jpg">
	<div style="display:inline-block; position:absolute; top:85px; left:270px">
		<c:out value="Traveling by ${param.transportations} you will reach ${param.planets} in ${estimate.timeTravelled} years.  You will be ${estimate.newAge} years old." />
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />