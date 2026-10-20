; European Union Public License version 1.2
; Copyright © 2025 Rick Beerendonk

; Explicit type
(def explicit 123)

; Implicit type
(def implicit 456)

(println (type explicit)) ; java.lang.Long
(println (type implicit)) ; java.lang.Long

; Error: Can't change/establish root binding of: explicit with set
;(set! explicit implicit)