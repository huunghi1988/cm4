<%@page import="coding.mentor.entity.Category"%>
<%@page import="coding.mentor.service.CategoryService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
  box-sizing: border-box;
}
.sub-body-category {
  float: left;
  width: 20%;
  padding: 10px;
  
}

.sub-body-product {
  float: left;
  width: 80%;
  padding: 10px;
  
}

.body:after {
  content: "";
  display: table;
  clear: both;
}
</style>
</head>
<body>
	<div class = "header">
		<form action="home">
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
		<div class="sub-body-product">
		
		<c:if test="${empty bookList and empty bookListBySearch}">
			THERE IS NO BOOK AVAILABLE
		</c:if>	
		<c:if test="${not empty bookList}">
			<ul>
				<c:forEach var="book" items="${bookList}">
					<a href="book?bookId=${book.id}">
						<li>${book.name}</li>
					</a>
				</c:forEach>
			</ul>
		</c:if>	
		
		<c:if test="${not empty bookListBySearch}">
			<ul>
				<c:forEach var="book" items="${bookListBySearch}">
					<a href="search?bookName="${'%'}${book.name}${'%'}">
						<li>${book.name}</li>
					</a>
				</c:forEach>
			</ul>
		</c:if>	
		</div>
		
	</div>
<hr>
<div class="footer">THIS IS CODING MENTOR WEBSITE FOR BE 4</div>

</body>
</html>