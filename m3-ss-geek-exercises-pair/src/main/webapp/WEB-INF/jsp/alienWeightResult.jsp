<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content" style="position:relative;">
<h2>Alien Weight Calculator Results</h2>
	
	<img src="img/${param.planets}.jpg">
	<div style="display:inline-block; position:absolute; top:85px; left:270px">
		<c:out value="If you are ${param.weight} lbs on planet Earth, you would weigh ${estimate.resultWeight} lbs on ${param.planets}." />
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />