function getParam(key) {
				
	//返回当前url
	var url = location.href;
	
	//截取？之后的内容
	var index = url.indexOf('?');				
	url = url.substr(index + 1);
	
	//分解字符串形成数组
	var params = url.split('&');
	
	for (var i = 0;i < params.length;i ++) {
		var ss = params[i].split('=');
		
		if (ss[0] == key)
			return ss[1];
	}								
}
function getParam2(key2) {
				
	//返回当前url
	var url2 = location.href;
	
	//截取？之后的内容
	var index2 = url2.indexOf('?');				
	url2 = url2.substr(index2 + 1);
	
	//分解字符串形成数组
	var params2 = url2.split('&');
	
	for (var i = 0;i < params2.length;i ++) {
		var ss2 = params2[i].split('=');
		
		if (ss2[0] == key2)
			return ss2[1];
	}								
}