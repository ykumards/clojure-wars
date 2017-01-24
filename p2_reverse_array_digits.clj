; Convert number to reversed array of digits

; Example:
; 348597 => [7,9,5,8,4,3]

(defn digitize [n]
	(if (< n 10)
		[n]
		(cons (mod n 10) (digitize (quot n 10)))))