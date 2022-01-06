/**
 * slidShow.js
 */

$(function() {
	// 이동한 이미지의 index 값 지정(현재 위치)
	var movedIndex = 0;
	
	// 슬라이드 패널을 움직이는 함수
	function moveSlid(index){
		movedIndex = index;
		
		// 슬라이드 이동
		var moveLeft = -(index * 1280); // 왼쪽 이동 거리
		$('#slidPanel').animate({'left': moveLeft},'slow');
	}
	
	// [prev] 버튼 클릭시 왼쪽으로 이동
	$('#prevButton').on('click', () => {
		if(movedIndex != 0) 
			movedIndex -= 1;
		
		moveSlid(movedIndex);
	});
	
	// [next] 버튼 클릭시 오른쪽으로 이동
	$('#nextButton').on('click', () => {	
		if(movedIndex != 4) 
			movedIndex += 1;
			
		moveSlid(movedIndex);
	});
	
	// 초기 슬라이더 위치를 랜덤하게 지정
	var randNum = Math.floor(Math.random()*5);
	moveSlid(randNum);
	
	// 컨트롤 버튼
	$('.controlButton').each(function(index) {
		// hover시 이미지 변경
		$(this).hover(
			function() {
				$(this).attr('src','image/controlButton2.png');
			},
			function() {
				$(this).attr('src','image/controlButton1.png');
			}	
		);
		
		// 클릭시 각 인덱스로 이동
		$(this).on('click', () => {
			moveSlid(index);
		})
	});
});