/**
 * checkForm.js  : 폼 유효성 확인
 */

window.onload = function() {
	// id가 joinForm인 폼의  submit 버튼이 눌러졌을 때 수행되는 이벤트 처리
	document.getElementById('joinForm').onsubmit = function() {
		
		// 성명을 입력하지 않은 경우 경고창 출력
		// id로 찾아와서 
		var name = document.getElementById('name');
		
		// 값이 비었는지 확인하고, 비었으면 경고창 출력, 입력란에 포커스 주고, 서버로 전송되지 않게 함(다음 페이지로 이동 못하게)
		if(name.value == ""){
			alert("성명을 입력하세요.");
			name.focus();
			return false; // 서버로 전송되지 않게 함(다음 페이지로 이동 못하게)
		}
		
		// 아이디를 입력하지 않은 경우 
		// "아이디를 입력하세요" 출력, 아이디 입력란에 포커스
		var id = document.getElementById('id');
		
		if(id.value == "") {
			alert("아이디를 입력하세요.");
			id.focus();
			return false;	
		}

		
		// 아이디를 6~10자가 안되게 입력하였을 경우
		// "아이디는 6~10자로 입력하세요" 경고창 출력
		// 아이디 입력란에 입력한 내용 삭제하고
		// 아이디 입력란에 포커스
		if(id.value.length < 6 || id.value.length > 10){
			alert('아이디는 6~10자로 입력하세요');
			id.value = "";
			id.focus();
			return false;
		}
		
		// 비밀번호와 비밀번호 확인 일치하지 않는 경우
		// 비밀번호 확인이 일치하지 않습니다. 경고창 출력
		// 비밀번호 확인 입력한 값 지우고, 포커스
		var pw = document.getElementById('password');
		var pwCheck = document.getElementById('passwordCheck');
		
		if(pw.value != pwCheck.value){
			alert('비밀번호 확인이 일치하지 않습니다.');
			pwCheck.value = '';
			pwCheck.focus();
			return false;
		}
			
		// 직업을 선택하지 않은 경우 -- 첫번째 option
		// 직업을 선택하세요 경고창 출력
		// selectedIndex 속성 사용
		var job = document.getElementById('job');
		
		if(job.selectedIndex  == 0) {
			alert('직업을 선택하세요.');
			return false;
		}
		
		// 이메일 수신여부 버튼 선택하지 않은 경우
		// 체크 여부를 저장할 변수
		var check = false;
		for(var i=0; i<joinForm.emailRcv.length; i++){
			if(joinForm.emailRcv[i].checked == true)
				check = true;
		}
		
		if(!check) {
			alert('이메일 수신 여부를 선택하세요.');
			return false;
		}
		
		// 동의 체크박스를 하나도 선택하지 않은 경우
		var agreement1 = document.getElementById('agreement1');
		var agreement2 = document.getElementById('agreement1');
		
		if(agreement1.checked == false && agreement2.checked == false) {
			alert('동의에 체크해주세요.');
			return false;
		}
	};	 // onsubmit 끝
};  // window.onload 끝














