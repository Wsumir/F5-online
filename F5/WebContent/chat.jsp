<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 1000px;">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChatRoom</title>
<link rel="stylesheet" href="css/styleBG1.css">
<script type="text/javascript" src="jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	var username = '${sessionScope.username}';
	var ws;
	var url = "ws://192.168.17.80:7777/F5/chat?username=" + username;

	window.onload = function() {
		if ('WebSocket' in window) {
			ws = new WebSocket(url);
		} else if ('MozWebSocket' in window) {
			ws = new MozWebSocket(url);
		} else {
			alert('WebSocket is not supported by this browser.');
			return;
		}
		ws.onmessage = function(event) {

			eval("var msg=" + event.data + ";");
			console.info(msg);

			if (undefined != msg.Welcome)
				$("#content").append(msg.Welcome);
			if (undefined != msg.usernames) {

				$("#userList").html("");
				$(msg.usernames).each(function() {

					$("#userList").append(this + "<br>")
				});

			}

			if (undefined != content) {
				$("#content").append(msg.content);
			}

		}

	}

	function subSend() {

		var val = $("#msg").val();
		ws.send(val);
		$("#msg").val("");
	}

	document.onkeydown = function(event) {
		e = event ? event : (window.event ? window.event : null);
		if (e.keyCode == 13) {
			subSend();
		}
	}
</script>

</head>

<body>
<a href="index.html">DLNU-OA</a>



	<div id="bor" style="margin-left: 550px;">

		<div id="container"
			style="border: 1px solid black; width: 700px; height: 700px; float: left;">

			<div id="content" style="height: 650px;"></div>

			<div style="border-top: 1px solid black; width: 700px; height: 50px;">
				<input id="msg" />
				<button onclick="subSend();">send</button>
			</div>

		</div>

		<div id="userList"
			style="border: 1px solid black; width: 100px; height: 700px; float: left;"></div>

	</div>

	<div class="text"></div>




</body>

</html>