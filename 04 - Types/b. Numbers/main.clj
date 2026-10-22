; European Union Public License version 1.2
; Copyright © 2026 Rick Beerendonk

(doseq [value [18 18N 18.5 18M 2/3]]
  (println value "=" (type value)))

; 18 = java.lang.Long
; 18N = clojure.lang.BigInt
; 18.5 = java.lang.Double
; 18M = java.math.BigDecimal
; 2/3 = clojure.lang.Ratio
