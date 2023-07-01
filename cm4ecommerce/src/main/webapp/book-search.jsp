<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class = "header">
		<form action="book-search.jsp">
		 <input type="text" name="bookName" value="${param.bookName}"> 
		 <input type="submit" value="Search">
		</form>
	</div>
	<hr>
	<div class="body">
	
		<div class="sub-body-category">
			<ul>
				<c:forEach var="category" items="${categoryList}">
					<a href="home?categoryId=${category.id}">
						<li>${category.name}</li>
					</a>
				</c:forEach>
			</ul>
		</div>
		<div class="sub-body-search">
		
		<c:if test="${empty bookList}">
			NO BOOK AVAILABLE
		</c:if>	
		<c:if test="${not empty bookList}">
			<ul>
				<c:forEach var="book" items="${bookList}">
					<a href="search?bookName="${'%'}${book.name}${'%'}">
						<li>${book.name}</li>
					</a>
				</c:forEach>
			</ul>
		</c:if>	
		</div>
		
	</div>
</body>
</html>