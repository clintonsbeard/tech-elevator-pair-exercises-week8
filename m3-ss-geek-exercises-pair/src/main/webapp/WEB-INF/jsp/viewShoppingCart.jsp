<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<c:import url="/WEB-INF/jsp/common/header.jsp"/>
	
<section id="main-content">
<h3>Solar System Geek Gift Shop</h3>
	<table id="cartTable">
		<tr>
			<td></td>
			<td>Name</td>
			<td>Price</td>
			<td>Qty.</td>
			<td>Total</td>
		</tr>
		<c:forEach items="" var="">
			<tr>
				<td>Image</td>
				<td>Name</td>
				<td>Price</td>
				<td>Qty.</td>
				<td>Total</td>
			</tr>
		</c:forEach>
	</table>
	
</section>
		
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>