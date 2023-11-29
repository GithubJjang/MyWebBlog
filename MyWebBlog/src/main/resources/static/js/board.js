
let index = {
	init: function() {
		$("#btn-board-save").on("click", () => {

			this.save();
		});
			
	},
	save: function() {
		var form = new FormData();
		
		const title = document.getElementById("title").value;
		const content = document.getElementById("content").value;
		var fileInput = document.querySelector("#fileInput");
		form.append('title',title);
		form.append('content',content);
		// 선택된 파일이 있는지 확인
		if (fileInput.files.length > 0) {
			// FormData에 파일 추가
			form.append('file', fileInput.files[0]); // 'file'은 서버에서 해당 파일을 식별하는 키입니다.
		}

		console.log(form);
		for (var pair of form.entries()) {
                console.log(pair[0]+ ', ' + pair[1]); 
            }

	
		
		
		$.ajax({
			// 회원가입 수행 요청. 정상 -> done, 실패 -> fail/ try-catch같은 느낌
			type:"POST",
			url:"/api/board/writeProc",
			data: form,
			processData: false,
			contentType: false,
		}).done(function(resp){
			alert("글쓰기 완료");// resp에 1이 리턴된다.
			console.log(resp);
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error))
		});// ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여  insert 요청을 한다.
	}

}

index.init(); // init 함수 호출