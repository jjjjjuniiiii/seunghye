<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- menu header -->
<div class="w3-container w3-center w3-margin-left w3-margin-right w3-margin-bottom">
	<h2>재무 폐기 현황</h2>
</div>

<!-- table -->
<div class="table-wrap">
	<table id="table">			
		<thead>
			<tr class="w3-pale-red">
				<th style="display: none">시퀀스</th>
				<th nowrap>대분류</th>
				<th nowrap>소분류</th>
				<th nowrap>시스템</th>
				<th nowrap>용도</th>
				<th nowrap>자산명(호스트명 기준)</th>
				<th nowrap>제조사</th>
				<th nowrap>모델명</th>
				<th nowrap>세부사양/제품명(구입버전)</th>
				<th nowrap>구매수량</th>
				<th nowrap>제품명(설치버전)</th>
				<th nowrap>설치수량</th>
				<th nowrap>도입년월(설치년월)</th>
				<th nowrap>노후화대상</th>
				<th nowrap>도입금액(천원)</th>
				<th nowrap>설치장소</th>
				<th nowrap>상면위치</th>
				<th nowrap>진행여부</th>
				<th nowrap>계약기간</th>
				<th nowrap>금액</th>
				<th nowrap>사용여부</th>
				<th nowrap>폐기/재활용</th>
				<th nowrap>폐기사유</th>
				<th nowrap>비고</th>
				<th nowrap>단일화여부</th>
				<th nowrap>EOS종료시점</th>
			</tr>
		</thead>
		<tbody id="addCell">			
			<c:forEach var="finance" items="${financeList2}">
				<tr>		
					<td style="display: none">${finance.sequence}</td>
					<td nowrap>${finance.large_category}</td>
					<td nowrap>${finance.small_category}</td>
					<td nowrap>${finance.system}</td>
					<td nowrap>${finance.using}</td>
					<td nowrap>${finance.host_name}</td>
					<td nowrap>${finance.manufacturer}</td>
					<td nowrap>${finance.model_name}</td>
					<td nowrap>${finance.specification}</td>
					<td nowrap>${finance.purchase_num}</td>
					<td nowrap>${finance.install_name}</td>
					<td nowrap>${finance.install_num}</td>
					<td nowrap>${finance.start_date}</td>
					<td nowrap>${finance.deterioration}</td>
					<td nowrap>${finance.start_money}</td>
					<td nowrap>${finance.place}</td>
					<td nowrap>${finance.location}</td>
					<td nowrap>${finance.status_progress}</td>
					<td nowrap>${finance.contract_term}</td>
					<td nowrap>${finance.month_money}</td>
					<td nowrap>${finance.status_use}</td>
					<td nowrap>${finance.disuse_or_recycling}</td>
					<td nowrap>${finance.reason_disuse}</td>
					<td nowrap>${finance.note}</td>
					<td nowrap>${finance.unification}</td>
					<td nowrap>${finance.EOS_end_date}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


<!-- Fixed Form -->
<form name="form" method="post">
<div class="w3-display-container w3-pale-red w3-padding-16">
	<div class="w3-container w3-right">
		<button type="button" onclick="cancle_disuse();" class="w3-button w3-black w3-margin-right w3-margin-bottom" >폐기취소</button>
		<button type="button" onclick="update();" class="w3-button w3-black w3-margin-right w3-margin-bottom">수정</button>
		<button type="button" onclick="deleteData();" class="w3-button w3-black w3-margin-right w3-margin-bottom" >삭제</button>		
		<button id="resetButton" type="button" class="w3-button w3-black w3-margin-right w3-margin-bottom">폼리셋</button>		
		<button id="insertButton" type="button" onclick="insert();" class="w3-button w3-green w3-margin-right w3-margin-bottom">추가</button>		
	</div>	
	<div class="w3-row-padding">
		<div class="w3-quarter w3-container">
			<div class="w3-container w3-red w3-center w3-margin-bottom w3-padding-16">    			
    				<h5>IT 자산대장  데이터 정보</h5>    			
  			</div>
			<select name="box1" id="box1" class="w3-select w3-margin-right w3-margin-bottom w3-pale-yellow">
				<option value="" disabled selected>대분류</option>
				<option value="01">H/W</option>
				<option value="02">S/W</option>
				<option value="03">보안장비</option>
		  	 	<option value="04">부대설비</option>
		  	 	<option value="05">중앙관제</option>
			</select><br>			
			<select name="box2" id="box2" class="w3-select w3-margin-right w3-margin-bottom w3-pale-yellow">
				<option value="" disabled selected>소분류</option>
				<option value="01">APPLICATION</option>
				<option value="02">DBMS</option>
				<option value="03">FIREWALL</option>
		  	 	<option value="04">GRID</option>  	 	
		  	 	<option value="05">IPS</option>
		  	 	<option value="06">LINUX</option>
		  	 	<option value="07">MIDDLEWARE</option>
		  	 	<option value="08">NT</option>  	 	
		  	 	<option value="09">NW</option>
		  	 	<option value="10">OS</option>
		  	 	<option value="11">TOOL</option>
		  	 	<option value="12">UNIX</option>  	 	
		  	 	<option value="13">VTL</option>
		  	 	<option value="14">WAF</option>
		  	 	<option value="15">WEB</option>
		  	 	<option value="16">기타장비</option>  	 	
		  	 	<option value="17">라이선스</option>
		  	 	<option value="18">백업</option>
		  	 	<option value="19">보안장비</option>
		  	 	<option value="20">부대시설</option>  	 	
		  	 	<option value="21">솔루션</option>
		  	 	<option value="22">스토리지</option>
		  	 	<option value="23">시스템센터</option>
		  	 	<option value="24">중앙관제</option>
			</select><br>
			<select name="box3" id="box3" class="w3-select w3-margin-right w3-margin-bottom w3-pale-yellow">
				<option value="" disabled selected>시스템</option>
				<option value="001">ACS</option>
				<option value="002">AP</option>
				<option value="003">AP MANAGEMENT</option>
		  	 	<option value="004">BRIDGE</option>  	 	
		  	 	<option value="005">BSC 시스템</option>
		  	 	<option value="006">CTL_DB</option>
		  	 	<option value="007">CTL_FMS</option>
		  	 	<option value="008">CTL_POWER</option>  	 	
		  	 	<option value="009">CTL_REMOTE</option>
		  	 	<option value="010">CTL_STORAGE</option>
		  	 	<option value="011">CTL_WEB</option>
		  	 	<option value="012">DBA 메타관리</option>  	 	
		  	 	<option value="013">DBA 모니터링</option>
		  	 	<option value="145">DBA 테스트기</option>
		  	 	<option value="014">DB 보안 모니터링</option>
		  	 	<option value="015">DB 암호화</option>
		  	 	<option value="016">DB 암호화 서버</option>  	 	
		  	 	<option value="017">DDOS 관리서버</option>
		  	 	<option value="018">DHCP</option>
		  	 	<option value="019">DM 보안</option>
		  	 	<option value="020">DRM(문서보안시스템)</option>  	 	
		  	 	<option value="021">DRM_STORAGE</option>
		  	 	<option value="022">EAI</option>
		  	 	<option value="023">EMS</option>
		  	 	<option value="024">ESL 전자가격표시기</option>
		  	 	<option value="025">F/W 관리서버</option>
				<option value="026">FASOO DRM SSL 인증서</option>
				<option value="027">FIREWALL</option>
		  	 	<option value="028">HB T1000</option>  	 	
		  	 	<option value="029">HELPDESK-CTI</option>
		  	 	<option value="030">HIVE MANAGER SERVER</option>
		  	 	<option value="031">HUB</option>
		  	 	<option value="032">HYPER-V</option>  	 	
		  	 	<option value="033">IDEA 시스템</option>
		  	 	<option value="034">IP 통합관리</option>
		  	 	<option value="146">IP 통합관리 장비</option>
		  	 	<option value="035">IPS</option>
		  	 	<option value="036">IPS 관리서버</option>  	 	
		  	 	<option value="037">L4 SWITCH</option>
		  	 	<option value="038">LINUX-네트워크접근제어</option>
				<option value="039">MAIL_I</option>
				<option value="040">MMSW</option>
				<option value="041">P2V</option>  
		  	 	<option value="042">PC A/S</option>  	 	
		  	 	<option value="043">PMS 서버</option>
		  	 	<option value="044">POS 시스템</option>
		  	 	<option value="045">QOS</option>
		  	 	<option value="046">RIS.EDI 시스템</option>  	 	
		  	 	<option value="047">RIS/상품권/경영지원 시스템</option>
		  	 	<option value="048">RIS 시스템</option>
		  	 	<option value="049">ROUTER</option>
		  	 	<option value="050">SECONDARY DNS</option>  	 	
		  	 	<option value="051">SWITCH</option>
		  	 	<option value="052">SWITCH(L4)</option>
				<option value="053">SWITCH(SAN)</option>
				<option value="054">TACACS+</option>
		  	 	<option value="055">TCO!STREAM</option>  	 	
		  	 	<option value="056">TCO!STREAM WEB서버</option>
		  	 	<option value="057">TCO!STREAM-PMS</option>
		  	 	<option value="058">TCOSECUIP</option>
		  	 	<option value="147">TGATENAC SSL 인증서</option>
		  	 	<option value="059">UPS</option>  	 	
		  	 	<option value="060">VPN</option>
		  	 	<option value="061">VNP ACS</option>
		  	 	<option value="062">WAF</option>
		  	 	<option value="063">WAF LOG</option>  	 	
		  	 	<option value="064">WAN 가속기</option>
		  	 	<option value="065">WATERMARK</option>
		  	 	<option value="066">WEBEDI</option>  	 	
		  	 	<option value="067">WEBKEEPER</option>
		  	 	<option value="068">WIN 인증서버</option>
				<option value="069">WLC</option>
				<option value="070">WLSE</option>
		  	 	<option value="071">WSUS 서버</option>  	
		  	 	<option value="072">XKEEPER DB서버</option>
		  	 	<option value="073">XKEEPER WEB</option>
		  	 	<option value="074">개인정보 이상징후 탐지 시스템</option>
		  	 	<option value="075">객수정보 시스템</option>
				<option value="076">계정관리</option>
				<option value="077">매체제어(구)</option>
		  	 	<option value="078">구매 시스템</option>  	
		  	 	<option value="079">그룹웨어</option>
		  	 	<option value="080">기타장비</option>  	 	
		  	 	<option value="081">내부통제 시스템</option>
		  	 	<option value="082">내부회계 시스템</option>
				<option value="083">네트워크 접근제어</option>
				<option value="084">노원점 시스템</option>
		  	 	<option value="085">단품관리 시스템</option>  	
		  	 	<option value="086">단품관리 시스템(DR)</option>
		  	 	<option value="087">디자인 공유</option>  	 	
		  	 	<option value="088">라인카드</option>
		  	 	<option value="089">리스 시스템</option>
				<option value="090">마케팅 SVN</option>
				<option value="091">매체제어</option>
				<option value="092">메신저</option>
				<option value="093">멤버스</option>
				<option value="094">멤버스 시스템</option>
				<option value="095">문서중앙화</option>
				<option value="096">문화센터시스템</option>
				<option value="097">방화벽 관리 서버</option>
				<option value="098">배송 시스템</option>
				<option value="099">백본 SWITCH</option>
				<option value="100">백업</option>
				<option value="101">법인영업 시스템</option>
				<option value="102">법인영업 시스템(구)</option>
				<option value="103">법인카드 시스템</option>
				<option value="104">보안복합관리서버</option>
				<option value="105">사규</option>
				<option value="106">사은 시스템</option>
				<option value="107">상품권 시스템</option>
				<option value="108">스넥 시스템</option>
				<option value="109">시스템 접근제어</option>
				<option value="110">식수</option>
				<option value="111">신 CRM</option>
				<option value="12">신동료사원</option>
				<option value="113">신인사</option>
				<option value="114">압축장비</option>
				<option value="115">약속관리</option>
				<option value="116">엘롯데</option>
				<option value="117">영업통합</option>
				<option value="118">영업통합 DR</option>
				<option value="119">외국인 판촉</option>
				<option value="120">웹 방화벽 SSL 인증서</option>
				<option value="0121">이상징후탐지 시스템</option>
				<option value="122">인사</option>
				<option value="123">인사(DR)</option>
				<option value="124">인사식수</option>
				<option value="125">임원정보</option>
				<option value="126">재무/구매/EAI</option>
				<option value="127">재무 시스템</option>
				<option value="128">전자결재</option>
				<option value="129">전자에누리</option>
				<option value="130">전자증빙 시스템</option>
				<option value="131">중계서버관리 서버</option>
				<option value="132">중앙관제</option>
				<option value="133">증적관리솔루션</option>
				<option value="134">직매입단품(DR)</option>
				<option value="135">통신구간 암호화 SSL 인증서</option>
				<option value="136">통합 DB</option>
				<option value="137">통합 로그인</option>
				<option value="138">통합 스토리지</option>
				<option value="139">통합 스토리지(DR)</option>
				<option value="140">통합 스토리지(DR)(영업/RIS/상품권)</option>
				<option value="141">통합 스토리지용(영업/RIS/상품권)</option>
				<option value="142">통합 스토리지용(DR)(영업/RIS/상품권)</option>
				<option value="143">항온항습기</option>
				<option value="144">형상관리</option>
			</select><br>			
  			<input class="w3-input w3-border" name="input0" id="input0" type="hidden">
			<input class="w3-input w3-border" name="input1" id="input1" type="text" placeholder="용도">						
		</div>
		<div class="w3-quarter w3-container">
			<input class="w3-input w3-border" name="input2" id="input2" type="text" placeholder="자산명(호스트명 기준)">
			<input class="w3-input w3-border" name="input3" id="input3" type="text" placeholder="제조사">	
			<input class="w3-input w3-border" name="input4" id="input4" type="text" placeholder="모델명">
			<input class="w3-input w3-border" name="input5" id="input5" type="text" placeholder="세부사양/제품명(구입버전)">
			<input class="w3-input w3-border" name="input6" id="input6" type="number" placeholder="구매수량">
  			<input class="w3-input w3-border" name="input7" id="input7" type="text" placeholder="제품명(설치버전)">
			<input class="w3-input w3-border" name="input8" id="input8" type="number" placeholder="설치수량">	
		</div>
		<div class="w3-quarter w3-container">
			<input class="w3-input w3-border" name="input9" id="input9" type="date" placeholder="도입년월(설치년월)">
			<input class="w3-input w3-border" name="input10" id="input10" type="text" placeholder="노후화대상">		
			<input class="w3-input w3-border" name="input11" id="input11" type="number" placeholder="도입금액(천원)">
			<input class="w3-input w3-border" name="input12" id="input12" type="text" placeholder="설치장소">
			<input class="w3-input w3-border" name="input13" id="input13" type="text" placeholder="상면위치">
			<input class="w3-input w3-border" name="input14" id="input14" type="text" placeholder="진행여부">
  			<input class="w3-input w3-border" name="input15" id="input15" type="text" placeholder="계약기간">
		</div>
		<div class="w3-quarter w3-container">
			<input class="w3-input w3-border" name="input16" id="input16" type="number" placeholder="금액">
			<select name="input17" id="input17" class="w3-select w3-margin-right w3-margin-bottom w3-pale-yellow">
				<option value="" disabled selected>사용여부</option>
				<option value="사용">사용</option>
				<option value="미사용">미사용</option>
			</select><br>
			<input class="w3-input w3-border" name="input18" id="input18" type="text" placeholder="폐기/재활용">
			<input class="w3-input w3-border" name="input19" id="input19" type="text" placeholder="폐기사유">
			<input class="w3-input w3-border" name="input20" id="input20" type="text" placeholder="비고">
			<select name="input21" id="input21" class="w3-select w3-margin-right w3-margin-bottom w3-pale-yellow">
				<option value="" disabled selected>단일화여부</option>
				<option value="O">O</option>
				<option value="X">X</option>
			</select><br>
			<input class="w3-input w3-border" name="input22" id="input22" type="text" placeholder="EOS종료시점">
		</div>
	</div>
</div>
</form>

<script>
//테이블의 Row 클릭시 값 가져오기
$("#table tr").click(function(){ 		
	// 현재 클릭된 Row(<tr>)
	var tr = $(this);
	var td = tr.children();
	
	//td.eq(index)를 통해 값을 가져올 수도 있다.	
	var sequence = td.eq(0).text();
	var large_category = td.eq(1).text();
	var small_category = td.eq(2).text();
	var system = td.eq(3).text();
	var using = td.eq(4).text();
	var host_name = td.eq(5).text();
	var manufacturer = td.eq(6).text();
	var model_name = td.eq(7).text();
	var specification = td.eq(8).text();
	var purchase_num = td.eq(9).text();
	var install_name = td.eq(10).text();
	var install_num = td.eq(11).text();
	var start_date = td.eq(12).text();
	var deterioration = td.eq(13).text();
	var start_money = td.eq(14).text();
	var place = td.eq(15).text();
	var location = td.eq(16).text();
	var status_progress = td.eq(17).text();
	var contract_term = td.eq(18).text();
	var month_money = td.eq(19).text();
	var status_use = td.eq(20).text();
	var disuse_or_recycling = td.eq(21).text();
	var reason_disuse = td.eq(22).text();
	var note = td.eq(23).text();
	var unification = td.eq(24).text();
	var EOS_end_date = td.eq(25).text();
	
	$("#input0").val(sequence);
	$("#box1 option").filter(function() {return this.text==large_category;}).prop("selected", "selected");		
	$("#box2 option").filter(function() {return this.text==small_category;}).prop("selected", "selected");
	$("#box3 option").filter(function() {return this.text==system;}).prop("selected", "selected");
	$("#input1").val(using);
	$("#input2").val(host_name);
	$("#input3").val(manufacturer);
	$("#input4").val(model_name);
	$("#input5").val(specification);
	$("#input6").val(purchase_num);
	$("#input7").val(install_name);
	$("#input8").val(install_num);
	$("#input9").val(start_date);
	$("#input10").val(deterioration);
	$("#input11").val(start_money);
	$("#input12").val(place);
	$("#input13").val(location);
	$("#input14").val(status_progress);
	$("#input15").val(contract_term);
	$("#input16").val(month_money);
	$("#input17 option").filter(function() {return this.text==status_use;}).prop("selected", "selected");
	$("#input18").val(disuse_or_recycling);
	$("#input19").val(reason_disuse);
	$("#input20").val(note);
	$("#input21 option").filter(function() {return this.text==unification;}).prop("selected", "selected");
	$("#input22").val(EOS_end_date);	
});
//폐기취소 버튼 클릭시 폐기취소처리
function cancle_disuse(){
	if(confirm("폐기 취소 하시겠습니까?")==true){
		var f = document.form;
		f.action = "${ pageContext.servletContext.contextPath }/page/user/financeDisuse2";
		f.submit();
	}
	else{
		return false;
	}
}
//수정 버튼 클릭시 Update
function update(){
	if(confirm("수정 하시겠습니까?")==true){
		var f = document.form;
		f.action = "${ pageContext.servletContext.contextPath }/page/user/financeUpdate2";
		f.submit();
	}
	else{
		return false;
	}
}

//삭제 버튼 클릭시 삭제처리
function deleteData(){
	if(confirm("삭제 하시겠습니까?")==true){
		var f = document.form;
		f.action = "${ pageContext.servletContext.contextPath }/page/user/financeDelete2";
		f.submit();
	}
	else{
		return false;
	}
}
//폼리셋 버튼(추가를 위한 폼 리셋)
$('#resetButton').click(function(){
	//$('#addCell').prepend("<<tr><td><input class='w3-check' type='checkbox' checked></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>")
	$("#box1 option:eq(0)").prop("selected", true);
	$("#box2 option:eq(0)").prop("selected", true);
	$("#box3 option:eq(0)").prop("selected", true);
	
	$("#input1").val("");
	$("#input2").val("");
	$("#input3").val("");
	$("#input4").val("");
	$("#input5").val("");
	$("#input6").val("");
	$("#input7").val("");
	$("#input8").val("");
	$("#input9").val("");
	$("#input10").val("");
	$("#input11").val("");
	$("#input12").val("");
	$("#input13").val("");
	$("#input14").val("");
	$("#input15").val("");
	$("#input16").val("");
	$("#input17").val("");
	$("#input18").val("");
	$("#input19").val("");
	$("#input20").val("");
	$("#input21").val("");
	$("#input22").val("");
	$("#input23").val("");
	$("#input24").val("");
});

//추가버튼 클릭시 Insert
function insert(){
	var f = document.form;	
	if(f.box1.value=="" || f.box2.value=="" || f.box3.value=="" || f.input17.value=="" || f.input21.value==""){
		alert("필수 입력 값을 모두 입력하지 않았습니다. \n필수 입력 값 : 대분류, 소분류, 시스템, 사용여부, 단일화여부");	
		return false;
	}
	else{
		if(confirm("추가 하시겠습니까?")==true){
			f.action = "${ pageContext.servletContext.contextPath }/page/user/financeInsert2";
			f.submit();
		}
		else{
			return false;
		}	
	}
}
</script>


