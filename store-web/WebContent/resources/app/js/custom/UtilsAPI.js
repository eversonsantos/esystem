/**
 * 
 */
	var geraMatricula = function(entity, i){
		var matricula = entity+'-';
		if (i >= 0 && i <= 9) {
				return matricula+'000'+(i+1);
		}
	}
	
	displayMensagem = function(tipo, titulo, msg){
		if( tipo > 4) return;
		switch (tipo) {
			case 1:
				Lobibox.notify('success', {
					delay: 3000,
					delayIndicator: false,
					title: titulo,
					showClass: 'jumpUp',
					hideClass: 'zoomOut',
					position: 'bottom right', //or 'center bottom'
					msg: msg
				});
				break;
			
			case 2:
				Lobibox.notify('warning', {
					delay: 3000,
					delayIndicator: false,
					title: titulo,
					showClass: 'jumpUp',
					hideClass: 'zoomOut',
					position: 'bottom right', //or 'center bottom'
					msg: msg
				});
				break;
			
			case 3:
				Lobibox.notify('danger', {
					delay: 3000,
					delayIndicator: false,
					title: titulo,
					showClass: 'jumpUp',
					hideClass: 'zoomOut',
					position: 'bottom right', //or 'center bottom'
					msg: msg
				});
				break;
	
			default:
				break;
			}
		
	}
	
	var findElementById = function(id){
		return document.getElementById(id);
	}
	
	var validaSequenciaNumerica = function(cep){
		var validacep = /^[0-9]{8}$/;
		if(validacep.test(cep)){
			return true;
		}
		return false;
	}
