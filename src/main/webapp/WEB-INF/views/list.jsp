<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ���ε�</title>
</head>
<body>
<div>
  <div>
    <h2>���� ���ε� ����</h2>
  </div>
  <h4>���� ���ε�</h4>

  <form action="/fileUpload" method="post" enctype="multipart/form-data">
    <ul>
      <li>��ǰ��<input type="text" name="itemName"></li>
      <li>����<input type="file" name="file" ></li>
    </ul>
    <input type="submit"/>
  </form>
</div>
</body>
</html>