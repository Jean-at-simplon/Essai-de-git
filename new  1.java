public int paques(int year) {
	int A = year Mod 19;
	int B = year Mod 4;
	int C = year Mod 7;
	String paques;
	D = ((A * 19) + 24) Mod 30;
	If (D = 29) {
		 D = 28;
	}
	If (D = 28 && A > 10) {
		D = 27;
	}
	E = ((2 * B) + (4 * C) + (6 * D) + 5) Mod 7;
	
	If (D + E >= 10) { 
		paques = (D + E - 9) + "/04/" + year; 
		} else { 
		paques = (22 + D + E) + "/03/" + year;
	}
return paques