<!DOCTYPE html>
<html>
<head>
	<meta charset="${requestCharset!"utf-8"}">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<meta name="format-detection" content="telephone=no">
	<meta name="author" content="SHOPEC Team">
	<meta name="copyright" content="SHOPEC">
	<title>${message("shop.payment.pay")}[#if showPowered] - Powered By SHOPEC[/#if]</title>
	<link href="${base}/favicon.ico" rel="icon">
	<script src="${base}/resources/common/js/jquery.js"></script>
	[#noautoesc]
		[#escape x as x?js_string]
			<script>
			$().ready(function() {
				
				var $payForm = $("#payForm");
				
				// 表单提交
				$payForm.submit();
			
			});
			</script>
		[/#escape]
	[/#noautoesc]
</head>
<body>
	<form id="payForm" action="${requestUrl}" method="${requestMethod!"get"}"[#if requestCharset?has_content] accept-charset="${requestCharset}"[/#if]>
		[#list parameterMap.entrySet() as entry]
			<input name="${entry.key}" type="hidden" value="${entry.value}">
		[/#list]
	</form>
</body>
</html>