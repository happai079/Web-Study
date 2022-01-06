/**
 * 
 */

$(document).ready(function() {
	const record = document.getElementById('record');
	const stop = document.getElementById('stop');
	const soundClips = document.getElementById('sound-clips');
	
	if(navigator.mediaDevices) {
		var constraints = {
			audio: true
		}
		
		let chunks = []; 	// 녹음 데이터 저장할 변수
		
		navigator.mediaDevices.getUserMedia(constraints)
		.then(stream => {
			const mediaRecorder = new MediaRecorder(stream);
			
			// 녹음 버튼 클릭시
			record.onclick = () => {
				mediaRecorder.start();	// 녹음 시작
				record.style.background = 'red';
				record.style.color = 'black';
			}
			
			// 정지 버튼 클릭시
			stop.onclick = () => {
				mediaRecorder.stop()	// 녹음 정지
				record.style.background = "";
				record.style.color = "";
			}
			
			mediaRecorder.onstop = e => {
				// 1. 오디오 태그 담을 컨테이너 객체 생성
				const clipContainer = document.createElement('article');
	
				// 2. 오디오 객체 생성 및 속성 설정
				const audio = document.createElement('audio');
				audio.setAttribute('controls', '');
	
				// 3. 컨테이너에 오디오 연결
				clipContainer.appendChild(audio);				
				
				// sound-clips영역에 오디오 태그 출력
				// - 이전에 녹음때 추가한 childNode가 존재한다면 제거하고 출력
				if(soundClips.hasChildNodes())
					soundClips.removeChild(soundClips.childNodes[0]);
					
				soundClips.appendChild(clipContainer);
				
				// chunks에 저장된 녹음 데이터를 오디오 양식을 설정
				const blob = new Blob(chunks, {
					'type': 'audio/mp3 codecs=opus'
				})
				
				// chunks 초기화
				// - 초기화 안 하면, 녹음 내용이 누적 저장됨
				chunks = [];
				
				// 오디오 소스 지정
				const audioURL = URL.createObjectURL(blob);
				audio.src = audioURL;
				
				// 4. 녹음 내용을 파일로 저장
				const clipName = 'voiceRecord';
				
				const a = document.createElement('a');
				clipContainer.appendChild(a);
				a.href = audio.src;
				
				a.download = clipName;
				a.click(); // 자동으로 다운로드 되도록 클릭 이벤트 발생 
				
			}
			
			// 녹음 시작상태가 되면, chunks에 녹음 데이터 저장
			mediaRecorder.ondataavailable = e => {
				chunks.push(e.data);
			}
		})
		.catch(err => {
			console.log("오류 발생: " + err)
		})
	}
});