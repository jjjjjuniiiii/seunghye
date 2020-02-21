<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 
	<!-- menu bar -->
	<div class="w3-bar w3-red w3-card w3-large w3-margin-bottom">
	   <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right"><i class="fa fa-bars"></i></a>
	   <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
	   <a href="${ pageContext.servletContext.contextPath }/page/main" class="w3-bar-item w3-button w3-padding-large">HOME</a>
	   <a href="${ pageContext.servletContext.contextPath }/page/user/login" class="w3-bar-item w3-button w3-padding-large">LOGOUT</a>
	   	   
	   <div class="w3-dropdown-hover w3-hide-small">
	     <button class="w3-padding-large w3-button w3-red"> 경영지원 <i class="fa fa-caret-down"></i></button>     
	     <div class="w3-dropdown-content w3-bar-block w3-card-4">
	       <a href="${ pageContext.servletContext.contextPath }/page/user/support1" class="w3-bar-item w3-button">경영지원</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/support" class="w3-bar-item w3-button">경영지원 담당현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/support2" class="w3-bar-item w3-button">경영지원 폐기현황</a>
	     </div>
	   </div>
	   
	   <div class="w3-dropdown-hover w3-hide-small">
	     <button class="w3-padding-large w3-button w3-red">재무<i class="fa fa-caret-down"></i></button>     
	     <div class="w3-dropdown-content w3-bar-block w3-card-4">
	       <a href="${ pageContext.servletContext.contextPath }/page/user/finance1" class="w3-bar-item w3-button">재무</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/finance" class="w3-bar-item w3-button">재무 담당현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/finance2" class="w3-bar-item w3-button">재무 폐기현황</a>
	     </div>
	   </div>
	   
	    <div class="w3-dropdown-hover w3-hide-small">
	     <button class="w3-padding-large w3-button w3-red"> MD <i class="fa fa-caret-down"></i></button>     
	     <div class="w3-dropdown-content w3-bar-block w3-card-4">
	       <a href="${ pageContext.servletContext.contextPath }/page/user/md1" class="w3-bar-item w3-button">MD</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/md" class="w3-bar-item w3-button">MD 담당현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/md2" class="w3-bar-item w3-button">MD 폐기현황</a>
	     </div>
	   </div>
	   
	   <div class="w3-dropdown-hover w3-hide-small">
	     <button class="w3-padding-large w3-button w3-red"> 마케팅 <i class="fa fa-caret-down"></i></button>     
	     <div class="w3-dropdown-content w3-bar-block w3-card-4">
	       <a href="${ pageContext.servletContext.contextPath }/page/user/marketing1" class="w3-bar-item w3-button">마케팅</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/marketing" class="w3-bar-item w3-button">마케팅 담당현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/marketing2" class="w3-bar-item w3-button">마케팅 폐기현황</a>
	     </div>
	   </div>
	   
	   <div class="w3-dropdown-hover w3-hide-small">
	     <button class="w3-padding-large w3-button w3-red"> 상품권 <i class="fa fa-caret-down"></i></button>     
	     <div class="w3-dropdown-content w3-bar-block w3-card-4">
	       <a href="${ pageContext.servletContext.contextPath }/page/user/giftcard1" class="w3-bar-item w3-button">상품권</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/giftcard" class="w3-bar-item w3-button">상품권 담당현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/giftcard2" class="w3-bar-item w3-button">상품권 폐기현황</a>
	     </div>
	   </div>	
	   

	   <div class="w3-dropdown-hover w3-hide-small">
	     <button class="w3-padding-large w3-button w3-red"> POS <i class="fa fa-caret-down"></i></button>     
	     <div class="w3-dropdown-content w3-bar-block w3-card-4">
	       <a href="${ pageContext.servletContext.contextPath }/page/user/pos1" class="w3-bar-item w3-button">POS</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/pos" class="w3-bar-item w3-button">POS 담당현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/pos2" class="w3-bar-item w3-button">POS 폐기현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/pos3" class="w3-bar-item w3-button">POS&PDA(구)</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/pos4" class="w3-bar-item w3-button">POS&PDA(신)</a>
	     </div>
	   </div>
	   

	   
	    <div class="w3-dropdown-hover w3-hide-small">
	     <button class="w3-padding-large w3-button w3-red"> 인프라 <i class="fa fa-caret-down"></i></button>     
	     <div class="w3-dropdown-content w3-bar-block w3-card-4">
	       <a href="${ pageContext.servletContext.contextPath }/page/user/infra1" class="w3-bar-item w3-button">인프라 NW</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/infra" class="w3-bar-item w3-button">인프라 담당현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/infra2" class="w3-bar-item w3-button">인프라 폐기현황</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/infra3" class="w3-bar-item w3-button">인프라 서버(신)</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/infra4" class="w3-bar-item w3-button">인프라 어플라이언스</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/infra5" class="w3-bar-item w3-button">인프라 스토리지 & 백업</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/infra6" class="w3-bar-item w3-button">중앙관제</a>
	       <a href="${ pageContext.servletContext.contextPath }/page/user/infra7" class="w3-bar-item w3-button">부대설비</a>
	     </div>
	   </div>
	   	   
	   <a href="#band" class="w3-bar-item w3-button w3-padding-large w3-hide-small">현황정리(1)</a>
	   <a href="#band" class="w3-bar-item w3-button w3-padding-large w3-hide-small">현황정리(2)</a>
	</div>