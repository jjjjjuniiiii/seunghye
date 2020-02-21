<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

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
<title>롯데 IT 자산대장 Login</title>
</head>



<body>	
	
	<div class="w3-display-container"> 
		<img src="${ pageContext.servletContext.contextPath }/image/lotte.jpg" style="width:100%; height:100%">
		<p></p>									
	
		<div class="w3-display-middle">
		<h1 class="w3-xxlarge w3-center"><b>롯데백화점 IT 자산 대장</b></h1><br>		
			<div class="w3-container w3-red w3-round w3-padding-16">
				<form action="${ pageContext.servletContext.contextPath }/page/user/login" method="post">
					<label><b>ID</b></label>
					<input class="w3-input w3-border w3-round" type="text" name="id"><br>
					<label><b>PASSWORD</b></label>
					<input class="w3-input w3-border w3-round" type="password" name="pw"><br>		
					<button class="w3-button w3-block w3-black">LOGIN</button>			
				</form>
			</div>
		</div>		
	</div>

</body>
</html>