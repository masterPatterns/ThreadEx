<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<style media="screen">
		    div {
		      margin: 5px;
		      padding: 5px;
		      border: 1px solid #cccccc;
		      width: 100%-50px;
		      text-align: center;
		    }
		
		    body {
		      margin: 0 auto;
		      border: 1px solid #ccccc;
		    }
		
		    header {
		      width: 1380px;
		      height: 100px;
		      line-height: 100px;
		      margin: 0px auto;
		      text-align: center;
		    }
		
		    nav {
		      width: 1380px;
		      margin: 0px auto;
		      padding: 0 0 30px 0;
		    }
		
		    nav ul {
		      display: table;
		      overflow:hidden;
		      margin: 0 auto;
		      padding: 0;
		    }
		
		    nav ul li {
		      border: 1px solid #cccccc;
		      width:138px; height:40px;
		      float:left;
		      list-style:none;
		      text-align:center;
		      line-height: 40px;
		    }
		
		    article {
			  position: relative;
		      overflow:hidden;
 		      width: 1380px;
		      min-width: 1380px;
		      margin: 0px auto;
		      height: 100%;
		      min-height: 730px;
		    }
		    
		    article > iframe {
			  width: 100%;
		      height: 100%;
		      min-height: 730px;
		    }
		
		    section {
		      position: relative;
		      float: left;
 		      width: 1380px;
		      min-width: 1380px;
		      height: 100%;
		      margin: 0px auto;
		      text-align: center;
		    }
		    aside {
		      float:left;
		      width:135px;
		      height: 300px;
		    }
		
		    footer {
		      width: 780px;
		      height: 100px;
		      line-height: 100px;
		      margin: 0px auto;
		      text-align: center;
		    }
		</style>
		<script type="text/javascript">
			document.addEventListener("DOMContentLoaded", () => {
				var sections = document.querySelectorAll("section");
				for (var i = 0; i < sections.length; i++) {
					var item = sections.item(i);
					item.style.display = "none";
				}
				document.getElementById("homeSection").style.display = "block";
				
				document.querySelector("#home").addEventListener("click", function(e) {
					for (var i = 0; i < sections.length; i++) {
						var item = sections.item(i);
						item.style.display = "none";
					}
					document.getElementById("homeSection").style.display = "block";
				});
				document.querySelector("#orgData").addEventListener("click", function(e) {
					for (var i = 0; i < sections.length; i++) {
						var item = sections.item(i);
						item.style.display = "none";
					}
					document.getElementById("orgDataSection").style.display = "block";
				});
				
			});
		</script>
	</head>
	<header>
		<title>쓰레드 예제</title>
		<sub-title>쓰레드를 이용한 파일 업로드</sub-title>
	</header>
	<body>
		<nav>
			<ul>
				<li id="home">home</li>
				<li id="orgData">파일 업로드</li>

			</ul>
		</nav>
		<article>
			<section id="homeSection">파일 업로드 간단 예제입니다.</section>
			<section id="orgDataSection">
				<jsp:include page="list.jsp" flush="true"></jsp:include>
			</section>

		</article>
	</body>
	<footer>
		by remingro
	</footer>
</html>