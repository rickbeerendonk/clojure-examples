; European Union Public License version 1.2
; Copyright © 2025 Rick Beerendonk

; Clojure infers each value's type; both literals are java.lang.Long.
(def number 123)

(println (type number)) ; java.lang.Long

; Error: Can't change/establish root binding of: first-number with set
;(set! number 456)