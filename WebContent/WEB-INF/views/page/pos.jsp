<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- menu header -->
<div class="w3-container w3-center w3-margin-left w3-margin-right">
	<h2>POS 담당 현황</h2>	
</div>

<!-- 현황정리  테이블 -->
<form name="form" method="post">
<div class="w3-xlarge w3-padding-24">
	<table style="margin-left: auto; margin-right: auto;">					
		<tr>
			<th class="w3-pale-red" colspan="2">구분</th>
			<th class="w3-pale-red">P O S</th>
			<th class="w3-pale-red">사용장비</th>
			<th class="w3-pale-red">유휴장비</th>
			<th class="w3-pale-red">노후장비</th>
			<th class="w3-pale-red">센터외</th>
			<th class="w3-pale-red">단일화</th>
		</tr>
		<tr>
			<th class="w3-pale-red" rowspan="3">서버</th>
			<td class="w3-pale-red">NT</td>
			<td>${data1}</td>
			<td>${data5}</td>
			<td>${data9}</td>
			<td>${data13}</td>
			<td>${data17}</td>
			<td>${data21}</td>
		</tr>
		<tr>
			<td class="w3-pale-red">UNIX</td>
			<td>${data2}</td>
			<td>${data6}</td>
			<td>${data10}</td>
			<td>${data14}</td>
			<td>${data18}</td>
			<td>${data22}</td>
		</tr>
		<tr>
			<td class="w3-pale-red">LINUX</td>
			<td>${data3}</td>
			<td>${data7}</td>
			<td>${data11}</td>
			<td>${data15}</td>
			<td>${data19}</td>
			<td>${data23}</td>
		</tr>	
		<tr>
			<th class="w3-pale-yellow" colspan="2">소계</th>
			<td class="w3-pale-yellow">${data4}</td>
			<td class="w3-pale-yellow">${data8}</td>
			<td class="w3-pale-yellow">${data12}</td>
			<td class="w3-pale-yellow">${data16}</td>
			<td class="w3-pale-yellow">${data20}</td>
			<td class="w3-pale-yellow">${data24}</td>
		</tr>
		<tr>
			<th class="w3-pale-red" colspan="2">STORAGE</th>
			<td>${data25}</td>
			<td>${data26}</td>
			<td>${data27}</td>
			<td>${data28}</td>
			<td>${data29}</td>
			<td>${data30}</td>
		</tr>
		<tr>
			<th class="w3-pale-yellow" colspan="2">소계</th>
			<td class="w3-pale-yellow">${data25}</td>
			<td class="w3-pale-yellow">${data26}</td>
			<td class="w3-pale-yellow">${data27}</td>
			<td class="w3-pale-yellow">${data28}</td>
			<td class="w3-pale-yellow">${data29}</td>
			<td class="w3-pale-yellow">${data30}</td>
		</tr>
		<tr>
			<th class="w3-pale-red" rowspan="3">네트워크</th>
			<td class="w3-pale-red">라우터</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
		</tr>
		<tr>
			<td class="w3-pale-red">스위치</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
		</tr>
		<tr>
			<td class="w3-pale-red">AP</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
			<td>-</td>
		</tr>	
		<tr>
			<th class="w3-pale-yellow" colspan="2">소계</th>
			<td class="w3-pale-yellow">-</td>
			<td class="w3-pale-yellow">-</td>
			<td class="w3-pale-yellow">-</td>
			<td class="w3-pale-yellow">-</td>
			<td class="w3-pale-yellow">-</td>
			<td class="w3-pale-yellow">-</td>
		</tr>
	</table>
</div>
</form>
