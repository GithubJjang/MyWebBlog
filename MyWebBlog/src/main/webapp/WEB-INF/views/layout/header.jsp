<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
  
	 <!-- jQuery,Bootstrap 3 or 4 or 5 라이브러리 -->
	<link href="https://stackpath.bootstrapcdn.com/bootstrap
	/3.4.1/css/bootstrap.min.css" rel="stylesheet">
	<!-- <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>  -->
	<script src="https://stackpath.bootstrapcdn.com/bootstrap
	/3.4.1/js/bootstrap.min.js"></script>
	
	<!-- Summernote JS, CSS -->
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18
	/dist/summernote.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18
	/dist/summernote.min.js"></script>
  
</head>
<body>


<nav class="navbar navbar-expand-sm bg-success navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/">HOME</a>
    </li>
  </ul>

  <!--회원가입 페이지로 이동-->
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/sign">회원가입</a>
    </li>
  </ul>

  <!--글쓰기 페이지로 이동-->
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/board/write">글쓰기</a>
    </li>
  </ul>
</nav>

</body>
</html>