; European Union Public License version 1.2
; Copyright © 2026 Rick Beerendonk

; To get the docstring for the function, use the following in the REPL:
;   (doc celsius-to-fahrenheit)
; To get the docstring programmatically, use the meta function with the :doc key
;   (meta #'celsius-to-fahrenheit) => {:doc "Convert a temperature from Celsius to Fahrenheit."}
(defn celsius-to-fahrenheit
  "Convert a temperature from Celsius to Fahrenheit."
  [celsius]
  (+ (* celsius 9/5) 32))

(println (celsius-to-fahrenheit 18))     ; 322/5
(println (meta #'celsius-to-fahrenheit)) ; {:doc "Convert a temperature from Celsius to Fahrenheit."}