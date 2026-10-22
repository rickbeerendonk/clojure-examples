; European Union Public License version 1.2
; Copyright © 2026 Rick Beerendonk

(doseq [value [true false nil 18 18.5 2/3 \A "Oslo" :city 'city]]
  (println value "=" (type value)))

; true = java.lang.Boolean
; false = java.lang.Boolean
; nil = nil
; 18 = java.lang.Long
; 18.5 = java.lang.Double
; 2/3 = clojure.lang.Ratio
; A = java.lang.Character
; Oslo = java.lang.String
; :city = clojure.lang.Keyword
; city = clojure.lang.Symbol
