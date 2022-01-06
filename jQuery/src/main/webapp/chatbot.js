/**
 * chatbot.js
 */

$(function(){
	// 챗봇에게 질문하고 응답받기
	$('#chatForm').on('submit', () => {
		event.preventDefault();
		
		// message 입력하고 전송 버튼 눌렀을 때
		if($('#message').val() != ""){
			$('#chatBox').append('<div class="msgBox send"><span>'
								  + $('#message').val() + '</sapn></div><br>');
		
			$('#message').val('');
			
			getResponse();
		}
	});
	
	function getResponse() {
		var result = '저는 챗봇입니다. 길게 응답왔을 때는 어떻게 되는지 한 번 보죠.';
		 
		$('#chatBox').append('<div class="msgBox receive"><br>챗봇<br><span>'
								  + result + '</sapn></div><br><br>');
						
		// 스크롤해서 올리기
		$('#chatBox').scrollTop($('#chatBox').prop('scrollHeight'));
	}
});