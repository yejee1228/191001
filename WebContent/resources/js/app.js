var app = (()=>{
	return {
		init : (ctx)=>{
			playerService.login();
			$('#a_join').click(()=>{
				alert('회원가입 이동!');
				location.assign(ctx+'/facade.do?action=move&folder=facade&page=join');
			});
			$('#back_page').click(()=>{
				alert('뒤로이동');
				location.assign(ctx+'/facade.do?action=move&folder=facade&page=login');
			});
			$('#join').submit(()=>{
				alert('회원가입 완료');
				$('#join').attr('action','/jee-soccer/player.do');
				$('#join').submit();
			});
			
			$('#btn2').click(()=>{
				alert('클릭');
				location.assign('${ctx}/player.do?action=find2&page=2_positions');
			});
			$('#btn4').submit(()=>{
				alert('클릭');
			});
			
		}
	};
})(); 
var user = (()=>{
	var _player, _playerName, _teamId, _ePlayerName, _nickname, _joinYyyy, _position, _backNo, _nation,
	_birthDate, _solar, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}	
	return {
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();
var playerService = (()=>{
	return {
		login :()=>{
			$('#login_btn').click(()=>{
				if($('#userName').val()===''||$('#password').val()===''){
					alert('필수값이 없습니다.')
				}else{
					alert('id: '+$('#userName').val()+'password: '+$('#password').val());
					$('#login_form').attr('action','/jee-soccer/player.do');
					$('#login_form').submit();
				}
			});
		}
	};
})();

