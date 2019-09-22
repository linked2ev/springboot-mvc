function getStr (obj) {
	if (typeof obj === 'undefined' || obj === null) {
		return '';
	} else {
		return obj;
	}
}

function getDefStr (obj, def) {
	if (typeof obj === 'undefined' || obj === null || obj === '') {
		return def;
	} else {
		return obj;
	}
}