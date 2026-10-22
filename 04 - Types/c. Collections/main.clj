; European Union Public License version 1.2
; Copyright © 2026 Rick Beerendonk

(doseq [collection [(list "Oslo" "Bergen")
                    ["Oslo" "Bergen"]
                    {:city "Oslo" :celsius 18}
                    #{"Oslo" "Bergen"}]]
  (println collection "=" (type collection)))

; (Oslo Bergen) = clojure.lang.PersistentList
; [Oslo Bergen] = clojure.lang.PersistentVector
; {:city Oslo, :celsius 18} = clojure.lang.PersistentArrayMap
; #{Bergen Oslo} = clojure.lang.PersistentHashSet