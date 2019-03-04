<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
<h2>Alien Weight Calculator</h2>
	<c:url var="weightSearchResult" value="/weightResult" />
	<form action="${weightSearchResult}" method="GET">
		<div>
			<label for="planets">Choose a Planet</label>
			<select name="planets" id="planet">
				<option value="mercury">Mercury</option>
				<option value="venus">Venus</option>
				<option value="mars">Mars</option>
				<option value="jupiter">Jupiter</option>
				<option value="saturn">Saturn</option>
				<option value="uranus">Uranus</option>
				<option value="neptune">Neptune</option>
			</select>
		</div>
		<div>
			<label for="weight">Enter Your Earth Weight</label>
			<input type="text" name="weight" id="weight"/>
		</div>
			<input type="submit" value="Submit" style="margin-left:224px;">
		<div>
		</div>
	</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />