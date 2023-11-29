<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ include file="../layout/header.jsp" %>

<div class="container">

<form enctype="multipart/form-data">
  <div class="form-group">
    <label for="title">Title</label>
    <input type="text" class="form-control" placeholder="Enter title" id="title">
  </div>
  
  <div class="form-group">
    <label for="content">Content</label>
    <textarea class="form-control summernote" rows="5" id="content"></textarea>
  </div>

  <div class="form-group">    
      <h4>단일 파일 업로드</h4>
      <input type="file" id="fileInput">
                
      <h4>다중 파일 업로드</h4>
      <input type="file" multiple="multiple" id="files">
  </div>
  
</form>

	<button id="btn-board-save" class="btn btn-primary">글쓰기완료</button>

</div>

  


<script src="/js/board.js">

</script>