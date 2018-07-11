var key = CryptoJS.enc.Utf8.parse("201807sslearning");
//CBC加密
var options = {
    iv: CryptoJS.enc.Utf8.parse("201807sslearning"),
    mode: CryptoJS.mode.CBC,
    padding: CryptoJS.pad.Pkcs7
}

//AES加密
function cbcAesEncrypt(text){
	var encryptedData = CryptoJS.AES.encrypt(text, key, options);
	var encryptedBase64Str = encryptedData.toString();
	console.log('加密后结果', encryptedBase64Str);
	return encryptedBase64Str;
}

//AES解密
function cbcAesDecrypt(encryptedBase64Str){
	var decryptedData = CryptoJS.AES.decrypt(encryptedBase64Str, key, options);
	// 解密后，需要按照Utf8的方式将明文转位字符串
	var decryptedStr = decryptedData.toString(CryptoJS.enc.Utf8);
	console.log('decryptedStr', decryptedStr);
	return decryptedStr;
}

