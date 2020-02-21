<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<title>롯데백화점 IT 자산 대장</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script
  src="https://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous"></script>

<!--  font and table -->
<style>
.w3-myfont{font-family:"Oswald", cursive, sans-serif;}
.table-wrap{
	margin-left: 3%;
	margin-right: 3%;
	margin-bottom: 2%;
	height: 400px;
	overflow: auto;
}
table{		
	border-collapse: collapse;
	border-spacing: 0;
	border: 1px solid #ccc;
}
table.txc-table{ 
	width: 100%;
	table-layout: fixed;
}
tr, th, td{
	text-align: center;
	height: 50px;
	padding: 10px;
	border: 1px solid #ccc;
}

.w3-display-container{
	margin-left: 3%;
	margin-right: 3%;
	margin-bottom: 2%;
	border: 1px solid #ddd;	
}
input{
	margin-bottom: 3%;
}
</style>
 <style>
@font-face {
  font-family: 'Do Hyeon';
  font-style: normal;
  font-weight: 400;
  src: url('${ pageContext.servletContext.contextPath }/api/fonts/do-hyeon-v11-latin_korean-regular.eot'); /* IE9 Compat Modes */
  src: local('Do Hyeon Regular'), local('DoHyeon-Regular'),
       url('${ pageContext.servletContext.contextPath }/api/fonts/do-hyeon-v11-latin_korean-regular.eot?#iefix') format('embedded-opentype'), /* IE6-IE8 */
       url('${ pageContext.servletContext.contextPath }/api/fonts/do-hyeon-v11-latin_korean-regular.woff2') format('woff2'), /* Super Modern Browsers */
       url('${ pageContext.servletContext.contextPath }/api/fonts/do-hyeon-v11-latin_korean-regular.woff') format('woff'), /* Modern Browsers */
       url('${ pageContext.servletContext.contextPath }/api/fonts/do-hyeon-v11-latin_korean-regular.ttf') format('truetype'), /* Safari, Android, iOS */
       url('${ pageContext.servletContext.contextPath }/api/fonts/do-hyeon-v11-latin_korean-regular.svg#DoHyeon') format('svg'); /* Legacy iOS */
}
body,h1,h2,h3,h4,h5,h6 {font-family: "Do Hyeon"}
</style>



<body>
	<!-- header -->
	<header class="w3-container w3-center w3-margin-bottom w3-padding-20 w3-white">
    	<h1 class="w3-xxxlarge"><b>롯데백화점 IT 자산 대장</b></h1>
    	<h6><span class="w3-tag w3-black">자산현황_IT운영팀</span> 환영합니다 </h6>
  	</header>
