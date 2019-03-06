<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<c:import url="/WEB-INF/jsp/common/header.jsp"/>
	
<section id="main-content">
<h3>Solar System Geek Gift Shop</h3>
	<div id="list-flexbox">
		<c:forEach var="product" items="${products}">
			<div id="list-item">
				<c:url var="productDetailUrl" value="/productDetail">
					<c:param name="id" value="${product.id}" />
				</c:url>
				<div id="list-image">
					<c:url value="img/${product.imageName}" var="productImage" />
					<a href="${productDetailUrl}"><img src="${productImage}"></a>
				</div>
				<div id="list-text">
					<div id="list-name">
						<a href="${productDetailUrl}"><c:out value="${product.name}" /></a>
					</div>
					<div id="list-price">
						<c:out value="${product.price}"/>
					</div>
				</div>
			</div>
	    </c:forEach>
	</div>
</section>
		
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>