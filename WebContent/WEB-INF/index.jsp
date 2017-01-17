<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<title>Firma</title>
</head>
<body>
<div class ="container">
<h1>Program firmowy</h1>
<hr/>
<div class="btn-group">
<a class="btn btn-primary btn-lg" href="<c:url value ="/list"/>">Lista pracowników</a>

</div> <hr/>
<div class="btn-group">
<a class="btn btn-primary btn-lg" href="<c:url value ="/employee-create"/>">Dodaj pracownika</a>

</div> <hr/>

<div class ="container">
<a class="btn btn-primary btn-lg" href="<c:url value ="/about"/>">O programie</a>

</div>


</div>
	


</body>
</html>