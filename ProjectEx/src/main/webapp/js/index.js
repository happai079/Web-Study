/**
 * index.js
 */

$(function(){
	// 스크롤되는 윈도우의 top이 #headerBox보다 크면 메뉴 고정
	$(window).on('scroll', function() {
		if($(document).scrollTop() >= $('#headerBox').height()){
			$('#mainMenuBox').addClass('mainMenuFixed mainMenuShadow');
		}else {
			$('#mainMenuBox').removeClass('mainMenuFixed mainMenuShadow');
		}
	});
	
	// moveToTop 이미지 클릭시 top으로 이동
	$('#moveToTop').on('click', function() {
		$('html, body').animate({scrollTop: 0}, 500);
	});
});