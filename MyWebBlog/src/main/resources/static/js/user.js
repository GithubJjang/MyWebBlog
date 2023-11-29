
let index = {
	init: function() {
		$("#btn-user-sign").on("click", () => {

			this.save();
		});
			
	},
	save: function() {

		const username = document.getElementById("init_username").value;
		const password = document.getElementById("init_password").value;
		const email = document.getElementById("init_email").value;
		let data = {
			username:username,
			password:password,
			email:email
		};
	
		console.log(data);
		
		$.ajax({
			// 회원가입 수행 요청. 정상 -> done, 실패 -> fail/ try-catch같은 느낌
			type:"POST",
			url:"/api/user/joinProc",
			// 아래 두개 코드는 세트임!
			data:JSON.stringify(data),//전달할 파라미터
			contentType:"application/json; charset=utf-8", //서버로 데이터를 보낼때에 어떤타입으로 보낼것인지를 지정합니다.  
			//dataType:"json" //클라이언트 -> 서버 (서버에서 반환되는 형식)
			//dataType을 알아서 지정하도록 한다.
		}).done(function(resp){
			alert("회원가입이 완료되었습니다.");// resp에 1이 리턴된다.
			console.log(resp);
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error))
		});// ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여  insert 요청을 한다.
	}

}

index.init(); // init 함수 호출