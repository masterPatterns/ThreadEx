<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>파일 업로드</title>
</head>
<body>
<div>
  <div>
    <h2>파일 업로드 예제</h2>
  </div>
  <h4>파일 업로드</h4>

  <form action="/fileUpload" method="post" enctype="multipart/form-data">
    <ul>
      <li>상품명<input type="text" name="itemName"></li>
      <li>파일<input type="file" name="file" ></li>
    </ul>
    <input type="submit"/>
  </form>
</div>
</body>
</html>