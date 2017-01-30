; Return average of numbers
(defn find-average [numbers]
  (float (/ (reduce + numbers) (count numbers))))
