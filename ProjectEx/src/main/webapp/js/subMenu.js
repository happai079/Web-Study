/**
 * subMenu.js
 */

$(function() {
	// [전체보기 ▼]메뉴 클릭시 모든 서브 메뉴 보이게
	$('#showAllMenu').on('click', function(){
		if($(this).text() == '전체보기 ▼') {
			$('#subMenuBox').css('visibility', 'visible');
			$(this).text('메뉴 닫기 ▲').css('color', 'blue');
		}else{
			$('#subMenuBox').css('visibility', 'hidden');
			$(this).text('전체보기 ▼').css('color', 'black');
		}
	});	
});