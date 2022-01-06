/**
 * checkForm.js  : 폼 유효성 확인
 */

 $(document).ready(function() {
	// id 포커스
	$('#id').focus();
	
	// input 텍스트 입력란과 비밀번호 입력란
	//포커스 - 색상변경
	$(':text, :password').on('focus', function() {
		$(this).css('background-color', 'yellow');
	});
	// 포커스 없을 때 - 다시 원래대로
	$(':text, :password').on('blur', function() {
		$(this).css('background-color', '');
	});
	
	/* 키보드 이벤트 처리 */
	// 첫번째 전화번호에 값 3개가 들어가면 다음 칸으로 이동
	$('#hp1').on('keyup', function(){
		if($('#hp1').val().length == 3) {
			$('#hp2').focus();
		}
	});
	// 두번빼 전화번호에 값 4개 들어가면 다음 칸으로 이동
	$('#hp2').on('keyup', function(){
		if($('#hp2').val().length == 4) {
			$('#hp3').focus();
		}
	});
	
	// 엔터키 눌렀을 때 무조건 submit 안 되도록
	// 엔터 키코드 = 13
	$(document).on('keydown', function(e){
		if(e.keycode == 13) return false;
	})
	
	// id 입력 후 엔터키 눌렀을 때 비밀번호로 포커스
	$('#id').on('keydown', function(e){
		if($('#id').val() != null && e.keycode == 13){
			e.preventDefault();
			$('#pwd').focus();
			
		}
	})
	
	/* ------------------------ */

	// 완료 버튼 클릭시 유효성 검사
	$('#newMemberForm').submit(function() {
		// id 미 입력시 
		if($('#id').val() == "") {
			alert('아이디를 입력하세요.');
			$('#id').focus(); 	// $(this)도 가능
			return false;
		}
		
		// 비밀번호 미 입력시
		if($('#pwd').val() == ""){
			alert('비밀번호를 입력하세요.');
			$('#pwd').focus();
			return false;
		}
		
		// 라디오 버튼 미 선택시
		// if(!$('input[type="radio"]:checked')){
		// if(!$(':radio').is(':checked')){
		if(!$(':radio[name="year"]').is(':checked')){
			alert('학년을 선택하세요.');
			return false;
		}
		
		// 학과 미 선택시
		if($('#department').val() == "") {
			alert('학과를 선택하세요.');
			return false;
		}
	})
});