<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<c:import url="/WEB-INF/jsp/common/header.jsp"/>
	
<section id="main-content">
<h3>Solar System Geek Gift Shop</h3>

	<div id="detailFlexbox">
		<div id="detailImg">
			<img src="img/${product.imageName}">
		</div>
		<div id="detailBox">
			<div id="detailName">
				<c:out value="${product.name}" />
			</div>
			<div id="detailPrice">
				<c:out value="${product.price}"/>
			</div>
			<div id="detailDesc">
				<c:out value="${product.description}" />
			</div>
			<div id="detailAddToCart">
				<form action="/addToCart" method="POST">
					<label for="quantity">Quantity to Buy</label>
					<input type="text" name="quantity"/>
					<input type="hidden" name="id" value="${product.id}"/>
					<input type="submit" value="Add to Cart"/>
				</form>
			</div>
		</div>
	</div>
</section>
		
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>